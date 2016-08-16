package com.example.mydiary.common;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public abstract class Content 
{

	
	/**
	 * 获取文本内容
	 * @param textView
	 * @return
	 */
	public static String getTextView(TextView textView)
	{
		return   textView.getText().toString().trim();
	}
	/**
	 * 获取按钮内容
	 * @param textView
	 * @return
	 */
	public static String getButton(Button button)
	{
		return   button.getText().toString().trim();
	}
	
	/**
	 * 获取编辑文本内容
	 * @param textView
	 * @return
	 */
	public static String getEditText(EditText editText)
	{
		return   editText.getText().toString().trim();
	}
	
}
