package project02.presentation.employee;

import java.time.LocalDate;
import java.util.List;

import project02.domain.Code;
import project02.domain.Employee;
import project02.presentation.Console;
import project02.service.employee.EmployeeService;

public class EmployeeIo {
	
	private EmployeeService empService; // Has-A 관계
	private String[] menuItem;
	private String menu;
	
	public EmployeeIo(EmployeeService empService, String[] menuItem) { // DI
		this.empService = empService;
		this.menuItem = menuItem;
		this.menu = Console.menu(menuItem);
	}

	public void play() {
		int choice = 0;
		while ((choice = Console.choose(menu, menuItem.length)) != 0) {
			switch (choice) {
			case Code.LIST: this.listEmployees(); break;
			case Code.ADD: this.addEmployee(); break;
			case Code.MOD: this.modEmployee(); break;
			case Code.DEL: this.delEmployee();
			}
		}
	}

	private void listEmployees() {
		List<Employee> empList = empService.listEmployees();
		
		System.out.println("ID  이름  입사일");
		System.out.println("---------------");
		if (empList.size() != 0)
			for (Employee emp : empList) Console.info(emp);
		else Console.info("사원이 없습니다.");
	}

	private void addEmployee() {
		String empName = Console.inStr("사원의 이름을 입력하세요.");
		
		if (!empName.equals("0")) {
			LocalDate hiredDate = Console.inDate("입사일을 입력하세요.");
			
			if (empService.addEmployee(new Employee(empName, hiredDate)))
				Console.success("사원 추가");
			else Console.fail("사원 추가");
		} else Console.info("사원 추가를 취소합니다."); // empName이 0일 때
	}

	private void modEmployee() {
		if (empService.listEmployees().size() != 0) {
			Employee emp = null;
			
			do {
				int empId = Console.inNum("수정할 사원 ID를 입력하세요.");
				if (empId == 0) {
					Console.info("사원 수정을 취소합니다.");
					return;
				}
				
				emp = empService.findEmployee(empId);
				if (emp == null) Console.err("입력한 ID의 사원이 없습니다.");
			} while(emp == null);
			
			emp.setEmpName(Console.inStr("사원 이름을 입력하세요."));
			emp.setHireDate(Console.inDate("입사일을 입력하세요."));
			
			if (empService.modEmployee(emp)) Console.success("사원 수정");
			else Console.fail("사원 수정");
		} else Console.info("사원이 없습니다.");
	}

	private void delEmployee() {
		if (empService.listEmployees().size() != 0) {
			Employee emp = null;
			int empId = 0;
			
			do {
				empId = Console.inNum("삭제할 사원 ID를 입력하세요.");
				if (empId == 0) {
					Console.info("사원 삭제를 취소합니다.");
					return;
				}
				
				emp = empService.findEmployee(empId);
				if (emp == null) Console.err("입력한 ID의 사원이 없습니다.");
			} while(emp == null);
			
			if (empService.delEmployee(empId)) Console.success("사원 삭제");
			else Console.fail("사원 삭제");
		} else Console.info("사원이 없습니다.");
	}
}
