package a.b.c.ch7;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateUtil {
	public static String yyyymmdd() {
		return new SimpleDateFormat("yyyyMMdd").format(new Date()).toString();
	}
}
