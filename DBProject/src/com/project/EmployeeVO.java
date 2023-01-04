package com.project;

/*
 * 		vo클래스
 * 			- 데이터를 담는 컨테이너 역할을 하는 클래스
 * 			- 테이터 전달을 목적으로 만들어진 클래스
 * 			- 입출력 정보를 전달하는 역할을 수행한다.
 * 			- 속성(필드), setter, getter 로 구성되어 있음.
 */

public class EmployeeVO {

	// 필드 선언
	private int no;
	private int department;
	private String jobGrade;
	private String name;
	private String email;
	private String status;

	public EmployeeVO() {
	}// 기본 생성자

	public EmployeeVO(int no, String jobGrade, String name, int department, String email) {
		this.no = no;
		this.name = name;
		this.department = department;
		this.jobGrade = jobGrade;
		this.email = email;
	}

	public EmployeeVO(int no, String jobGrade, String name, int department, String email, String status) {
		this.no = no;
		this.name = name;
		this.department = department;
		this.jobGrade = jobGrade;
		this.email = email;
		this.status = status;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public String getJobGrade() {
		return jobGrade;
	}

	public void setJobGrade(String jobGrade) {
		this.jobGrade = jobGrade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {

		return getNo() + ", " + getName();
	}
}
