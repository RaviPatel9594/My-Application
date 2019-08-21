package com.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView nametextview=(TextView)findViewById(R.id.nametextview);
        String name=getIntent().getExtras().getString("name");
        nametextview.setText(name);
        TextView agetextview=(TextView)findViewById(R.id.ageTextView);
        int age=getIntent().getExtras().getInt("age");
        agetextview.setText(age+"");
        TextView branchtextview=(TextView)findViewById(R.id.branchTextView);
        String branch=getIntent().getExtras().getString("branch");
        branchtextview.setText(branch);
        TextView gendertextview=(TextView)findViewById(R.id.genderTextVIew);
        String gender=getIntent().getExtras().getString("gender");
        gendertextview.setText(gender);
        TextView sapidtextview=(TextView)findViewById(R.id.sapidTextView);
        int sapid=Integer.valueOf(getIntent().getExtras().getInt("sapid"));
        sapidtextview.setText(sapid+"");

    }
}
