package ch18.fileio.bytestream01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* 1byte씩 파일에서 읽어서 저장하는 방식은 너무 느림
 * 물류시스템과 동일
 * 하드디스크 (물류센터)
 * App프로세스 (아파트)
 * 버퍼클래스 (택배차량)
 * */

public class ByteBufferedFileCopy {
	public static void main(String[] args) throws IOException {
		// 입력 스트림
		InputStream in = new FileInputStream("putty.exe");
		// 입력 스트림과 연결된 저장소(버퍼) 필터 클래스
		BufferedInputStream bin = new BufferedInputStream(in);
		
		// 출력 스트림
		OutputStream out = new FileOutputStream("푸푸푸푸푸푸티.exe");
		// 출력 스트림과 연결된 저장소(버퍼) 필터 클래스
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		/*1byte씩 입출력을 하지만 대신 버퍼필터클래스를 사용한다.*/
		int copyByte = 0;
		int bData;
		long stime = System.currentTimeMillis();
		while(true) {
			bData = bin.read();
			if(bData == -1) {
				break;
			}
			bout.write(bData);
			copyByte++;
		}
		long etime = System.currentTimeMillis();
		
		bin.close();
		bout.close();
		System.out.println("복사 시간=" + (etime - stime));
		System.out.println("복사된 바이트 크기=" + copyByte);
		
	}
}
