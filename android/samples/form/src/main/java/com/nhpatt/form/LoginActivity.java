package com.nhpatt.form;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import com.liferay.mobile.screens.auth.login.LoginListener;
import com.liferay.mobile.screens.auth.login.LoginScreenlet;
import com.liferay.mobile.screens.context.User;
import com.liferay.mobile.screens.util.LiferayLogger;

public class LoginActivity extends AppCompatActivity implements LoginListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		LoginScreenlet loginScreenlet = (LoginScreenlet) findViewById(R.id.login_screenlet);
		loginScreenlet.setListener(this);
	}

	@Override
	public void onLoginSuccess(User user) {
		startActivity(new Intent(this, SuccessActivity.class));
	}

	@Override
	public void onLoginFailure(Exception e) {
		LiferayLogger.e(e.getMessage(), e);
		Snackbar.make(findViewById(android.R.id.content), "Error! :(", Snackbar.LENGTH_LONG).show();
	}
}
