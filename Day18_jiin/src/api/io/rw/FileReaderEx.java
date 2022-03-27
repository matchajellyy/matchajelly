package api.io.rw;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		/*
		 - 문자 기반으로 읽어들이는 클래스는 FileReader입니다.
		 - 2바이트 단위로 읽기 때문에 문자를 읽어들이기 적합합니다.
		 */

		FileReader fr = null;
		
		try {
			fr = new FileReader("C:\\Users\\WiTHUS\\Desktop\\java_web_jiin\\file\\merong.txt");
			
			char[] arr = new char[100];
			
			int result = fr.read(arr); //문자 하나씩을 읽어들입니다.
			System.out.println("문자의 개수: " + result);
			for(char c: arr) { //내가 반복문 돌리고 싶은 배열 이름 arr, arr 배열은 char 배열, 거기 안에도 다 char 배열
				System.out.println(c);
				if(c == 0) break; //char의 기본값 0
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
