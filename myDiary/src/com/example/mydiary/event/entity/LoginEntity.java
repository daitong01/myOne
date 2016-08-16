package com.example.mydiary.event.entity;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginEntity
{
	private Button clearPassword;//清除密码
	private Button showPassword;//显示密码
	private Button clearUserName;//清除密码
	private TextView userName;//用户名
	private Button login;//登录
	private Button forgotPassword;//忘记密码
	private EditText password;//密码
	private Button register;//注册
	
	/**
	 * 清除密码
	 * @return
	 */
	public Button getClearPassword() {
		return clearPassword;
	}
	/**
	 * 清除密码
	 * @return
	 */
	public void setClearPassword(Button clearPassword) {
		this.clearPassword = clearPassword;
	}
	/**
	 * 显示密码
	 * @return
	 */
	public Button getShowPassword() {
		return showPassword;
	}
	/**
	 * 显示密码
	 * @return
	 */
	public void setShowPassword(Button showPassword) {
		this.showPassword = showPassword;
	}
	/**
	 * 清除用户名
	 * @return
	 */
	public Button getClearUserName() {
		return clearUserName;
	}
	/**
	 * 清除用户名
	 * @return
	 */
	public void setClearUserName(Button clearUserName) {
		this.clearUserName = clearUserName;
	}
	/**
	 * 用户名
	 * @return
	 */
	public TextView getUserName() {
		return userName;
	}
	/**
	 * 用户名
	 * @return
	 */
	public void setUserName(TextView userName) {
		this.userName = userName;
	}
	/**
	 * 登录按钮
	 * @return
	 */
	public Button getLogin() {
		return login;
	}
	/**
	 * 登录按钮
	 * @return
	 */
	public void setLogin(Button login) {
		this.login = login;
	}
	/**
	 * 忘记密码
	 * @return
	 */
	public Button getForgotPassword() {
		return forgotPassword;
	}
	/**
	 * 忘记密码
	 * @return
	 */
	public void setForgotPassword(Button forgotPassword) {
		this.forgotPassword = forgotPassword;
	}
	/**
	 * 密码
	 * @return
	 */
	public EditText getPassword() {
		return password;
	}
	/**
	 * 密码
	 * @return
	 */
	public void setPassword(EditText password) {
		this.password = password;
	}
	/**
	 * 注册
	 * @return
	 */
	public Button getRegister() {
		return register;
	}
	/**
	 * 注册
	 * @return
	 */
	public void setRegister(Button register) {
		this.register = register;
	}
	
	
	
}
