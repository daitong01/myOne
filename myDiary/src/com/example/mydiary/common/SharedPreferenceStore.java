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
	 * ��ȡSharedPreferences(�������)��ȡ����
	 * @param name
	 * @param mode
	 * @return
	 */
	public  SharedPreferences getSharedPreferencees()
	{
		return new SharedPreferencesContext(context).getSharedPreferences(name, mode);
	}
	
	/**
	 * ͨ��(SharedPreferences)��ñ�������Ķ���Editor
	 */
	public SharedPreferences.Editor  getSharedPreferencesEdit()
	{
		 return getSharedPreferencees().edit();
	}
	
	/**
	 * ����KEYֵ����SharedPreference�л�ȡString��������
	 * @param key
	 * @param value
	 */
	public String  getStringSharedPreferen(String key )
	{
		return getSharedPreferencees().getString(key, "");
	}
	
	/**
	 * ����KEYֵ����SharedPreference�л�ȡint��������
	 * @param key
	 * @param value
	 */
	public int  getIntSharedPreferen(String key )
	{
		return getSharedPreferencees().getInt(key, -1);
	}
	
	/**
	 * ����KEYֵ����SharedPreference�л�ȡboolean��������
	 * @param key
	 * @param value
	 */
	public boolean  getBooleanSharedPreferen(String key )
	{
		return getSharedPreferencees().getBoolean(key, false);
	}
	
	/**
	 * ����KEYֵ����SharedPreference�л�ȡLong��������
	 * @param key
	 * @param value
	 */
	public Long  getLongSharedPreferen(String key )
	{
		return getSharedPreferencees().getLong(key, -1);
	}
	/**
	 * ����KEYֵ����SharedPreference�л�ȡboolean��������
	 * @param key
	 * @param value
	 */
	public float  getFloatSharedPreferen(String key )
	{
		return getSharedPreferencees().getFloat(key, -1);
	}
	
	/**
	 * ͨ��SharedPreference����String�����ڴ洢��
	 * @param key
	 * @param value
	 */
	public void setStringSharedPreferen(String key ,String value)
	{
		getSharedPreferencesEdit().putString(key, value).commit();
	}
	
	/**
	 * ͨ��SharedPreference����boolean�����ڴ洢��
	 * @param key
	 * @param value
	 */
	public void setBooleanSharedPreferen(String key ,boolean value)
	{
		getSharedPreferencesEdit().putBoolean(key, value).commit();
	}
	
	/**
	 * ͨ��SharedPreference����float�����ڴ洢��
	 * @param key
	 * @param value
	 */
	public void setFloatSharedPreferen(String key ,float value)
	{
		getSharedPreferencesEdit().putFloat(key, value).commit();
	}
	
	/**
	 * ͨ��SharedPreference����int�����ڴ洢��
	 * @param key
	 * @param value
	 */
	public void setIntSharedPreferen(String key ,int value)
	{
		getSharedPreferencesEdit().putInt(key, value).commit();
	}
	
	/**
	 * ͨ��SharedPreference����long�����ڴ洢��
	 * @param key
	 * @param value
	 */
	public void setLongSharedPreferen(String key ,long value)
	{
		getSharedPreferencesEdit().putLong(key, value).commit();
	}
}
