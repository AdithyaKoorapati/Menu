package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class WelcomeScreen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

//        Button
        Button btn=findViewById(R.id.nextButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),FunctionalScreen.class);
                startActivity(i);

            }
        });

        Spinner spinner=findViewById(R.id.subStation);
        String[] station={"Select","Station 1","Station 2","Station 3","Station 4"};
        ArrayAdapter ad=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,station);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(ad);

        Spinner spinner1=findViewById(R.id.street);
        String[] st={"Select","Street 1","Street 2","Street 3","Street 4"};
        ArrayAdapter st1=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,st);
        st1.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner1.setAdapter(st1);

        Spinner spinner2=findViewById(R.id.area);
        String[] area={"Select","Area 1","Area 2","Area 3","Area 4"};
        ArrayAdapter ar=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,area);
        ar.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner2.setAdapter(ar);
    }
}