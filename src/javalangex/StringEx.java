package javalangex;

public class StringEx {
    public static void main(String[] args) {
        //concat : 문자열 뒤로 추가
        /*String str = new String("Java");
        System.out.println("원본 문자열 : " + str);
        System.out.println(str.concat("수업"));
        System.out.println("concat() 메소드 호출 후 원본 문자열 : " + str);
        System.out.println("\n=======================================================\n");

        //==========================================================================

        String str1 = new String("해피썬데이");
        // 특정 위치에 있는 문자(char)
        char ch = str1.charAt(2);
        System.out.println(str1 + "의 charAt(2) : " + ch);
        // 문자열의 일부분을 발췌
        // 3번 인덱스 ~ 끝까지
        String str2 = str1.substring(3);
        System.out.println(str1 + "의 substring(3) : " + str2);
        // 2번 ~ (4 - 1)번 인덱스
        String str3 = str1.substring(2, 4);
        System.out.println(str1 + "의 substring(2, 4) : " + str3);
        System.out.println("\n=======================================================\n");

        //============================================================================

        //contains : 문자열 포함 여부
        String str4 = "my java test";
        System.out.println( str4.contains("java") );
        System.out.println( str4.contains(" my") );
        System.out.println( str4.contains("JAVA") );
        System.out.println( str4.contains("java test") );
        System.out.println("\n");

        //문자열 치환 : replace , replaceAll(정규표현식 사용가능)
        String b = "Welcome to Java World ";
        System.out.println(b.replace("Java", "Computer"));
        System.out.println(b.replaceAll("Java", "Computer"));
        System.out.println("\n");

        String str5 = "abcdefghijk";
        System.out.println("result ===> " + str5.replaceAll("[abchij]", "굿"));
        System.out.println("result ===> " + str5.replaceAll("[^abchij]", "굿"));
        System.out.println("result ===> " + str5.replace("a", "굿").replace("b", "굿").replace("c", "굿").replace("h", "굿").replace("i", "굿").replace("j", "굿"));
        System.out.println("result ===> "+ str5.replace("abc", "굿굿굿").replace("hij", "굿굿굿"));
        //".(연결연산자)"를 이용하여 하나의 명령에 여러 메소드를 엮어서 실행하는 방법: 체이닝기법(chainning기법)
        System.out.println("\n=======================================================\n");

        //================================================================================================================================================

        String a = "Welcome to Java World ";
        System.out.println(a.replaceAll("Java", "Computer"));
        System.out.println(a.substring(0, 4));
        System.out.println(a.substring(4));
        System.out.println(a.substring(1,8));
        System.out.println("\n=======================================================\n");

        //================================================================================================================================================

        //대소문자 변경 : toUpperCase() , toLowerCase()
        String a1 = "Welcome to Java World ";
        System.out.println(a1.replaceAll("Java", "Computer"));
        System.out.println(a1.toUpperCase());
        System.out.println(a1.toLowerCase());
        System.out.println("\n=======================================================\n");
        */
        //=================================================================================================================================================
        //공백 제거: trim()
        String str6 = "   공백  제거    공백  제거   ";
        System.out.println("["+str6+"]");
        System.out.println("["+str6.trim()+"]"); //맨 왼쪽, 오른쪽의 공백 제거만 가능
        System.out.println("["+str6.replace(" ","")+"]"); //문자열치환으로 가운데 공백 제거
        System.out.println("\n");

        //문자열 인덱스 indexOf
        String a2 = "Good Afternoon!!";
        System.out.println(a2.indexOf("noon"));
        System.out.println(a2.indexOf(" Af"));
        System.out.println("\n");

        String hello = "HelloWorld_MyWorld";
        System.out.println("1: "+hello.indexOf("World"));
        System.out.println("2: "+hello.lastIndexOf("World"));
        System.out.println("3: "+hello.indexOf("World", 10));
        System.out.println("4: "+hello.lastIndexOf("World", 13));
        System.out.println("5: "+hello.lastIndexOf("World", 10));
        System.out.println("\n");

        hello = "AaBbCc"; //아스키코드 값으로 인덱스 찾기
        System.out.println(hello.indexOf(65));
        System.out.println(hello.indexOf(99));
    }
}
