package fileex;

import java.io.*;

public class FileEx05 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\jwork\\firsts\\fileex\\FileEx04.java");
//		File f = new File("C:/jwork/firsts/fileex/FileEx04.java");
//		File f = new File("C:/jwork/firsts/fileex","FileEx04.java");
		String fileName = f.getName();
		//FileEx04.java
		int pos = fileName.lastIndexOf(".");
		//lastIndexOf(".") => 오른쪽에서 왼쪽 처음으로 나오는 .의 인덱스번호
		// pos = 8

		System.out.println("경로를 제외한 파일이름 - " + fileName);
		System.out.println("확장자를 제외한 파일이름 - " + fileName.substring(0, pos));
		System.out.println("확장자 - " + fileName.substring(pos + 1));
		System.out.println("경로를 포함한 파일이름 - " + f.getPath());
		System.out.println("파일의 절대경로        - " + f.getAbsolutePath());
		System.out.println("파일이 속해 있는 디렉토리 - " + f.getParent());
		System.out.println();
		System.out.println("File.separator - " + File.separator);
		System.out.println("File.separatorChar - " + File.separatorChar);
		System.out.println("현재 파일의 프로젝트 디렉토리 =" + System.getProperty("user.dir"));
	}
}






