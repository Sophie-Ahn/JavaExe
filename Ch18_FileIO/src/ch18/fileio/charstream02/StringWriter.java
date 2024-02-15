package ch18.fileio.charstream02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class StringWriter {
	public static void main(String[] args) throws IOException {
		Writer wt = new FileWriter("안슬기.txt");
		BufferedWriter out = new BufferedWriter(wt);
		out.write("1995년 09월 02일에 대전에서 태어나 23살까지 쭈욱 학교 다니고 살다가");
		out.newLine(); // 개행문자추가
		out.write("2017년에 미국으로 가 패션회사에서 외노자 생활을 하고 그때 영주권 전환할걸 그랬다가 다시");
		out.newLine();
		out.write("2018년에 한국으로 와 그때부터 인생이 꼬이기 시작하더니");
		out.newLine();
		out.write("지금은 대출 2천이 있다네...");
		out.newLine();
		
		out.close();
		System.out.println("입력완료");
	}
}
