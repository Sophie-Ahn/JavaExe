package ch10.collection02.hashmap04;

//System.out.println("[ 사원 선택 ]");
//System.out.println("1. 정규직");
//System.out.println("2. 임시직");
//System.out.println("3. 일용직");
//System.out.println("4. 전체정보보기");
//System.out.println("5. 정규직 보기");
//System.out.println("6. 임시직 보기");
//System.out.println("7. 일용직 보기");
//System.out.println("8. 사번 찾아보기");
//System.out.println("9. 사번 지우기");
//System.out.println("10. 사번 수정하기");
//System.out.println("11. 종료");
public interface EmpMenu {
	public int REG_EMP = 1;
	public int TEMP_EMP = 2;
	public int PART_EMP = 3;
	public int ALL_INFO = 4;
	public int REG_INFO = 5;
	public int TEMP_INFO = 6;
	public int PART_INFO = 7;
	public int SEARCH_INFO = 8;
	public int DELETE_INFO = 9;
	public int MODIFY_INFO = 10;
	public int EXIT = 11;
}
