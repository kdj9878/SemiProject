package com.team2.hc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

//DB관련 작업을 할때 매번 연결코드를 쓴 이후 작업 해옴.

//AOP
public class DBManager {

 public static Connection connect() throws NamingException, SQLException {
	 //context.xml
	 Context ctx = new InitialContext();
	 
	 //ex)튜브 대여소  Connection 대여소
	 DataSource ds = (DataSource)ctx.lookup("java:comp/env/kdj");
  return ds.getConnection();
}
 
	//프로젝트 -> 코드 -> 배포 -> 서비스 시작 
    
	//튜브 대여소 생각. 요청하면 그제서야 바람불고 줌(기존)
 	//DB서버에 연결 요청하면 준비해놓은 커넥션(튜브) 바로 줌(추가내용)
 
	
	
	//DB작업시엔 어쩃든 연결 해야됨
/*	public static Connection connect() throws SQLException {
		String url = "jdbc:oracle:thin:@10.211.55.3:1521:xe";
		try {
			return DriverManager.getConnection(url,"jy","jy");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}*/
	public static void close(Connection con , PreparedStatement pstmt, ResultSet rs){
	try {
		rs.close();
	} catch (Exception e) {
	}	try {
		pstmt.close();
	} catch (Exception e) {
	}try {
		con.close();
	} catch (Exception e) {
	}
		
		
	}
	public static void main(String[] args) {
		
	}
		
	}

