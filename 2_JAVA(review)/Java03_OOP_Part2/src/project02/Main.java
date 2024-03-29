package project02;

import java.util.ArrayList;
import java.util.List;

import project02.dao.employee.EmployeeDao;
import project02.dao.employee.EmployeeDaoImpl;
import project02.domain.Employee;
import project02.presentation.employee.EmployeeIo;
import project02.service.employee.EmployeeService;
import project02.service.employee.EmployeeServiceImpl;

public class Main {
	public static void main(String[] args) {
		
		String[] empMenuItem = {"사원목록", "추가", "수정", "삭제"};
		List<Employee> empList = new ArrayList<>();  // DB 역할
		
		EmployeeDao empDao = new EmployeeDaoImpl(empList);
		EmployeeService empService = new EmployeeServiceImpl(empDao);
		EmployeeIo empIo = new EmployeeIo(empService, empMenuItem);
		
		empIo.play();
	}
}
