package com.freecrmTesting;
import java.util.HashMap;

public class Data
{
	public static HashMap<Integer, String> getUser()
	{
		HashMap<Integer,String> user = new HashMap<Integer,String>();
		user.put(1, "ankur123_test123");
		user.put(2, "ankur123_test123");
		user.put(3, "ankur123_test123");
		
		return user;
	}
	
	public static  HashMap<String,String> getMonth()
	{
		HashMap<String,String> month = new HashMap<String,String>();
		month.put("jan", "January");
		month.put("feb","February");
		month.put("dec", "December");
		
		return month;
	}
	
}
