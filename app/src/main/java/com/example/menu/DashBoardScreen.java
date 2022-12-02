package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class DashBoardScreen extends AppCompatActivity {

    Button btnNext;


//    Drop down one

    String items_SubStation[]={"Select a Item","Sub Station 1", "Sub Station 2","Sub Station 3"};

    Spinner autoCompleteTextView_SubStation;

    ArrayAdapter<String> adapterItems_SubStation;

    // Drop Down two

    String items_SubDivision[]={"Sub Division 1", "Sub Division 2","Sub Division 3"};

    AutoCompleteTextView autoCompleteTextView_SubDivision;

    ArrayAdapter<String> adapterItems_SubDivision;

//    Drop Down Three

    String items_Area[]={"Area 1", "Area 2","Area 3"};

    AutoCompleteTextView autoCompleteTextView_Area;

    ArrayAdapter<String> adapterItems_Area;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board_screen);


//        Intent Activity

        btnNext=findViewById(R.id.button2);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),FunctionalScreen.class);
                startActivity(i);
            }
        });




//        Drop Down 1

//        autoCompleteTextView_SubStation=findViewById(R.id.sub_Station);

        adapterItems_SubStation=new ArrayAdapter<String>(this,R.layout.list_item,items_SubStation);
        autoCompleteTextView_SubStation.setAdapter(adapterItems_SubStation);

        autoCompleteTextView_SubStation.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public  void onItemClick(AdapterView<?> parent, View view, int position, long id){

                String item=parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"Item:"+item,Toast.LENGTH_LONG).show();
            }
        });


        adapterItems_SubDivision=new ArrayAdapter<String>(this,R.layout.list_item,items_SubDivision);
        autoCompleteTextView_SubDivision.setAdapter(adapterItems_SubDivision);

        autoCompleteTextView_SubDivision.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public  void onItemClick(AdapterView<?> parent, View view, int position, long id){

                String item=parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"Item:"+item,Toast.LENGTH_LONG).show();
            }
        });

//        Drop Down 3

//        autoCompleteTextView_Area=findViewById(R.id.auto_complete_textview3);
//
//        adapterItems_Area=new ArrayAdapter<String>(this,R.layout.list_item,items_Area);
//        autoCompleteTextView_Area.setAdapter(adapterItems_Area);
//
//        autoCompleteTextView_Area.setOnItemClickListener(new AdapterView.OnItemClickListener(){
//            @Override
//            public  void onItemClick(AdapterView<?> parent, View view, int position, long id){
//
//                String item=parent.getItemAtPosition(position).toString();
//                Toast.makeText(getApplicationContext(),"Item:"+item,Toast.LENGTH_LONG).show();
//            }
//        });

    }
}