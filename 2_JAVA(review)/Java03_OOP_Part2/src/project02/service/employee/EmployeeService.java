package project02.service.employee;

import java.util.List;

import project02.domain.Employee;

public interface EmployeeService {
	
	List<Employee> listEmployees();		   // 사원 목록 조회
	Employee findEmployee(int empId);	   // 사원 1명 조회
	
	boolean addEmployee(Employee emp);     // 사원 1명 등록
	boolean modEmployee(Employee emp);     // 사원 1명 수정
	boolean delEmployee(int empId);	       // 사원 1명 삭제
}
