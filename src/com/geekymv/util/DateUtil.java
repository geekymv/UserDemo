package com.geekymv.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	// 测试
	public static void main(String[] args) {
		String startDate = "2014-10-16";
		String endDate = "2015-10-16";
		Integer day = daysBetween(startDate, endDate);

		System.out.println(day); // out->365
	}

	private static SimpleDateFormat sdf = null;

	/**
	 * java中静态代码块的用法 static用法详解
	 * http://www.cnblogs.com/panjun-Donet/archive/2010/08/10/1796209.html
	 */
	static {
		// 当类被载入时，静态代码块被执行，且只被执行一次
		if (sdf == null) {
			sdf = new SimpleDateFormat("yyyy-MM-dd");
		}

		System.out.println("test...");
	}

	private DateUtil() {
	}

	/**
	 * 获取日期的毫秒数
	 *
	 * @author: miying
	 * @createTime: 2015年10月19日 上午9:37:56
	 * @history:
	 * @param date
	 * @return long
	 */
	public static long getTimeInMillis(String date) {
		Calendar c = Calendar.getInstance();
		try {
			c.setTime(sdf.parse(date));
			return c.getTimeInMillis();

		} catch (ParseException e) {
			e.printStackTrace();
		}

		return 0;
	}

	/**
	 * 获取日期的毫秒数
	 *
	 * @author: miying
	 * @createTime: 2015年10月19日 上午9:37:56
	 * @history:
	 * @param date
	 * @return long
	 */
	public static long getTimeInMillis(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.getTimeInMillis();
	}

	/**
	 * 计算两个日期之间的天数
	 * @author: miying
	 * @createTime: 2015年10月19日 上午9:55:19
	 * @history:
	 * @param startDate
	 * @param endDate
	 * @return Integer
	 */
	public static Integer daysBetween(String startDate, String endDate) {
		long s = getTimeInMillis(startDate);
		long e = getTimeInMillis(endDate);

		return (int) ((e - s) / (24 * 3600 * 1000));
		// return Integer.valueOf(String.valueOf(time));
	}

	/**
	 * 计算两个日期之间的天数
	 * @author: miying
	 * @createTime: 2015年10月19日 上午9:55:19
	 * @history:
	 * @param startDate
	 * @param endDate
	 * @return Integer
	 */
	public static Integer daysBetween(Date startDate, Date endDate) {
		long s = getTimeInMillis(startDate);
		long e = getTimeInMillis(endDate);

		return (int) ((e - s) / (24 * 3600 * 1000));

		// return Integer.valueOf(String.valueOf(time));
	}

}
