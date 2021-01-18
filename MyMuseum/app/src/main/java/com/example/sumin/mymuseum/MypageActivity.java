package com.example.sumin.mymuseum;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MypageActivity extends Activity {

    ListView reserveList;

    //db
    ArrayList<String> arraySj;
    ArrayAdapter adapterSj;
    SQLiteDatabase sqlDB;
    String query;

    String Name, Date, Time;
    String reserveInfo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mypage);

        reserveList = (ListView)findViewById(R.id.reserveList);

        DBCreate();
        Cursor allrows = sqlDB.rawQuery("SELECT * FROM reserveTable", null);

        ArrayList<String> info = new ArrayList<String>();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,info);
        reserveList.setAdapter(adapter);

        while (allrows.moveToNext()){

            Name = allrows.getString(0);
            Date = allrows.getString(1);
            Time = allrows.getString(2);

            reserveInfo = "예약자: "+Name+"/ 날짜: "+ Date+" /시간: "+Time;

            info.add(reserveInfo);
        }



    }

    public void DBCreate() {
        sqlDB = openOrCreateDatabase("DB_museum", Context.MODE_PRIVATE, null);
        sqlDB.execSQL("CREATE TABLE IF NOT EXISTS reserveTable(name CHAR(100) primary key not null,date CHAR(100),time CHAR(100));");
    }
}