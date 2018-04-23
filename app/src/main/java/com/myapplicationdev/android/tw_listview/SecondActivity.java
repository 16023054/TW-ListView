package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayAdapter aa;
    ArrayList<Module> module;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv =  this.findViewById(R.id.lvModules);
        tvYear =  findViewById(R.id.tvYear);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);
        module = new ArrayList<Module>();

        if (year.equals("Year 1")){
            module.add(new Module("A113", false));
            module.add(new Module("B102", false));
            module.add(new Module("C105", true));
            module.add(new Module("C111", false));
            module.add(new Module("G101", false));
            module.add(new Module("C207", true));
            module.add(new Module("C208", true));
            module.add(new Module("C227", false));
            module.add(new Module("C294", false));
            module.add(new Module("G107", false));
            lv.setAdapter(aa);
        }else if (year.equals("Year 2")){
            module.add(new Module("C202", false));
            module.add(new Module("C203", true));
            module.add(new Module("C235", true));
            module.add(new Module("C318", false));
            module.add(new Module("C346", true));
            module.add(new Module("C236", true));
            module.add(new Module("C273", true));
            module.add(new Module("C308", true));
            module.add(new Module("C348", true));
            lv.setAdapter(aa);
        }else if (year.equals("Year 3")){
            module.add(new Module("C347", true));
            module.add(new Module("C302", true));
            module.add(new Module("C349", true));
            lv.setAdapter(aa);
        }


    }



}
