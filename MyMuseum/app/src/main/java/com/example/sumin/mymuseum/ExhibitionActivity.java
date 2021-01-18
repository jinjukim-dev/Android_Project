package com.example.sumin.mymuseum;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ExhibitionActivity extends Activity {

    ListView lvFloor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exhibition_main);

        lvFloor = (ListView)findViewById(R.id.lvFloor);

        final String [] floor = {"1층","2층","3층"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,floor);

        lvFloor.setAdapter(adapter);




        lvFloor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ExhibitionActivity.this,FloorActivity.class);
                intent.putExtra("index", position);
                startActivity(intent);
            }
        });


    }
}
