package ch09.abstract10;

import java.util.Scanner;

public class EmployeeManager { // 자식들을 관리하는 매니저
	private final int EMP_NUM = 100; // 100명 사원이 최대
	
	// Employee의 자식객체들을 저장
	private Employee[] empArr = new Employee[EMP_NUM];
	private int numOfEmp = 0; // 저장된 사원객체 수
	private Scanner sc = new Scanner(System.in);
	
	private int viewMenu() {
		return 0;
	}
	private RegularEmployee createRegularEmployee() {
		return null;
	}
	private TempEmployee createTempEmployee() {
		return null;
	}
	private PartTimeEmployee createPartTimeEmployee() {
		return null;
	}
	private boolean saveEmployee(Employee emp) {
		return true;
	}
	private void viewAllEmployeeInfo() {
		
	}
	public void run() {
		
	}
}
