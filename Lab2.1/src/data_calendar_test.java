import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class data_calendar_test {

	/*
	 *  G — ера
	 *  Y — рік
	 *  М — місяць без нуля
	 *  ММ — місяць (02)
	 *  МММ — Скорочений місяць
	 *  ММММ — повна назва місяця
	 *  w — номер тижня в році
	 *  W — номер тижня в місяці
	 *  D — День в році
	 *  d — день місяця
	 *  F — День тижня числом
	 *  E — День тижня скорочено (буквами)
	 *  а — АМ|PM
	 *  h — 12 годинний формат
	 *  H — 24 годинний формат
	 *  Z — часовий пояс
	 */
	
	public static void main(String[] args) {
		Date currentdate = new Date();
		System.out.print(currentdate.toString()+"\n");
		System.out.println(System.currentTimeMillis());
		SimpleDateFormat month = new SimpleDateFormat();
		System.out.println(month.format(currentdate));
		month = new SimpleDateFormat("dd MMMM YYYY HH:mm:ss ZZZZ");
		System.out.println(month.format(currentdate));
		//24/10/2014 14:10
		SimpleDateFormat newdate = new SimpleDateFormat("dd/MM/YYYY HH:mm");
		System.out.println(newdate.format(currentdate)+"\n");
		//calendar
		Calendar k = new GregorianCalendar();
		System.out.println(k.toString());
		int year = k.get(Calendar.YEAR);
		System.out.println(year);
		System.out.println(month.format(year));
		System.out.println(month.format(k.getTime()));
		k.set(Calendar.YEAR, 2015);
		System.out.println(month.format(k.getTime()));
		k.add(Calendar.YEAR, 5045);
		System.out.println(month.format(k.getTime()));
		String date = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Введіть дату в форматі");
		String dates = in.next();
		//Date date1=month.parse(date);
		/**/
		
	}

}
