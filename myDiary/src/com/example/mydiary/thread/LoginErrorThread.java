package com.example.mydiary.thread;

import com.example.mydiary.LoginTurn;

public class LoginErrorThread extends Thread
{
	
		@Override
		public void run()
		{
			new LoginTurn();
		}
	
	
	
	
}
