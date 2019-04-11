package com.dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DateDifference {

	public static void main(String[] args) {
		
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
		Date date1 = null;
		Date date2 = null;
		try {
			date2 = format.parse("2019-03-16 21:53:09");
			date1 = format.parse("2019-04-05 20:53:16");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(getTimeDifference(date1,date2));

	}
	
	public static String getTimeDifference(Date date1, Date date2) {
		if (date1!=null && date2!=null) {
			long diffInMillies = date1.getTime() - date2.getTime();
			final long days = TimeUnit.MILLISECONDS.toDays(diffInMillies);
			long hr = 0;
			if (days != 0) {
				hr = TimeUnit.MILLISECONDS.toHours(diffInMillies) % days;
			}
			else {
				hr = TimeUnit.MILLISECONDS.toHours(diffInMillies);
			}
			final long min = TimeUnit.MILLISECONDS.toMinutes(diffInMillies) % 60;
			final long sec = TimeUnit.MILLISECONDS.toSeconds(diffInMillies) % 60;
			String strDate= String.format("%02dd%02dh%02dm%02ds",days, hr, min,sec );
			if (strDate.contains("-")) {
				return "-" + strDate.replace("-", "");
			}
			return strDate;
		}
		return null;
	}

}
