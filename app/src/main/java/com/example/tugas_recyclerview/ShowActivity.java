package com.example.tugas_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {
    ActionBar actionBar;
    TextView tvBPName,tvBPS;
    ImageView imgBPlogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        actionBar =getActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvBPName=findViewById(R.id.show_bp_name);
        tvBPS=findViewById(R.id.show_pb_s);
        imgBPlogo=findViewById(R.id.show_bp_logo);

        String name= getIntent().getStringExtra("name");
        String S=getIntent().getStringExtra("s");
        int logo=getIntent().getIntExtra("logo",R.mipmap.ic_launcher);

        tvBPName.setText(name);
        tvBPS.setText(S);
        imgBPlogo.setImageResource(logo);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}