package ch09.abstract11;

//System.out.println("[ 사원 선택 ]");
//System.out.println("1. 정규직");
//System.out.println("2. 임시직");
//System.out.println("3. 일용직");
//System.out.println("4. 전체정보보기");
//System.out.println("5. 정규직 보기");
//System.out.println("6. 임시직 보기");
//System.out.println("7. 일용직 보기");
//System.out.println("8. 종료");
public interface EmpMenu {
	public int REG_EMP = 1;
	public int TEMP_EMP = 2;
	public int PART_EMP = 3;
	public int ALL_INFO = 4;
	public int REG_INFO = 5;
	public int TEMP_INFO = 6;
	public int PART_INFO = 7;
	public int EXIT = 8;
}
