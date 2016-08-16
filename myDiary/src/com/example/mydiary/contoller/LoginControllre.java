package com.example.mydiary.contoller;

public class LoginControllre 
{
	
	public static boolean login(String user , String password)
	{
		if ("daijinyang".equals(user)&& "123456".equals(password)) {
			return true;
		}
		else
		{
			return false;
		}
	}

}
