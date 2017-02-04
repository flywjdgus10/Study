<%@ page language="java" contentType="text/html; charser=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	</head>
	<body>
		<%
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		String name = request.getParameter("name");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			String jdbcUrl = "jdbc:mysql://localhost:3306/basicjsp";
			String dbId = "jspid";
			String dbPass = "jsppass";
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(jdbcUrl,dbId,dbPass);
			
			String sql = "select id,passwd from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			
			if(rs.next()){
				String rId = rs.getString("id");
				String rPasswd = rs.getString("passwd");
				if(id.equals(rId) && passwd.equals(rPasswd)){
					sql = "update member set name = ? where id = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, name);
					pstmt.setString(2, id);
					pstmt.executeUpdate();
					%>
					
					record is updated successfully in member table.
					
					<%
				}
				else{
					out.println("record updating in member table is failed.");
				}
				

			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(rs != null)
				try{
					rs.close();
				}catch(SQLException sqle){					
				}
			if(conn != null)
				try{
					conn.close();
				}catch(SQLException sqle){					
				}
			if(pstmt != null)
				try{
					pstmt.close();
				}catch(SQLException sqle){					
				}
		}
		%>
	</body>
</html>