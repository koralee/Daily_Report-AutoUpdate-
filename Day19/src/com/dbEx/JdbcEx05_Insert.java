package com.dbEx;

/*
 * 	PreparedStatement는 SQL의 형태는 통일하나 조건이나 변수값이
 * 	다른 문장을 바인딩 변수를 사용해서 변수 처리함으로써 항상 동일한 SQL문을
 * 	동일하게 처리하게 할 수 있다.
 * 
 * 	바인딩 변수( ? )
 * 바인딩 변수는 실제 값으로 대체될 부분에 사용하는 변수(==공간)이다.
 * 
 *	String sql = "insert int department values(?,?,?,?)";
 *	PreparedStatement pstmt = conn.prepareStatement(sql);
 *
 *
 *	바인딩 변수의 개수만큼 순서대로 해당 변수와 대체될 값을 지정해준다.
 * pstmt.setInt(1, 203);
 * pstmt.setString(2, "제어계측공학과");
 * pstmt.setInt(3, 200);
 * pstmt.setString(4, "7호관);
 * 
 * PreparedStatement는 PreparedStatement의 바인딩 변수에 값을 지정해주는 setXXX( N , S )메소드를 제공해준다.
 */

import java.sql.*;
public class JdbcEx05_Insert {
	public static void main(String[] args) {

			Connection conn = null;
			PreparedStatement pstmt = null;
			
			//동적 쿼리문 작성
			String sql = "insert into professor values(?,?,?,?,?,sysdate,?,?)";
			
			try {
				//DB연결
				conn = ConnectionUtil.getConnection();
				
				//쿼리문 실행
				pstmt = conn.prepareStatement(sql);
				
				//바인딩변수 설정
				pstmt.setInt(1, 9930); //교수번호
				pstmt.setString(2, "수길동");
				pstmt.setString(3, "SuGilDong");
				pstmt.setString(4, "부임교수");
				pstmt.setInt(5, 300);
				pstmt.setInt(6, 30);
				pstmt.setInt(7, 204);
				
				int i = pstmt.executeUpdate();
				System.out.println(i+" 개의 행이 추가 되었습니다.");
				
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
