package javautilex;
import java.util.Scanner;

public class ScannerEx00 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("0번: ");
		String s0 = sc.next();
		System.out.println("\ns0: " + s0);
		String s1 = sc.next(); //끝 - 공백, 공백 X
		sc.nextLine();
		System.out.print("\n1번: " + s1);
		s1 = sc.nextLine(); //끝 - 엔터, 공백 O
		
		System.out.print(s1 + "\n2번: ");
		int i = sc.nextInt(); //끝 - 공백,  공백 X
		
		System.out.print(i + "\n3: ");
		s1 = sc.next(); //끝 - 공백,  공백 X
		
		System.out.print(s1 + "\n4: ");
		s1 = sc.next(); //끝 - 공백,  공백 X
		System.out.println(s1);
	}
}






