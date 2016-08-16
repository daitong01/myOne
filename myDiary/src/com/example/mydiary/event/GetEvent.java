package com.example.mydiary.event;

import com.example.mydiary.R;
import com.example.mydiary.event.entity.LoginEntity;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GetEvent
{
	private Activity activity;
	private OnClickListener on;
	private LoginEntity loginEntity ;
	
	
	public GetEvent(Activity activitys , OnClickListener onClick)
	{
		this.activity = activitys;
		this.on = onClick;
		loginEntity = getLoginParam();
		
	}
	
	public  LoginEntity getLoginParam()
	{
		  LoginEntity entity = new LoginEntity();
		  entity.setClearPassword((Button)findViewById(activity,R.id.bt_pwd_clear));//清除密码
		  entity.setShowPassword((Button)findViewById(activity,R.id.bt_pwd_eye));//显示密码
		  entity.setClearUserName((Button)findViewById(activity,R.id.bt_username_clear));//清除用户名
		  entity.setUserName((TextView)findViewById(activity,R.id.input_user));//用户名
		  entity.setLogin((Button)findViewById(activity,R.id.login));//登录
		  entity.setForgotPassword((Button)findViewById(activity,R.id.login_error));//忘记密码
		  entity.setPassword((EditText)findViewById(activity,R.id.password));//密码
		  entity.setRegister((Button)findViewById(activity,R.id.register));//注册
		  return entity;
	}
	
//	public Map<String, View> getLoginEventParam()
//	{
//		Map<String, View> map = new HashMap<String, View>();
//		
//		map.put(Constan.CLEAR_PASSWORD, loginEntity.getClearPassword().setOnClickListener(on));
//		map.put(Constan.SHOW_PASSWORD,loginEntity.getShowPassword().setOnClickListener(on));
//		map.put(Constan.CLEAR_USERNMAE,loginEntity.getClearUserName().setOnClickListener(on));
//		map.put(Constan.USERNMAE,loginEntity.getUserName().setOnClickListener(on));
//		map.put(Constan.LOGIN,loginEntity.getLogin().setOnClickListener(on));
//		map.put(Constan.FORGET_PASSWORD,loginEntity.getForgotPassword().setOnClickListener(on));
//		map.put(Constan.PASSWORD,loginEntity.getPassword().setOnClickListener(on));
//		map.put(Constan.REGISTER,loginEntity.getRegister().setOnClickListener(on));
//		
//		return map;
//	}
	
	
	private View findViewById(Activity activity ,int id)
	{
		return activity.findViewById(id);
	}

}
