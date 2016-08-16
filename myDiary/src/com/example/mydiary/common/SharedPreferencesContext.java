package com.example.mydiary.common;

import android.content.Context;
import android.content.ContextWrapper;

public  class SharedPreferencesContext extends ContextWrapper  {

	public SharedPreferencesContext(Context base) {
		super(base);
	}

}
