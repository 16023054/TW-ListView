package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> al;
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) this.findViewById(R.id.lvYear);


        List<String> years = new ArrayList<>();
        years.add("Year 1");
        years.add("Year 2");
        years.add("Year 3");

        aa = new ArrayAdapter(this, android.R.layout.simple_list_item_1 , years);
        lv.setAdapter(aa);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent j = new Intent(FirstActivity.this, SecondActivity.class);
                int pos = lv.getPositionForView(view);
                if (pos==0){
                    j.putExtra("year",0);
                }
                else if (pos==1){
                    j.putExtra("year",1);
                }else{
                    j.putExtra("year",2);
                }
                startActivity(j);
            }
        });
    }
}
