package jp.co.internous.lab.application.uuid;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {



	/**

	 * 現在時刻取得メソッド

	 *

	 * @return String

	 */

	public static String getDate() {

		Date date = new Date();

//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

		return simpleDateFormat.format(date);

	}

	public static Date getDateWrapper(String staringDate) throws ParseException {
		return (new SimpleDateFormat("yyyy/MM/dd")).parse(staringDate);
	}

 }
