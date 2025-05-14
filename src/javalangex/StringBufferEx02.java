package javalangex;

public class StringBufferEx02 {

	public static void main(String[] args) {
		//str [&10] => Java 만세!!
		StringBuffer str = new StringBuffer("Java 만세!!");
		System.out.println("원본 문자열 : " + str + "\n");

		//4번 인덱스부터 문자열을 추가
		System.out.println(str.insert(4, "Script")); //인덱스번호 , 추가 문자열
		System.out.println();
		System.out.println("insert() 메소드 호출 후 원본 문자열 : " + str + "\n");

		//reverse => 뒤집어라
		System.out.println(str.reverse()); 
		System.out.println(str);
	}
}
