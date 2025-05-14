package javautilex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtilEx03 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE));
		//cal.set(2018,0,5) or (2025,4,13)

		Date day = new Date(cal.getTimeInMillis());
		System.out.println("today0: " + day);

		day = cal.getTime();
		System.out.println("today1: " + day);

		Date nowday = new Date();
		System.out.println("today2: " + nowday);

		Date someday = new Date(125, Calendar.MAY, 13, 12, 50, 55);
		System.out.println("today3: " + someday);
		System.out.println("\n===================\n");
		
		SimpleDateFormat sdf1, sdf2, sdf3;
		sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm a");

		System.out.println("sdf1: "+sdf1.format(day));
		System.out.println("sdf2: "+sdf2.format(day));
		System.out.println("sdf3: "+sdf3.format(day));
		sdf2 = new SimpleDateFormat("yy-M-d h:m");
		System.out.println("sdf2: "+sdf2.format(day));
	}
}






