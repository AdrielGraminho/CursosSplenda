package br.ce.wcaquino.Utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	public static Date obterDataDiferencialDias(int dias) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, dias);
		return cal.getTime();
	}
}
