package com.kosmo.kck.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateUtil {

	public static String yyyymmdd() {

		return new SimpleDateFormat("yyyyMMdd").format(new Date()).toString();
	}

	public static String yyyymm() {

		return new SimpleDateFormat("yyyyMM").format(new Date()).toString();
	}

	public static String yyyy() {

		return new SimpleDateFormat("yyyy").format(new Date()).toString();
	}

	public static String cTime() {

		//return new SimpleDateFormat("yyyy.MM.dd hh:mm:ss").format(new Date(time)).toString();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
		String cTime = sdf.format(new java.util.Date(time));
		
		return cTime;
	}

	// '�⵵'�� ��Ÿ���� ���� 1,2,3.. �տ� '0'�� �ٿ��ִ� �ڵ�
	// ��� �� ���� �׽�Ʈ �غ���
	public static String[] comboYear() {
		int currentYear = Integer.parseInt(DateUtil.yyyy());
		int firstYear = 1900;
		// why + 2?? 2021 - 1900 + 2 = 123��???
		String[] years = new String[currentYear - firstYear + 2];
		years[0] = "�⵵";
		for (int i = 1; i < years.length; i++) {
			// currentYear-- �ǹ�
			years[i] = String.valueOf(currentYear--);
		}
		return years;
	}

	// '��'�� ��Ÿ���� ���� 1,2,3.. �տ� '0'�� �ٿ��ִ� �ڵ�
	public static String[] comboMonth() {
		String[] months = new String[13];
		months[0] = "��";
		for (int i = 1; i < months.length; i++) {
			months[i] = String.valueOf(i);
			if (1 == months[i].length()) {
				months[i] = "0" + i;
			}
		}
		return months;
	}

	// '��'�� ��Ÿ���� ���� 1,2,3.. �տ� '0'�� �ٿ��ִ� �ڵ�
	public static String[] comboDay() {
		String[] days = new String[32];
		days[0] = "��";
		for (int i = 1; i < days.length; i++) {
			days[i] = String.valueOf(i);
			if (1 == days[i].length()) {
				days[i] = "0" + i;
			}
		}
		return days;
	}

	public static void main(String[] args) {

		String d = DateUtil.yyyymmdd();
		System.out.println("d : " + d);
		System.out.println("dt : " + DateUtil.cTime());

		String m[] = DateUtil.comboMonth();
		for (int i = 0; i < m.length; i++) {
			System.out.println("m[" + i + "] : " + m[i]);
		}
	}
}
