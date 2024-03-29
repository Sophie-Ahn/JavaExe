package ch10.collection01.ch15.sec04.exam3;

import java.util.Properties;

/*
 * 웹 프로그래밍에서 환경설정 값을 파일에 보관하고
 * 상황에 따라 바꾼다.
 * Java프로그램에서는 이런 환경설정 파일을 읽어서
 * 처리해야 하는데
 * 이 때 외부 파일을 주로 *.properties 파일을 사용하고
 * 이 파일을 읽어들이는 용도로 Properties클래스를 사용한다.
 * 
 * key=value 구조로 되어있다.
 * 한글은 유니코드 형식으로 변환되기 때문에
 * *.txt에 내용을 작성한 후
 * *.properties에 붙여넣기 하는 방식으로 주로 사용된다.
 * */

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		// Properties 컬렉션 생성
		Properties properties = new Properties();
		
		// PropertiesExample.Class와 동일한 ClassPath에 있는 database.properties 파일로드
		properties.load(PropertiesExample.class.getResourceAsStream("database.properties"));
		
		// 주어진 키에 대한 값 읽기
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String userName = properties.getProperty("userName");
		String password = properties.getProperty("password");
		String admin = properties.getProperty("admin");
		
		// 값 출력
		System.out.println("driver: " + driver);
		System.out.println("url" + url);
		System.out.println("userName" + userName);
		System.out.println("password" + password);
		System.out.println("admin" + admin);
		
	}
}
