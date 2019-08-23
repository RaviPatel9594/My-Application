package com.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView nametextview,agetextview,branchtextview,gendertextview,sapidtextview;
    private String name,branch,gender;
    private int sapid,age;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        nametextview=(TextView)findViewById(R.id.nametextview);
        name=getIntent().getExtras().getString("name");
        nametextview.setText(name);
        agetextview=(TextView)findViewById(R.id.ageTextView);
        age=getIntent().getExtras().getInt("age");
        agetextview.setText(age+"");
        branchtextview=(TextView)findViewById(R.id.branchTextView);
        branch=getIntent().getExtras().getString("branch");
        branchtextview.setText(branch);
        gendertextview=(TextView)findViewById(R.id.genderTextVIew);
        gender=getIntent().getExtras().getString("gender");
        gendertextview.setText(gender);
        sapidtextview=(TextView)findViewById(R.id.sapidTextView);
        sapid=Integer.valueOf(getIntent().getExtras().getInt("sapid"));
        sapidtextview.setText(sapid+"");

    }
}
