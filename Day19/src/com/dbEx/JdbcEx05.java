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

public class JdbcEx05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
