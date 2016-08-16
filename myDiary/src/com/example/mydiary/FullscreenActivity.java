package com.example.mydiary;

import com.example.mydiary.common.Constan;
import com.example.mydiary.common.Content;
import com.example.mydiary.contoller.LoginControllre;
import com.example.mydiary.util.SystemUiHider;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public  class FullscreenActivity extends Activity 
{
	/**
	 * The instance of the {@link SystemUiHider} for this activity.
	 */
	private SystemUiHider mSystemUiHider;
	private Button clearPassword;
	private Button showPassword;
	private Button clearUserName;
	private EditText userName;
	private Button login;
	private Button forgotPassword;
	private EditText password;
	private Button register;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_fullscreen);
		  
		boolean share =  getSharedPreferences(Constan.SHAREDPREFERENCE_KEY,Activity.MODE_PRIVATE).contains(Constan.SHAREDPREFERENCE_KEY);
			  String user =getSharedPreferences(Constan.SHAREDPREFERENCE_KEY,Activity.MODE_PRIVATE).getString(Constan.USERNMAE,"");
			  String passd = getSharedPreferences(Constan.SHAREDPREFERENCE_KEY,Activity.MODE_PRIVATE).getString(Constan.PASSWORD,"");
			  if(LoginControllre.login(user,passd ))
				{
					setContentView(R.layout.login_succee);
				}
				
		  
		  clearPassword = (Button) findViewById(R.id.bt_pwd_clear);//清除密码
		  showPassword = (Button) findViewById(R.id.bt_pwd_eye);//显示密码
		  clearUserName = (Button) findViewById(R.id.bt_username_clear);//清除用户名
		  userName = (EditText) findViewById(R.id.input_user);//用户名
		  login = (Button) findViewById(R.id.login);//登录
		  forgotPassword = (Button) findViewById(R.id.login_error);//忘记密码
		  password = (EditText) findViewById(R.id.password);//密码
		  register = (Button) findViewById(R.id.register);//注册
		  if ( user == "" && passd == "")
		  {
			//onclick事件
//			  clearPassword.setOnClickListener(this);
//			  showPassword.setOnClickListener(this);
//			  clearUserName.setOnClickListener(this);
//			  userName.setOnClickListener(this);
			  login.setOnClickListener(new View.OnClickListener() {
				  public void onClick(View v)
					{
						clearUserName.setOnClickListener(this);
						setContentView(R.layout.login_to_go);
						String userNm = Content.getTextView(userName);
						String pass = Content.getEditText(password);
						if(LoginControllre.login(userNm,pass ))
						{
							SharedPreferences.Editor sharedPreference =  getSharedPreferences(Constan.SHAREDPREFERENCE_KEY,Activity.MODE_PRIVATE).edit();
//							 SharedPreferenceStore sharedPreference =  new SharedPreferenceStore(Constan.SHAREDPREFERENCE_KEY,Activity.MODE_PRIVATE);
							sharedPreference.putString("userName", userNm);
							sharedPreference.putString("password", pass);
							sharedPreference.commit();
//							 sharedPreference.setStringSharedPreferen("userName", userNm);
//							 sharedPreference.setStringSharedPreferen("password", pass);
							 setContentView(R.layout.login_succee);
						}
						else
						{
							Intent intent=new Intent();  
				            intent.setClass(FullscreenActivity.this,LoginTurn.class);  
				            startActivity(intent); 
						}
							
					}

			});
//			  forgotPassword.setOnClickListener(this);
//			  password.setOnClickListener(this);
//			  register.setOnClickListener(this);
		  
		  }
		  
		
	}


	@Override
	public void onBackPressed()
	{
		
		System.out.println("返回了");
		SharedPreferences.Editor sharedPreference =  getSharedPreferences(Constan.SHAREDPREFERENCE_KEY,Activity.MODE_PRIVATE).edit();
		sharedPreference.clear();
		sharedPreference.commit();
		
	};


	
}
