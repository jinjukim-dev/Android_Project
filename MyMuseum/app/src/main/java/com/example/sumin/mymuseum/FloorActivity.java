package com.example.sumin.mymuseum;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by sumin on 2018-07-17.
 */

public class FloorActivity extends Activity {

    ListView lvFloor;
    ImageView imgMap;
    TextView txtFloor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.floor);

        lvFloor = (ListView) findViewById(R.id.lvFloor);
        imgMap = (ImageView) findViewById(R.id.imgMap);
        txtFloor = (TextView) findViewById(R.id.txtFloor);

        final String[] first = new String[]{"② 전쟁역사실 Ⅰ , Ⅱ"};
        final String[] second = new String[]{"① 호국추모실", "③ 6.25전쟁실 Ⅰ", "④ 6.25전쟁실 Ⅱ", "⑨ 대형장비실"};
        final String[] thrid = new String[]{"⑤ 유엔실", "⑥ 기증실", "⑦ 해외파병실", "⑧ 국군발전실"};

        Intent intent = getIntent();
        final int index = intent.getIntExtra("index", 0);

        final ArrayAdapter<String> adapter;

        switch (index) {
            case 0:
                txtFloor.setText("1층");
                imgMap.setImageResource(R.drawable.first);
                adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, first);
                lvFloor.setAdapter(adapter);
                break;
            case 1:
                txtFloor.setText("2층");
                imgMap.setImageResource(R.drawable.second);
                adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, second);
                lvFloor.setAdapter(adapter);
                break;
            case 2:
                txtFloor.setText("3층");
                imgMap.setImageResource(R.drawable.third);
                adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, thrid);
                lvFloor.setAdapter(adapter);
                break;
        }

        lvFloor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Intent intent = new Intent(FloorActivity.this,RoomActivity.class);
                intent.putExtra("index", index);
                intent.putExtra("i",i);
                startActivity(intent);

//                View dlgview = (View) View.inflate(FloorActivity.this, R.layout.dialog1, null);
//                AlertDialog.Builder dlg = new AlertDialog.Builder(FloorActivity.this);
//
//                ImageView ivContent = (ImageView)dlgview.findViewById(R.id.ivContent);
//                TextView tvContent = (TextView) dlgview.findViewById(R.id.tvContent);
//                tvContent.setText("설명");



//                dlg.setView(dlgview);
//                dlg.setPositiveButton("닫기", null);
//                dlg.show();

            }
        });
    }

}
