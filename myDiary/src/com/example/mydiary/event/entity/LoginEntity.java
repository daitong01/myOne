package com.example.mydiary.event.entity;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginEntity
{
	private Button clearPassword;//�������
	private Button showPassword;//��ʾ����
	private Button clearUserName;//�������
	private TextView userName;//�û���
	private Button login;//��¼
	private Button forgotPassword;//��������
	private EditText password;//����
	private Button register;//ע��
	
	/**
	 * �������
	 * @return
	 */
	public Button getClearPassword() {
		return clearPassword;
	}
	/**
	 * �������
	 * @return
	 */
	public void setClearPassword(Button clearPassword) {
		this.clearPassword = clearPassword;
	}
	/**
	 * ��ʾ����
	 * @return
	 */
	public Button getShowPassword() {
		return showPassword;
	}
	/**
	 * ��ʾ����
	 * @return
	 */
	public void setShowPassword(Button showPassword) {
		this.showPassword = showPassword;
	}
	/**
	 * ����û���
	 * @return
	 */
	public Button getClearUserName() {
		return clearUserName;
	}
	/**
	 * ����û���
	 * @return
	 */
	public void setClearUserName(Button clearUserName) {
		this.clearUserName = clearUserName;
	}
	/**
	 * �û���
	 * @return
	 */
	public TextView getUserName() {
		return userName;
	}
	/**
	 * �û���
	 * @return
	 */
	public void setUserName(TextView userName) {
		this.userName = userName;
	}
	/**
	 * ��¼��ť
	 * @return
	 */
	public Button getLogin() {
		return login;
	}
	/**
	 * ��¼��ť
	 * @return
	 */
	public void setLogin(Button login) {
		this.login = login;
	}
	/**
	 * ��������
	 * @return
	 */
	public Button getForgotPassword() {
		return forgotPassword;
	}
	/**
	 * ��������
	 * @return
	 */
	public void setForgotPassword(Button forgotPassword) {
		this.forgotPassword = forgotPassword;
	}
	/**
	 * ����
	 * @return
	 */
	public EditText getPassword() {
		return password;
	}
	/**
	 * ����
	 * @return
	 */
	public void setPassword(EditText password) {
		this.password = password;
	}
	/**
	 * ע��
	 * @return
	 */
	public Button getRegister() {
		return register;
	}
	/**
	 * ע��
	 * @return
	 */
	public void setRegister(Button register) {
		this.register = register;
	}
	
	
	
}
