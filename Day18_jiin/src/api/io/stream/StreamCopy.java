package api.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamCopy {

	public static void main(String[] args) {
		
		FileInputStream oldFile = null;
		FileOutputStream newFile = null;

		try {
			
			oldFile = new FileInputStream("C:\\Users\\WiTHUS\\Desktop\\java_web_jiin\\eclipse-jee-2021-09-R-win32-x86_64\\java_workspace\\Day18_jiin\\src\\api\\io\\stream\\1.jpg");
			newFile = new FileOutputStream("C:\\Users\\WiTHUS\\Desktop\\java_web_jiin\\file\\copy.jpg");
			
			byte[] arr = new byte[100];
			
			while(true) {
				//읽어들인 데이터가 있다면 읽은 데이터 길이 반환, 없다면 -1을 반환합니다.
				int result = oldFile.read(arr);
				if(result == -1) break; //탈출
				
				//바이트 단위로 0에서부터 읽은 크기까지의 파일을 작성합니다.
				newFile.write(arr, 0, result);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				oldFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				newFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
		
	}

}
