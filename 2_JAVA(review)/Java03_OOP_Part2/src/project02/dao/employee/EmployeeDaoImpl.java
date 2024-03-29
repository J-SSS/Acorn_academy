package project02.dao.employee;

import java.util.List;

import project02.domain.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	// field
	private List<Employee> empList; // Has-A 관계. DB 대체
	private int empIdSeq;			// 사원번호를 1씩 증가
	
	// constructor
	public EmployeeDaoImpl(List<Employee> empList) { // DI
		this.empList = empList;
		empIdSeq = 1;
	}
	
	// method
	@Override
	public List<Employee> getEmployees() {
		return empList;
	}

	@Override
	public Employee getEmployee(int empId) {
		Employee emp = null;
		
		for (Employee temp : empList) {
			if (temp.getEmpId() == empId) {
				emp = temp;
				break;
			}
		}
		return emp;
	}

	@Override
	public boolean insertEmployee(Employee emp) {
		emp.setEmpId(empIdSeq++);
		return empList.add(emp);
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		Employee employee = null;
		
		for (Employee temp : empList) {
			if (temp.getEmpId() == emp.getEmpId()) {
				employee = temp;
				break;
			}
		}
		
		employee.setEmpName(emp.getEmpName());
		employee.setHireDate(emp.getHireDate());
		
		return true;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		boolean isDel = false;
		Employee emp = null;
		
		for (int i=0; i<empList.size(); i++) {
			emp = empList.get(i);
			if (emp.getEmpId() == empId) {
				isDel = empList.remove(emp);
				break;
			}
		}
		
		return isDel;
	}
}
