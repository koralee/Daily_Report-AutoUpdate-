package com.project;

/*
 * 		DAO(= Data Access Object)
 * 
 * 		신규사원 등록
 * 		getEmployeeRegist();
 * 
 * 		사원정보 조회(번호, 이름)
 * 		getEmployeeCheck();
 * 
 *  	사원정보 조회(번호)
 * 		getEmployeeNo();
 *  
 *  	사원정보 조회(이름)
 * 		getEmployeeName();
 * 
 * 		전체사원 조회
 * 		getEmployeeTotal();
 */

import java.sql.*;
import java.util.*;

public class EmployeeDAO {

	// 새로운 사원 등록!
	public EmployeeVO getEmployeeRegist(EmployeeVO evo) throws Exception {

		// 사원등록을 위한 sql문 작성
		String dml = "insert into employee(no, name, jobGrade, department, email) values(employee_seq.nextval,?,?,?,?)";
		// 시퀀스로 인해 no는 추가되면 자동으로 증가
		Connection con = null;
		PreparedStatement pstmt = null;
		EmployeeVO retval = null;

		try {
			con = DBUtil.getConnection();

			pstmt = con.prepareStatement(dml);
			pstmt.setString(1, evo.getName());
			pstmt.setString(2, evo.getJobGrade());
			pstmt.setInt(3, evo.getDepartment());
			pstmt.setString(4, evo.getEmail());

			int i = pstmt.executeUpdate();
			retval = new EmployeeVO();
			retval.setStatus(i + "");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					// 6단계
					con.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
			try {
				if (pstmt != null)
					// 6단계
					pstmt.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
		}
		return retval;
	}// End getEmployeeRegist()

	// 사원정보 조회(번호, 이름)
	public EmployeeVO getEmployeeCheck(int no, String name) throws Exception {

		String dml = "select * from employee where no =? and name =?";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO retval = null;

		try {
			con = DBUtil.getConnection();

			pstmt = con.prepareStatement(dml);
			pstmt.setInt(1, no);
			pstmt.setString(2, name);

			rs = pstmt.executeQuery(); // select 문!이므로

			if (rs.next()) {
				retval = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					// 6단계
					con.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
			try {
				if (pstmt != null)
					// 6단계
					pstmt.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
			try {
				if (rs != null)
					// 6단계
					rs.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
		}
		return retval;
	} // End getEmployeeCheck()

	// 사원정보 조회(번호)
	public EmployeeVO getEmployeeNo(int no) throws Exception {

		String dml = "select * from employee where no =?";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO retval = null;

		try {
			con = DBUtil.getConnection();

			pstmt = con.prepareStatement(dml);
			pstmt.setInt(1, no);

			rs = pstmt.executeQuery(); // select 문!이므로

			if (rs.next()) {
				retval = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					// 6단계
					con.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
			try {
				if (pstmt != null)
					// 6단계
					pstmt.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
			try {
				if (rs != null)
					// 6단계
					rs.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
		}
		return retval;
	} // end getEmployeeNo()

	// 사원정보 조회(이름)
	public EmployeeVO getEmployeeName(String name) throws Exception {

		String dml = "select * from employee where name =?";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO retval = null;

		try {
			con = DBUtil.getConnection();

			pstmt = con.prepareStatement(dml);
			pstmt.setString(1, name);

			rs = pstmt.executeQuery(); // select 문!이므로

			if (rs.next()) {
				retval = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					// 6단계
					con.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
			try {
				if (pstmt != null)
					// 6단계
					pstmt.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
			try {
				if (rs != null)
					// 6단계
					rs.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
		}
		return retval;
	} // end getEmployeeName()

	// 전체사원조회
	public ArrayList<EmployeeVO> getEmployeeTotal() {

		ArrayList<EmployeeVO> list = new ArrayList<>();

		String dml = "select  *  from employee";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO emVO = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(dml);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				emVO = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
				list.add(emVO);
			}

			System.out.println("DB연결 성공!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					// 6단계
					con.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
			try {
				if (pstmt != null)
					// 6단계
					pstmt.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
			try {
				if (rs != null)
					// 6단계
					rs.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
		}
		return list;
	}// End getEmployeeTotal();

	public ArrayList<String> getColumnName() {

		ArrayList<String> ColumnName = new ArrayList<>();

		String dml = "select * from employee";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;

		try {

			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(dml);
			rs = pstmt.executeQuery();
			rsmd = rs.getMetaData();

			int cols = rsmd.getColumnCount();

			for (int i = 1; i <= cols; i++) {
				ColumnName.add(rsmd.getCatalogName(i));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					// 6단계
					con.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
			try {
				if (pstmt != null)
					// 6단계
					pstmt.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
			try {
				if (rs != null)
					// 6단계
					rs.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
		}
		return ColumnName;
	}

}
