package com.nhpatt.form;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.liferay.mobile.screens.context.LiferayScreensContext;
import com.liferay.mobile.screens.context.SessionContext;
import com.liferay.mobile.screens.context.storage.CredentialsStorageBuilder;
import com.liferay.mobile.screens.ddl.form.DDLFormListener;
import com.liferay.mobile.screens.ddl.model.DocumentField;
import com.liferay.mobile.screens.ddl.model.Record;
import java.util.Map;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity implements DDLFormListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		LiferayScreensContext.init(this);
		SessionContext.loadStoredCredentials(CredentialsStorageBuilder.StorageType.SHARED_PREFERENCES);

		startActivity(new Intent(this, SessionContext.isLoggedIn() ? SuccessActivity.class : LoginActivity.class));
	}

	@Override
	protected void onResume() {
		super.onResume();

		//new Handler().postDelayed(new Runnable() {
		//	@Override
		//	public void run() {
		//		DDLFormScreenlet ddlFormScreenlet = (DDLFormScreenlet) findViewById(R.id.ddl_form);
		//		ddlFormScreenlet.load();
		//		ddlFormScreenlet.setListener(MainActivity.this);
		//	}
		//}, 2000);
	}

	@Override
	public void error(Exception e, String userAction) {

	}

	@Override
	public void onDDLFormLoaded(Record record) {

	}

	@Override
	public void onDDLFormRecordLoaded(Record record, Map<String, Object> valuesAndAttributes) {

	}

	@Override
	public void onDDLFormRecordAdded(Record record) {
		startActivity(new Intent(this, MainActivity.class));
	}

	@Override
	public void onDDLFormRecordUpdated(Record record) {

	}

	@Override
	public void onDDLFormDocumentUploaded(DocumentField documentField, JSONObject jsonObject) {

	}

	@Override
	public void onDDLFormDocumentUploadFailed(DocumentField documentField, Exception e) {

	}
}
