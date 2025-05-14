package collectionex;

import java.util.*;

public class CollEx09 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		//HashSet생성
		set.add(3);
		set.add(2);
		set.add(1);
		set.add(1);
		set.add(3);
		System.out.println("0번: " + set);
		//배열은 length()라는 키워드, length()라는 메소드 길이는 size()라는 메소드
		System.out.println("set.size(): "+set.size());

		//클래스명. => static
		//, => 나열연산자, 열거연산자
		//asList => 순서가 있게 만들어주는 입력 순서대로 출력
		List<Integer> li = Arrays.asList(2,1,3);
		System.out.println("1번 :" + li);

		//asList가 있지만 HashSet이라는 객체는 순서가 없기 때문에 순서없이 출력
		set = new HashSet<Integer>(Arrays.asList(2,1,3));
		System.out.println("1번: " + set);
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
		    System.out.print(iter.next());
		}
		System.out.println();
		
//		Set<Integer> linkedSet1 = new LinkedHashSet<Integer>(Arrays.asList(3,1,2));
		Set<Integer> linkedSet1 = new LinkedHashSet<Integer>(Arrays.asList(3,1,2));
		System.out.println("2번: " + linkedSet1); //전체출력 [1,2,3]
		
		Iterator<Integer> iter1 = linkedSet1.iterator();	// Iterator 사용
		while(iter1.hasNext()) {
			System.out.print(iter1.next());
		}
		System.out.println();
	}
}







