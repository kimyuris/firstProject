package co.yedam.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneExample {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/E HH:mm:ss a");
		Date now = new Date();
		System.out.println(sdf.format(now));

		String[] timezones = TimeZone.getAvailableIDs();
		for (String timezone : timezones) {
			if (timezone.toLowerCase().indexOf("seoul") != -1)
				System.out.println(timezone);
		}
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(Calendar.YEAR)+"년");
		System.out.println((today.get(Calendar.MONTH)+1)+"월");
		System.out.println(today.get(Calendar.DATE)+"일");
	}
}
