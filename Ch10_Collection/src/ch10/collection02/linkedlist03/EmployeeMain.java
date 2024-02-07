package ch10.collection02.linkedlist03;

public class EmployeeMain {
	public static void testInstanceOf() {
		RegularEmployee regEmp = new RegularEmployee("0000", "seulki", 5000, 1000);
		Employee emp = regEmp;
		// instanceof는 RegularEmployee가 상속이 되었는지 또는 자기 자신 객체인지 확인할수있음
		if(emp instanceof RegularEmployee) {
			System.out.println("regEmp는 RegularEmployee의 객체이거나"
					+ " 자식 객체입니다.");
		}
		
		if(emp instanceof TempEmployee) {
			System.out.println("regEmp는 TempEmployee의 객체이거나"
					+ " 자식 객체입니다.");
		}
		
		if(emp instanceof PartTimeEmployee) {
			System.out.println("regEmp는 PartTimeEmployee의 객체이거나"
					+ " 자식 객체입니다.");
		}
	}
	public static void main(String[] args) {
		EmployeeManager em = new EmployeeManager();
		em.run(); // run메서드 호출
//		testInstanceOf();
	}
}
