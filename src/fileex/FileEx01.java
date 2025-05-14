package fileex;

import java.io.*;

public class FileEx01 {

	public static void main(String[] args) throws IOException {
		//디렉토리 경로
		String path = "C:/upload";
		//String path = "C:/upload/file.txt";
		File file = new File(path);

		if(!file.isDirectory()) { file.mkdirs(); }
		//if(!file.exists()) { file.mkdirs(); }
		// .isDirectory()=> 디렉토리 존재 여부만 판단/ exists() => 디렉토리, 파일 전부 인식
		//파일 경로 완성
		path = path + "/file.txt";

		//빈 파일 생성방법 1
		file = new File(path);
		file.createNewFile();


		//빈 파일 생성방법2
		FileWriter fw = new FileWriter(path, true);
		fw.close(); //close에는 flush가 숨겨져있다.


		FileWriter fw2 = new FileWriter(path, true);
		fw2.write("FileWriter는 한글로된 " + "\n");
		fw2.write("문자열을 바로 출력할 수 있다." + "\n");
		fw2.flush();//버퍼 비우기(=파일에 출력하세요)
		//fw.close(); //close에는 flush가 숨겨져있다.

		System.out.println("파일에 저장되었습니다.");
	}
}
