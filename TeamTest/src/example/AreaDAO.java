package example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class AreaDAO {
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private String sql = "";
	
	
	private Connection getCon() {
		try {
			Context initCTX = new InitialContext();
			DataSource ds = (DataSource)initCTX.lookup("java:comp/env/jdbc/mysqldb");
			con = ds.getConnection();
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("DAO : DB연결 오류!");
		} 
		
		return con;
	} //getCon() : DB 연결 메서드
	
	
	
	public void closeDB() {
		try {
			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("DAO : DB 자원해제 오류!");
		}
	} // closeDB() 자원해제 메서드
	
	public void insertArea(AreaDTO areaDTO) {
		
		try {
			con = getCon();
			sql = "insert into area(areaCode,areaName,imgUrl,areaInfo)"
					+ " values(?,?,?,?,?)";
			
			pstmt.setInt(1, areaDTO.getAreaCode());
			pstmt.setString(2, areaDTO.getAreaName());
			pstmt.setString(3, areaDTO.getAreaEngName());
			pstmt.setString(4, areaDTO.getImgUrl());
			pstmt.setString(5, areaDTO.getAreaInfo());
			
			pstmt.executeUpdate();
			
			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("DAO : insertArea() 오류!");
		} finally {
			closeDB();
		}
	} //insertArea(AreaDTO areaDTO) : 지역별 페이지 정보 넣기
	
	
	
	
	
	
}
