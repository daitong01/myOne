package com.example.mydiary.services;

import java.util.HashMap;
import java.util.Map;

import com.example.mydiary.common.Constan;
import com.example.mydiary.common.SharedPreferenceStore;

import android.app.Activity;

public class LoginServices
{

	private static final String USER_NAME_KEY="userName";
	private static final String USER_PASSWORD_KEY="password";
	
	private String name ;
	private String password;
	/**
	 * 获取存储在SharePreference中的登录密码和用户名
	 */
	public static final Map<String, String> getLoginUserSaveSharedPreference()
	{
		Map<String, String> map = new HashMap<String, String>();
		SharedPreferenceStore sharedPreferences =  new SharedPreferenceStore(Constan.SHAREDPREFERENCE_KEY,Activity.MODE_PRIVATE);
		map.put(Constan.USERNMAE,  sharedPreferences.getStringSharedPreferen(USER_NAME_KEY));
		map.put(Constan.PASSWORD,  sharedPreferences.getStringSharedPreferen(USER_PASSWORD_KEY));
		return map ;
	}
	
	
}
