package com.example.mydiary;

import com.example.mydiary.common.Content;
import com.example.mydiary.contoller.LoginControllre;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginTurn extends Activity 
{

	private Button clearPassword;
	private Button showPassword;
	private Button clearUserName;
	private EditText userName;
	private Button login;
	private Button forgotPassword;
	private EditText password;
	private Button register;
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
	        super.onCreate(savedInstanceState);  
	        
	        
	        setContentView(R.layout.activity_fullscreen);  
	        
	        clearPassword = (Button) findViewById(R.id.bt_pwd_clear);//�������
			  showPassword = (Button) findViewById(R.id.bt_pwd_eye);//��ʾ����
			  clearUserName = (Button) findViewById(R.id.bt_username_clear);//����û���
			  userName = (EditText) findViewById(R.id.input_user);//�û���
			  login = (Button) findViewById(R.id.login);//��¼
			  forgotPassword = (Button) findViewById(R.id.login_error);//��������
			  password = (EditText) findViewById(R.id.password);//����
			  register = (Button) findViewById(R.id.register);//ע��
			  
			  login.setOnClickListener(new View.OnClickListener() {
				  public void onClick(View v)
					{
						clearUserName.setOnClickListener(this);
						setContentView(R.layout.login_to_go);
						if(LoginControllre.login(Content.getTextView(userName), Content.getEditText(password)))
						{
							setContentView(R.layout.login_succee);
						}
						else
						{
							Intent intent=new Intent();  
				            intent.setClass(LoginTurn.this,LoginTurn.class);  
				            //Intent intent=new Intent(IntentTest.this,MyActivity.class);  
				            startActivity(intent); 
//							setContentView(R.layout.activity_fullscreen);
						}
							
					}
	          });
	}
	
		
}
