package javalangex;

public class StringBufferEx01 {

	public static void main(String[] args) {
		//delete()메소드
		//str [&10] Java Oracle
		StringBuffer str = new StringBuffer("Java Oracle");
		System.out.println("원본 문자열 : " + str);
		System.out.println("길이0: " + str.length());

		//시작인덱스~ 인덱스-1번까지
		//str [&10] Java Oracle
		System.out.println(str.delete(4, 8)); //4번이상 8번 미만
		//=>4번 인덱스부터 7번 인덱스까지 지워라
		System.out.println(str);
		System.out.println("길이1: " + str.length());
		
		//해당 인덱스 문자만제거
		//str [&10] Javacle
		System.out.println(str.deleteCharAt(1));
		System.out.println(str);
		System.out.println("길이2: " + str.length());

		//해당 인덱스 문자만 가져오기
		//str [&10] Jvacle
		System.out.println(str.charAt(1));
		System.out.println(str);
		System.out.println("길이3: " + str.length());

		//str [&10] Jvacle
		//0번 인덱스부터 2번 인덱스까지의 문자를 대체
		System.out.println(str.replace(0, 3, "12345"));
	}
}
