package project02.dao.employee;

import java.util.List;

import project02.domain.Employee;

public interface EmployeeDao {
	
	List<Employee> getEmployees();		   // 사원 목록 조회
	Employee getEmployee(int empId);	   // 사원 1명 조회
	
	boolean insertEmployee(Employee emp);  // 사원 1명 등록
	boolean updateEmployee(Employee emp);  // 사원 1명 수정
	boolean deleteEmployee(int empId);	   // 사원 1명 삭제
}
