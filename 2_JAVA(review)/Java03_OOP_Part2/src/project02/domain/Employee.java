package project02.domain;

import java.time.LocalDate;

public class Employee {
	
	private int empId;			// 사원ID (sequence로 자동으로)
	private String empName;		// 사원명
	private LocalDate hireDate; // 입사일
	
	public Employee(String empName, LocalDate hireDate) {
		this.empName = empName;
		this.hireDate = hireDate;
	}

	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	@Override
	public String toString() {
		return String.format("%d %s %s", empId, empName, hireDate);
	}
}
