package javautilex;

import java.util.Calendar;

public class UtilEx02 {

	public static void main(String[] args) {
		String months[] = { "1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월" };
		String week[] = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };

		//(1 January 1970 0:00 UTC) 기준
		//Calendar 는 추상클래스이기 때문에 new 사용 못함
		Calendar calendar = Calendar.getInstance();

		System.out.println("날짜 : "+calendar);
		System.out.print(calendar.get(Calendar.YEAR)+ "년 ");
		System.out.print("달: "+calendar.get(Calendar.MONTH)); //4 출력
		//months라는 인덱스의 4번째 값 출력
		System.out.print(" "+ months[calendar.get(Calendar.MONTH)]);
		System.out.print(" " + calendar.get(Calendar.DATE) + "일 ");

		//1부터 반환하므로
		//calendar.get(Calendar.DAY_OF_WEEK) = 3
		//week라는 배열 인덱스의 [3]-1인 2의 값을 얻어오세요
		System.out.println(week[calendar.get(Calendar.DAY_OF_WEEK)-1]);
		System.out.print("시간 : ");

		//get(Calendar.AM_PM) => 0: 오전 ,1: 오후
		if (calendar.get(Calendar.AM_PM) == 0) System.out.print("오전 ");
		else System.out.print("오후 ");

		System.out.print(calendar.get(Calendar.HOUR) + "시 ");
		System.out.print(calendar.get(Calendar.MINUTE) + "분 ");
		System.out.println(calendar.get(Calendar.SECOND) + "초");
		System.out.print(calendar.get(Calendar.YEAR));

		//0부터리턴
		System.out.print("." + calendar.get(Calendar.MONTH));

		//0부터리턴
		System.out.print("." + calendar.get(Calendar.DATE));

		//요일: 1부터리턴
		System.out.println("." + calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println();

		calendar.set(Calendar.YEAR, 2018);
		calendar.set(Calendar.MONTH, Calendar.JANUARY);
		calendar.set(Calendar.DATE, 5);

		calendar.set(Calendar.HOUR, 1);
		calendar.set(Calendar.MINUTE, 13);
		calendar.set(Calendar.SECOND, 56);

		System.out.println(calendar);
		System.out.print(calendar.get(Calendar.YEAR));
		//0부터리턴
		System.out.print(". " + calendar.get(Calendar.MONTH));
		//0부터리턴
		System.out.print(". " + calendar.get(Calendar.DATE));

		//요일: 1부터리턴
		System.out.println(". " + calendar.get(Calendar.DAY_OF_WEEK));
	}
}




