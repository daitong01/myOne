package com.example.mydiary.common;

import android.content.Context;
import android.content.SharedPreferences;

public   class SharedPreferenceStore 
{
	private String name ;
	private int mode;
	private Context context ;
	public SharedPreferenceStore(String name , int mode)
	{
		this.name = name;
		this.mode = mode;
		getSharedPreferencees();
	}

	/**
	 * 获取SharedPreferences(共享参数)存取对象
	 * @param name
	 * @param mode
	 * @return
	 */
	public  SharedPreferences getSharedPreferencees()
	{
		return new SharedPreferencesContext(context).getSharedPreferences(name, mode);
	}
	
	/**
	 * 通过(SharedPreferences)获得保存组件的对象Editor
	 */
	public SharedPreferences.Editor  getSharedPreferencesEdit()
	{
		 return getSharedPreferencees().edit();
	}
	
	/**
	 * 根据KEY值，在SharedPreference中获取String类型数据
	 * @param key
	 * @param value
	 */
	public String  getStringSharedPreferen(String key )
	{
		return getSharedPreferencees().getString(key, "");
	}
	
	/**
	 * 根据KEY值，在SharedPreference中获取int类型数据
	 * @param key
	 * @param value
	 */
	public int  getIntSharedPreferen(String key )
	{
		return getSharedPreferencees().getInt(key, -1);
	}
	
	/**
	 * 根据KEY值，在SharedPreference中获取boolean类型数据
	 * @param key
	 * @param value
	 */
	public boolean  getBooleanSharedPreferen(String key )
	{
		return getSharedPreferencees().getBoolean(key, false);
	}
	
	/**
	 * 根据KEY值，在SharedPreference中获取Long类型数据
	 * @param key
	 * @param value
	 */
	public Long  getLongSharedPreferen(String key )
	{
		return getSharedPreferencees().getLong(key, -1);
	}
	/**
	 * 根据KEY值，在SharedPreference中获取boolean类型数据
	 * @param key
	 * @param value
	 */
	public float  getFloatSharedPreferen(String key )
	{
		return getSharedPreferencees().getFloat(key, -1);
	}
	
	/**
	 * 通过SharedPreference保存String类型在存储区
	 * @param key
	 * @param value
	 */
	public void setStringSharedPreferen(String key ,String value)
	{
		getSharedPreferencesEdit().putString(key, value).commit();
	}
	
	/**
	 * 通过SharedPreference保存boolean类型在存储区
	 * @param key
	 * @param value
	 */
	public void setBooleanSharedPreferen(String key ,boolean value)
	{
		getSharedPreferencesEdit().putBoolean(key, value).commit();
	}
	
	/**
	 * 通过SharedPreference保存float类型在存储区
	 * @param key
	 * @param value
	 */
	public void setFloatSharedPreferen(String key ,float value)
	{
		getSharedPreferencesEdit().putFloat(key, value).commit();
	}
	
	/**
	 * 通过SharedPreference保存int类型在存储区
	 * @param key
	 * @param value
	 */
	public void setIntSharedPreferen(String key ,int value)
	{
		getSharedPreferencesEdit().putInt(key, value).commit();
	}
	
	/**
	 * 通过SharedPreference保存long类型在存储区
	 * @param key
	 * @param value
	 */
	public void setLongSharedPreferen(String key ,long value)
	{
		getSharedPreferencesEdit().putLong(key, value).commit();
	}
}
