package com.example.yvtc.my042606;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by YVTC on 2017/4/26.
 */

public class MyHelper extends SQLiteOpenHelper {
    public static String DB_NAME ="phone1.sqlite";
    public static int VERSION = 2;
    public MyHelper(Context context) {
        super(context, DB_NAME,null,VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createSQL="CREATE TABLE \"students\" (\"_id\" INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , \"Name\" CHAR, \"Addr\" CHAR, \"Tel\" CHAR, \"Email\" CHAR)";
        db.execSQL(createSQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if(oldVersion ==1&&newVersion ==2){
            String sql = "ALTER TABLE \"main\".\"students\" ADD COLUMN \"Email\" CHAR";
            db.execSQL(sql);
        }
    }
}
