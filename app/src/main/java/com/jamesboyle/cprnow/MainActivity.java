package com.jamesboyle.cprnow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private Button mResponder, mPatient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPatient = (Button) findViewById(R.id.patient);
        mResponder = (Button) findViewById(R.id.responder);

        mResponder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ResponderLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PatientLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        FirebaseAuth.getInstance().signOut();
    }
}
