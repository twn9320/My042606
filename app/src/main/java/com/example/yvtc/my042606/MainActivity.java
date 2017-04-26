package com.example.yvtc.my042606;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyHelper helper = new MyHelper(MainActivity.this);
        SQLiteDatabase db =helper.getWritableDatabase();
        db.close();
    }

    class MyHelper extends SQLiteOpenHelper{

        public MyHelper(Context context) {
            super(context, "phone1.sqlite",null,1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            String createSQL="CREATE TABLE \"students\" (\"_id\" INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , \"Name\" CHAR, \"Addr\" CHAR, \"Tel\" CHAR)";
            db.execSQL(createSQL);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    }
}
