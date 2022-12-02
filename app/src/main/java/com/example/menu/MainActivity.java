package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
//
//    Button btn;
//    EditText username;
//    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this,LoginScreen.class));
                finish();
            }
        },3000);

//        btn=findViewById(R.id.button2);
//        username=findViewById(R.id.useride);
//        password=findViewById(R.id.passworde);


//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(),WelcomeScreen.class);
//                startActivity(i);
//            }
//        });




    }

    /**
     *
     */
//     @Override
//    public boolean onCreateOptionMenu(Menu menu){
//


//    Menu bar code

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//           inflater.inflate(R.menu.new_menu,menu);
//              return  true;
//    }


}