package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

public class FunctionalScreen extends AppCompatActivity {

    ToggleButton toggleButton;
    ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_functional_screen);


//        Toggle switch code

        toggleButton=findViewById(R.id.togglebutton);
        imageView=findViewById(R.id.imageview);

        imageView.setImageDrawable(getResources().getDrawable(R.drawable.off));
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.on));


        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(toggleButton.isChecked()){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.on));

                }else{
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.off));

                }
            }
        });

////    Seek Bar

        TextView percentagetxt=findViewById(R.id.percentagetxt);
        SeekBar seekBar=findViewById(R.id.seekBar);
//
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {

                percentagetxt.setVisibility(View.VISIBLE);

                percentagetxt.setText(progress+"%");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

//        Back Button

        Button backButton=findViewById(R.id.backButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),DashBoardScreen.class);
                startActivity(i);
            }
        });

//        Home Button

        Button homeButton=findViewById(R.id.homeButton);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });


//        Status Button

        Button button=findViewById(R.id.status1);
        Dialog dialog=new Dialog(FunctionalScreen.this);
        dialog.setContentView(R.layout.dialog);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.background));

        Button ok =dialog.findViewById(R.id.btn1);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
            }
        });



    }
}