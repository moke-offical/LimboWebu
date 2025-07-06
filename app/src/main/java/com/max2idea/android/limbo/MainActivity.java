package com.max2idea.android.limbo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import com.max2idea.android.limbo.LimboEmuX86Activity;
import com.max2idea.android.limbo.LimboEmuArmActivity;
import com.max2idea.android.limbo.LimboEmuPPCActivity;
import com.max2idea.android.limbo.LimboEmuSunActivity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		Button ButtonX86 = (Button) findViewById(R.id.button_x86);
		ButtonX86.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View viewIn) {
				Intent ActivityX86 = new Intent(MainActivity.this, LimboEmuX86Activity.class);
				startActivity(ActivityX86);
			}

		});

		Button ButtonArm = (Button) findViewById(R.id.button_arm);
		ButtonArm.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View viewIn) {
				Intent ActivityArm = new Intent(MainActivity.this, LimboEmuArmActivity.class);
				startActivity(ActivityArm);
			}

		});

		Button ButtonPPC = (Button) findViewById(R.id.button_ppc);
		ButtonPPC.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View viewIn) {
				Intent ActivityPPC = new Intent(MainActivity.this, LimboEmuPPCActivity.class);
				startActivity(ActivityPPC);
			}

		});

		Button ButtonSun = (Button) findViewById(R.id.button_sun);
		ButtonSun.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View viewIn) {
				Intent ActivitySun = new Intent(MainActivity.this, LimboEmuSunActivity.class);
				startActivity(ActivitySun);
			}

		});
    }
}
