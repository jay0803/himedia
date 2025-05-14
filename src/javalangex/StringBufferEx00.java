package javalangex;

public class StringBufferEx00 {

	public static void main(String[] args) {
		String str = new String("Java");
		System.out.println("str 문자열 주소1: "+ System.identityHashCode(str));
		str = str + " 수업" ;
		System.out.println("str 문자열 주소2: "+ System.identityHashCode(str));
		str = str + " 시간" ;
		System.out.println("str 문자열 주소3: "+ System.identityHashCode(str) + "\n");

		StringBuffer strb = new StringBuffer(""); //&10
//		strb = "가나다라마바사"; //(X)
		System.out.println("[원본문자열] : " + strb);
		System.out.println("strb 문자열 주소1: "+ System.identityHashCode(strb));
		System.out.println("길이1: " + strb.length());

		//.append 해당 문자열 뒤에 추가
		strb.append("Java 수업");
		System.out.println("strb 문자열 주소2: "+ System.identityHashCode(strb));		
		System.out.println(strb);
		System.out.println("길이2: " + strb.length());

		strb = strb.append(" 수업 수업 수업");
		System.out.println("strb 문자열 주소3: "+ System.identityHashCode(strb));		
		System.out.println(strb);
		System.out.println("길이3: " + strb.length());
		
		strb = strb.append(" 수업");
		System.out.println("strb 문자열 주소4: "+ System.identityHashCode(strb));		
		System.out.println(strb);
		System.out.println("길이4: " + strb.length());
	}
}
