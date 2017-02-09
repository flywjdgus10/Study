package ch13.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

//data executing(logic) bean for DB
public class BoardDBBean {
	
	//To limit for only one object
	private static BoardDBBean instance = new BoardDBBean();
	private BoardDBBean(){}	
	public static BoardDBBean getInstance(){
		return instance;
	}	
	
	
	//get Connection object from connection pool.
	private Connection getConnection() throws Exception{
		//get connection object from pool
		Context initCtx = new InitialContext();
		Context envCtx = (Context)initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource)envCtx.lookup("jdbc/basicjsp");
		return ds.getConnection();
	}
	
	
	//insert article to board table 
	//This is used in writePro.jsp
	public void insertArticle(BoardDataBean article) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//get data from form, to insert in DB   
		int num = article.getNum();
		int ref = article.getRef();
		int re_step = article.getRe_step();
		int re_level = article.getRe_level();
		int number = 0;
		String sql = "";
		
		try{
			conn = getConnection();
			pstmt = conn.prepareStatement("SELECT MAX(num) FROM board");
			rs = pstmt.executeQuery();
			if(rs.next())
				number = rs.getInt(1) + 1;
			else
				number = 1;
			
			if(num != 0){//if the article is for reply.
				sql = "UPDATE board SET re_step = re_step+1";
				sql += "where ref = ? and re_step > ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, ref);
				pstmt.setInt(2, re_step);
				pstmt.executeUpdate();
				re_step++;
				re_level++;
			}else{//if the article is new one.
				ref = number;
				re_step = 0;
				re_level = 0;
			}
			
			sql = "INSERT INTO board(writer,email,subject,"
					+ "passwd,reg_date,ref,re_step,re_level,content,ip)"
					+ "VALUES(?,?,?,?,?,?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, article.getWriter());
			pstmt.setString(2, article.getEmail());
			pstmt.setString(3, article.getSubject());
			pstmt.setString(4, article.getPasswd());
			pstmt.setTimestamp(5, article.getReg_date());
			pstmt.setInt(6, ref);
			pstmt.setInt(7, re_step);
			pstmt.setInt(8, re_level);
			pstmt.setString(9, article.getContent());
			pstmt.setString(10, article.getIp());
		
			pstmt.executeUpdate();//insert
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(rs != null) try{rs.close();}catch(SQLException e){}
			if(pstmt != null) try{pstmt.close();}catch(SQLException e){}
			if(conn != null) try{conn.close();}catch(SQLException e){}
		}		
	}
	
	//get total number of articles in DB
	public int getArticleCount() throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int x=0;
		
		try{
			conn = getConnection();
			
			//query to calculate the total number of articles
			pstmt = conn.prepareStatement("SELECT COUNT(*) FROM board");
			rs = pstmt.executeQuery();
			
			if(rs.next()) x = rs.getInt(1);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(rs != null) try{rs.close();}catch(SQLException e){}
			if(pstmt != null) try{pstmt.close();}catch(SQLException e){}
			if(conn != null) try{conn.close();}catch(SQLException e){}			
		}
		return x;
	}
	
	//get the list of articles
	//The list is divided per 10 articles
	public List<BoardDataBean> getArticles(int start,int end) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<BoardDataBean> articleList = null;
		
		try{
			conn = getConnection();
			pstmt = conn.prepareStatement("SELECT * FROM board ORDER BY ref desc,re_step asc limit ?,?");
			pstmt.setInt(1, start-1);
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				articleList = new ArrayList<BoardDataBean>(end);
				do{
					BoardDataBean article = new BoardDataBean();
					article.setNum(rs.getInt("num"));
					article.setWriter(rs.getString("writer"));
					article.setEmail(rs.getString("email"));
					article.setSubject(rs.getString("subject"));
					article.setPasswd(rs.getString("passwd"));
					article.setReg_date(rs.getTimestamp("reg_date"));
					article.setReadcount(rs.getInt("readcount"));
					article.setRef(rs.getInt("ref"));
					article.setRe_step(rs.getInt("re_step"));
					article.setRe_level(rs.getInt("re_level"));
					article.setContent(rs.getString("content"));
					article.setIp(rs.getString("ip"));
					
					articleList.add(article);
					//Insert the whole articles into articleList
					//The object of list will be returned to somewhere
				}while(rs.next());
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(rs != null) try{rs.close();}catch(SQLException e){}
			if(pstmt != null) try{pstmt.close();}catch(SQLException e){}
			if(conn != null) try{conn.close();}catch(SQLException e){}				
		}
		return articleList;
	}
	
	//get the article that is called by num
	public BoardDataBean getArticle(int num) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardDataBean article = null;
		
		
		try{
			conn = getConnection();//add 1 to readcount in article, DB
			pstmt = conn.prepareStatement("UPDATE board SET readcount = readcount+1 WHERE num = ?");
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			
			pstmt = conn.prepareStatement("SELECT * FROM board WHERE num = ?");
			pstmt.setInt(1, num);//get the article
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				article = new BoardDataBean();
				article.setNum(rs.getInt("num"));
				article.setWriter(rs.getString("writer"));
				article.setEmail(rs.getString("email"));
				article.setSubject(rs.getString("subject"));
				article.setPasswd(rs.getString("passwd"));
				article.setReg_date(rs.getTimestamp("reg_date"));
				article.setReadcount(rs.getInt("readcount"));
				article.setRef(rs.getInt("ref"));
				article.setRe_step(rs.getInt("re_step"));
				article.setRe_level(rs.getInt("re_level"));
				article.setContent(rs.getString("content"));
				article.setIp(rs.getString("ip"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(rs != null) try{rs.close();}catch(SQLException e){}
			if(pstmt != null) try{pstmt.close();}catch(SQLException e){}
			if(conn != null) try{conn.close();}catch(SQLException e){}					
		}
		return article;
	}
	
	/* This function may delete because it is similar with getArticle */
	public BoardDataBean updateGetArticle(int num) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardDataBean article = null;
		
		try{
			conn = getConnection();
			pstmt = conn.prepareStatement("SELECT * FROM board WHERE num = ?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				article = new BoardDataBean();
				article.setNum(rs.getInt("num"));
				article.setWriter(rs.getString("writer"));
				article.setEmail(rs.getString("email"));
				article.setSubject(rs.getString("subject"));
				article.setPasswd(rs.getString("passwd"));
				article.setReg_date(rs.getTimestamp("reg_date"));
				article.setReadcount(rs.getInt("readcount"));
				article.setRef(rs.getInt("ref"));
				article.setRe_step(rs.getInt("re_step"));
				article.setRe_level(rs.getInt("re_level"));
				article.setContent(rs.getString("content"));
				article.setIp(rs.getString("ip"));
				
			}
		}catch(Exception e){
			
		}finally{
			if(rs != null) try{rs.close();}catch(SQLException e){}
			if(pstmt != null) try{pstmt.close();}catch(SQLException e){}
			if(conn != null) try{conn.close();}catch(SQLException e){}					
		}
		return article;
	}
	
	public int updateArticle(BoardDataBean article){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String dbpasswd="";
		String sql="";
		int x=-1;
		
		try{
			conn = getConnection();
			pstmt = conn.prepareStatement("SELECT passwd FROM board WHERE num=?");
			pstmt.setInt(1, article.getNum()); 
			rs = pstmt.executeQuery();//get the article  in DB which num is same with form's one
			//Those will be compared each other
			
			if(rs.next()){
				dbpasswd=rs.getString("passwd");
				if(dbpasswd.equals(article.getPasswd())){//Compare whether they have same password
					sql = "UPDATE board SET writer=?,email=?,subject=?,passwd=?";
					sql += ",content=? WHERE num=?";
					pstmt = conn.prepareStatement(sql);
					
					pstmt.setString(1, article.getWriter());
					pstmt.setString(2, article.getEmail());
					pstmt.setString(3, article.getSubject());
					pstmt.setString(4, article.getPasswd());
					pstmt.setString(5, article.getContent());
					pstmt.setInt(6, article.getNum());
					pstmt.executeUpdate();
					x=1;//updating was successfully completed
				}else x=0;
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(rs != null) try{rs.close();}catch(SQLException e){}
			if(pstmt != null) try{pstmt.close();}catch(SQLException e){}
			if(conn != null) try{conn.close();}catch(SQLException e){}				
		}
		return x;
	}
	
	public int deleteArticle(int num,String passwd) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String dbpasswd="";
		int x=-1;
		try{
			conn = getConnection();
			pstmt = conn.prepareStatement("SELECT passwd FROM board WHERE num=?");
			pstmt.setInt(1, num);//get the article  in DB which num is same with form's one
			rs = pstmt.executeQuery();
			if(rs.next()){
				dbpasswd = rs.getString("passwd");
				if(dbpasswd.equals(passwd)){//compare wheter the passwords are same
					pstmt = conn.prepareStatement("DELETE FROM board WHERE num=?");
					pstmt.setInt(1, num);
					pstmt.executeUpdate();
					x=1;//Deleting was successfully completed
				}else x=0;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(rs != null) try{rs.close();}catch(SQLException e){}
			if(pstmt != null) try{pstmt.close();}catch(SQLException e){}
			if(conn != null) try{conn.close();}catch(SQLException e){}				
		}
		return x;
		
	}
	
}