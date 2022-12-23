package com.dbEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcEx06_Update {
	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		
		//동적 쿼리문 작성
		String sql = "update professor set sal=? where name=?";
		
		try {
			//DB연결
			conn = ConnectionUtil.getConnection();
			
			//쿼리문 실행
			pstmt = conn.prepareStatement(sql);
			
			//바인딩변수 설정
			pstmt.setInt(1, 500);
			pstmt.setString(2, "홍길동");
			int i = pstmt.executeUpdate();
			System.out.println(i+" 개의 행이 수정 되었습니다.");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
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
