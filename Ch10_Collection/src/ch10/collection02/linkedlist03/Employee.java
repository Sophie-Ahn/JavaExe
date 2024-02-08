package ch10.collection02.linkedlist03;

/*
 * [다형성]
 * 1) 부모클래스에 자식객체를 담을 수 있다.(묶어서 관리)
 * 2) 부모클래스 변수로 메서드 호출하면 자식 각 객체에 메서드가 호출된다.(자식의 고유한 개성을 발현)
 */

public abstract class Employee {
	protected String empno; // 사번
	protected String name; // 이름
	
	public Employee(String empno, String name) {
		this.empno = empno;
		this.name = name;
	}
	
	public void showEmployeeInfo() {
		System.out.println("-------------------");
		System.out.println("empno: " + empno);
		System.out.println("name: " + name);
	}
	
	public abstract double getMonthPay(); // 추상메서드
}


//package ch10.collection02.linkedlist01;
//
///*
// * [다형성]
// * 1) 부모클래스에 자식객체를 담을 수 있다.(묶어서 관리)
// * 2) 부모클래스 변수로 메서드 호출하면 자식 각 객체에 메서드가 호출된다.(자식의 고유한 개성을 발현)
// */
//
//public class Employee {
//	protected String empno; // 사번
//	protected String name; // 이름
//	
//	public Employee(String empno, String name, int yearSalary) {
//		this.empno = empno;
//		this.name = name;
//	}
//	
//	public String getEmpno() {
//		return empno;
//	}
//	public void setSubject (String empno) {
//		this.empno = empno;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName (String name) {
//		this.name = name;
//	}
//	
//	public void showEmployeeInfo() {
//		System.out.println("-------------------");
//		System.out.println("empno: " + empno);
//		System.out.println("name: " + name);
//	}
//	
////	public abstract double getMonthPay(); // 추상메서드
//}