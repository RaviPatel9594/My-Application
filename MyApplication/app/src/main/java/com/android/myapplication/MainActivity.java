package com.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioGroup  radioGroup;
    private RadioButton gender;
    private EditText nameedittext,ageedittext,branchedittext,sapidedittext;
    private String name,branch;
    private Intent newactivity;
    private int getid,sapid,age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ravi", "onCreate: started");

        Button submitbtn=(Button) findViewById(R.id.submitbtn);
        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameedittext = (EditText) findViewById(R.id.nameEditText);
                ageedittext = (EditText) findViewById(R.id.ageEditText);
                branchedittext = (EditText) findViewById(R.id.branchEditText);
                sapidedittext = (EditText) findViewById(R.id.sapidEditText);
                Log.d("ravi", "onClick: started");
                radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
                name=nameedittext.getText().toString();
                branch=branchedittext.getText().toString();
               // String gender=genderEditText.getText().toString();
                sapid=Integer.valueOf(sapidedittext.getText().toString());
                Log.d("ravi", "onClick: 1");
                age=Integer.valueOf(ageedittext.getText().toString());
                Log.d("ravi", "onClick: 1");
                getid = radioGroup.getCheckedRadioButtonId();
                gender=(RadioButton)findViewById(getid);
                newactivity= new Intent(getApplicationContext(),Main2Activity.class);
                newactivity.putExtra("name",name);
                newactivity.putExtra("gender",gender.getText().toString());
                Log.d("ravi", "onClick: 1");
                newactivity.putExtra("branch",branch);
                newactivity.putExtra("age",age);
                newactivity.putExtra("sapid",sapid);
                //newactivity.putExtra("gender",gender);
                startActivity(newactivity);


            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ravi", "onStart: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ravi", "onPause: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ravi", "onResume: ");
    }
}
