package project02.service.employee;

import java.util.List;

import project02.dao.employee.EmployeeDao;
import project02.domain.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	// field
	private EmployeeDao empDao;
	
	// constructor
	public EmployeeServiceImpl(EmployeeDao empDao) {
		this.empDao = empDao;
	}	
	
	// 메소드
	@Override
	public List<Employee> listEmployees() {
		return empDao.getEmployees();
	}

	@Override
	public Employee findEmployee(int empId) {
		return  empDao.getEmployee(empId);
	}

	@Override
	public boolean addEmployee(Employee emp) {
		return empDao.insertEmployee(emp);
	}

	@Override
	public boolean modEmployee(Employee emp) {
		return empDao.updateEmployee(emp);
	}

	@Override
	public boolean delEmployee(int empId) {
		return empDao.deleteEmployee(empId);
	}
}
