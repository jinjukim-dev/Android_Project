package com.example.sumin.mymuseum;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Reserve1Activity extends Activity {

    //데이터베이스
    SQLiteDatabase sqlDB;
    Boolean CheckEditTextEmpty;
    String Name, Date, Time;
    String query;

    Button btnDate;
    Button btnOk, btnCancle;
    EditText edtName;
    CalendarView datePick;
    Spinner spinTime;

    //date
    String date;
    Integer years, month, day;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reserve1);

        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancle = (Button) findViewById(R.id.btnCancle);
        datePick = (CalendarView) findViewById(R.id.datePick);
        spinTime = (Spinner) findViewById(R.id.spinTime);

        edtName = (EditText) findViewById(R.id.edtName);

        //spinner
        String[] Times = {"9:00", "10:00", "11:00", "12:00", "13:00", "14:00"};

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_dropdown_item_1line, Times);


        spinTime.setAdapter(adapter);

        datePick.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int monthOfYear, int dayOfMonth) {

                date = toString().format("%d-%d-%d", year, monthOfYear, dayOfMonth);
                years = year;
                month = monthOfYear + 1;
                day = dayOfMonth;
            }
        });


        //예약버튼
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBCreate();
                SubmitDataSQLiteDB();
            }
        });

        //취소
        btnCancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }

    //데이터베이스
    public void DBCreate() {
        sqlDB = openOrCreateDatabase("DB_museum", Context.MODE_PRIVATE, null);
        sqlDB.execSQL("CREATE TABLE IF NOT EXISTS reserveTable(name CHAR(100) primary key not null,date CHAR(100),time CHAR(100));");
    }

    public void SubmitDataSQLiteDB() {
        Name = edtName.getText().toString();
        Date = date;
        Time = spinTime.getSelectedItem().toString();

        CheckEditTextIsEmptyOrNot(Name,Date,Time);

        if (CheckEditTextEmpty) {
            query = "INSERT INTO reserveTable (name, date, time) VALUES ('" + Name + "','" + Date + "','" + Time + "');";
            sqlDB.execSQL(query);

            Toast.makeText(Reserve1Activity.this, "~예약되었습니다~", Toast.LENGTH_SHORT).show();
            ClearEditTextAfterDoneTask();

            Intent intent = new Intent(Reserve1Activity.this,Reserve2Activty.class);
            intent.putExtra("Name",Name);
            intent.putExtra("Date",Date);
            intent.putExtra("Time",Time);
            startActivity(intent);

            finish();
        } else {
            Toast.makeText(Reserve1Activity.this, "필드를 모두 입력해 주세요", Toast.LENGTH_SHORT).show();
        }
    }

    public void CheckEditTextIsEmptyOrNot(String Name, String Date, String Time) {
        if (TextUtils.isEmpty(Name)||TextUtils.isEmpty(Date)||TextUtils.isEmpty(Time))
            CheckEditTextEmpty = false;
        else
            CheckEditTextEmpty = true;
    }

    public void ClearEditTextAfterDoneTask() {
        edtName.getText().toString();
    }

}
