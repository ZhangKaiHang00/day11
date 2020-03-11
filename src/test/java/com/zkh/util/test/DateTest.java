package com.zkh.util.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.zkh.common.utils.DateUtil;


public class DateTest {

	
	@Test
	public void aa() {
		
		Date date = new Date();
		
		System.out.println( date);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		
		String time = format.format(date);
		String time1 = format1.format(date);
		System.err.println("---"+time);
		System.err.println("---"+time1);
	}
	
	@Test
	public void bb() {
		
		Date date = new Date();
		
		Date date2 = DateUtil.getDateByInitMonth(date);
		System.out.println( date);
		System.out.println(date2);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH");
		
		String time = format.format(date);
		String time1 = format1.format(date2);
		System.err.println("---"+time+"---");
		System.err.println("---"+time1+"---");
	}
	
}
