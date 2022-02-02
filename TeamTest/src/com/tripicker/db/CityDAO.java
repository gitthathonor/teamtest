package com.tripicker.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class CityDAO {
	
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private String sql = "";
	
	
	////////////////////////DAO 공통 메서드//////////////////////////////////////////////////
	
	
	// getCon() : DB 연결 메서드 
	private Connection getCon() {
		
		try {
			Context initCTX = new InitialContext();
			DataSource ds = (DataSource)initCTX.lookup("java:comp/env/jdbc/mysqldb");
			con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DAO : DB 연결 실패!");
		}
		System.out.println("DAO : DB 연결 성공!");
		
		return con;
		
	} //getCon() : DB 연결 메서드
	
	
	//closeDB() : 자원해제 메서드
	public void closeDB() {
		try {
			if(rs != null) {
				rs.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}
			if(con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DAO : 자원해제 오류!");
		}
	}//closeDB() : 자원해제 메서드
	
	
	////////////////////////DAO 공통 메서드//////////////////////////////////////////////////
	
	public void insertCity(CityDTO cdto) {
		con = getCon();
		sql = "insert into city(cityCode,cityName,cityEngName,cityInfo,cityImgUrl)"
				+ "values(?,?,?,?,?)";
		
		
		
	}
	
	

}
