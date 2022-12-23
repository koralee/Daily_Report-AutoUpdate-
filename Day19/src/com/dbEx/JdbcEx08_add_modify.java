package com.dbEx;

import java.sql.*;

public class JdbcEx08_add_modify {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		/*
		 * transaction : 논리적인 작업단위 insert, delete, update 등의 작업들을 하나의 논리적인 작업단위로 묶어서 퀴리
		 * 실행시 모든 작업이 정상적으로 처리된 경우에는 commit을 실행해서 DB에 반영하고, 쿼리 실행중 하나라도 정상처리가 되지 않을 경우
		 * rollback을 실행해서 작업 단위 내의 모든 작업을 취소한다.
		 */

		// Query문 작성
		// insert
		String sql1 = "insert into department values(?,?,?,?)";
		// update(modify)
		String sql2 = "update department set dname=?, loc=? where deptno=?";

		try {
			// DB연결
			///////////////////////// 하나의 논리적인 작업단위 시작///////////////////////
			// 하나의 논리적인 작업 단위 시작
			conn = ConnectionUtil.getConnection();

			// autoCommit 기능을 비활성화
			conn.setAutoCommit(false);

			// ---------------------추가작업 (첫 번째 작업의 시작)-------------------------
			pstmt = conn.prepareStatement(sql1);
			pstmt.setInt(1, 255);
			pstmt.setString(2, "핵물리학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "9호관");
			pstmt.executeUpdate();
			// ---------------------추가작업 (첫 번째 작업의 끝)---------------------------
			// =========================================
			// ---------------------추가작업 (두 번째 작업의 시작)-------------------------
			pstmt = conn.prepareStatement(sql2);
			pstmt.setString(1, "생명공학과");
			pstmt.setString(2, "8호관");
			pstmt.setInt(3, 255);
			pstmt.executeUpdate();
			// ---------------------추가작업 (두 번째 작업의 끝)-------------------------

			// 쿼리가 정상적으로 실행된 경우에 DB에 반영한다.
			conn.commit();
			System.out.println("DB에 정상적으로 반영되었습니다.");

		} catch (SQLException se) {
			try {
				conn.rollback();
				System.out.println("DB에 비정작적인 작업으로 취소 되었습니다.");
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
		} finally {
			try {
				if (conn != null)
					// 6단계
					conn.close();
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
	}

}
