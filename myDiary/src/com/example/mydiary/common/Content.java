package com.example.mydiary.common;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public abstract class Content 
{

	
	/**
	 * ��ȡ�ı�����
	 * @param textView
	 * @return
	 */
	public static String getTextView(TextView textView)
	{
		return   textView.getText().toString().trim();
	}
	/**
	 * ��ȡ��ť����
	 * @param textView
	 * @return
	 */
	public static String getButton(Button button)
	{
		return   button.getText().toString().trim();
	}
	
	/**
	 * ��ȡ�༭�ı�����
	 * @param textView
	 * @return
	 */
	public static String getEditText(EditText editText)
	{
		return   editText.getText().toString().trim();
	}
	
}
