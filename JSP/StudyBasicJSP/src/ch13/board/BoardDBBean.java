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


public class BoardDBBean {

	private static BoardDBBean instance = new BoardDBBean();
	
	public static BoardDBBean getInstance(){
		return instance;
	}
	
	private BoardDBBean(){}
	
	//get Connection object from connection pool.
	private Connection getConnection() throws Exception{
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
			
			if(num != 0){
				sql = "UPDATE board SET re_step = re_step+1";
				sql += "where ref = ? and re_step > ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, ref);
				pstmt.setInt(2, re_step);
				pstmt.executeUpdate();
				re_step++;
				re_level++;
			}else{
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
		
			pstmt.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(rs != null) try{rs.close();}catch(SQLException e){}
			if(pstmt != null) try{pstmt.close();}catch(SQLException e){}
			if(conn != null) try{conn.close();}catch(SQLException e){}
		}		
	}
	/*
	public int getArticleCount() throws Exception{
		Connection conn;
		
		try{
			
		}catch(Exception e){
			
		}finally{
			
		}
	}
	
	public List<BoardDataBean> getArticles(int start,int end) throws Exception{
		Connection conn;
		
		try{
			
		}catch(Exception e){
			
		}finally{
			
		}
	}
	
	public BoardDataBean getArticle(int num) throws Exception{
		Connection conn;
		
		try{
			
		}catch(Exception e){
			
		}finally{
			
		}
	}
	
	public BoardDataBean updateGetArticle(int num) throws Exception{

		Connection conn;
		
		try{
			
		}catch(Exception e){
			
		}finally{
			
		}
	}
	public int updateArticle(BoardDataBean article){
		Connection conn;
		
		try{
			
		}catch(Exception e){
			
		}finally{
			
		}
		
	}
	
	public int deleteArticle(int num,String passwd) throws Exception{
		Connection conn;
		
		try{
			
		}catch(Exception e){
			
		}finally{
			
		}
		
	}
	*/
}