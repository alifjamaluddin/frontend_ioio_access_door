package net.kodegeek.frontendioio;

import info.androidhive.camerafileupload.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuMain extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_role);
	}

	public void visitorLogin(View view) {
		Intent intent = new Intent(this, VisitorLoginActivity.class);
		startActivity(intent);
	}

	public void workerLogin(View view) {
		Intent intent = new Intent(this, WorkerLoginActivity.class);
		startActivity(intent);
	}
}
