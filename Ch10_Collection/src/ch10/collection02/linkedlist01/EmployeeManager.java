package ch10.collection02.linkedlist01;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager { // 자식들을 관리하는 매니저
	private final int EMP_NUM = 5; // 100명 사원이 최대

	// Employee의 자식객체들을 저장
	// private Employee[] empArr = new Employee[EMP_NUM];
	List<Employee> empArr = new LinkedList<>();
	private int numOfEmp = 0; // 저장된 사원객체 수
	private Scanner sc = new Scanner(System.in);

	private int viewMenu() {
		System.out.println("[ 사원 선택 ]");
		System.out.println("1. 정규직");
		System.out.println("2. 임시직");
		System.out.println("3. 일용직");
		System.out.println("4. 전체정보보기");
		System.out.println("5. 정규직 보기");
		System.out.println("6. 임시직 보기");
		System.out.println("7. 일용직 보기");
		System.out.println("8. 종료");
		System.out.print("번호입력: ");
		int sel = sc.nextInt();

		return sel;
	}

	private RegularEmployee createRegularEmployee() {
		System.out.println("사번: ");
		String empno = sc.next();

		System.out.println("이름: ");
		String name = sc.next();

		System.out.println("연봉: ");
		int yearSalary = sc.nextInt();

		System.out.println("보너스: ");
		int bonus = sc.nextInt();

		RegularEmployee emp = new RegularEmployee(empno, name, yearSalary, bonus);
		empArr.add(emp);
		return emp;
	}

	private TempEmployee createTempEmployee() {
		System.out.println("사번: ");
		String empno = sc.next();

		System.out.println("이름: ");
		String name = sc.next();

		System.out.println("연봉: ");
		int yearSalary = sc.nextInt();

		System.out.println("계약기간: ");
		int hireYear = sc.nextInt();

		TempEmployee emp = new TempEmployee(empno, name, yearSalary, hireYear);
		empArr.add(emp);

		return emp;
	}

	private PartTimeEmployee createPartTimeEmployee() {
		System.out.println("사번: ");
		String empno = sc.next();

		System.out.println("이름: ");
		String name = sc.next();

		System.out.println("일당: ");
		int dailyPay = sc.nextInt();

		System.out.println("일한 일수: ");
		int workDay = sc.nextInt();

		PartTimeEmployee emp = new PartTimeEmployee(empno, name, dailyPay, workDay);
		empArr.add(emp);

		return emp;
	}

	private boolean saveEmployee(Employee emp) {
		boolean isSave = true;

		if (this.numOfEmp < EMP_NUM) {
			empArr.add(numOfEmp, emp);
			this.numOfEmp++;
			isSave = true;
		} else {
			isSave = false;
		}

		return isSave;
	}

	private void viewAllEmployeeInfo() {
		for (int i = 0; i < empArr.size(); i++) {
			empArr.get(i).showEmployeeInfo();
		}
	}

	private void viewRegularEmployeeInfo() {
		for (int i = 0; i < empArr.size(); i++) {
			Employee emp = empArr.get(i);

			if (emp instanceof RegularEmployee) {
				empArr.get(i).showEmployeeInfo();
			}
		}
	}

	private void viewTempEmployeeInfo() {
		for (int i = 0; i < empArr.size(); i++) {
			Employee emp = empArr.get(i);
			if (emp instanceof TempEmployee) {
				empArr.get(i).showEmployeeInfo();
			}
		}
	}

	private void viewPartTimeEmployeeInfo() {
		for (int i = 0; i < empArr.size(); i++) {
			Employee emp = empArr.get(i);
			if (emp instanceof PartTimeEmployee) {
				empArr.get(i).showEmployeeInfo();
			}
		}
	}

	public void run() {
		boolean isRun = true;
		while (isRun) {
			int selNum = viewMenu();
			Employee emp = null;

			switch (selNum) {
				case EmpMenu.REG_EMP:
					emp = createRegularEmployee();
					break;
				case EmpMenu.TEMP_EMP:
					emp = createTempEmployee();
					break;
				case EmpMenu.PART_EMP:
					emp = createPartTimeEmployee();
					break;
				case EmpMenu.ALL_INFO:
					emp = null;
					viewAllEmployeeInfo();
					break;
				case EmpMenu.REG_INFO:
					emp = null;
					viewRegularEmployeeInfo();
					break;
				case EmpMenu.TEMP_INFO:
					emp = null;
					viewTempEmployeeInfo();
					break;
				case EmpMenu.PART_INFO:
					emp = null;
					viewPartTimeEmployeeInfo();
					break;
				case EmpMenu.EXIT:
					emp = null;
					isRun = false;
					break;
				default:
					emp = null;
					System.out.println("해당 항목이 존재하지 않아");
			}

			// emp객체가 존재한다면
			if (emp != null) {
				boolean isSave = saveEmployee(emp);
				if (!isSave) {
					System.out.println("더이상 저장 할 공간이 없습니다.");
				}
			}
		}
		System.out.println("프로그램종료");
	}
}