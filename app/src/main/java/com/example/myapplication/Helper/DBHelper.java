package com.example.myapplication.Helper;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    /** deklarasi konstanta-konstanta yang digunakan pada database, seperti nama tabel,
     nama-nama kolom, nama database, dan versi dari database **/

    private static final String db_name = "inventori.db";
    private static final int db_version = 1;

    public static final String TABLE_NAME = "tabel_tanaman";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "nama_tanaman";
    public static final String COLUMN_JENIS = "jenis_tanaman";


    // Perintah SQL untuk membuat tabel database baru

    private static final String db_create = "create table "
            + TABLE_NAME + "("
            + COLUMN_ID +" integer primary key autoincrement, "
            + COLUMN_NAME+ " varchar(50) not null,"
            + COLUMN_JENIS+ " varchar(50) not null);";

    public DBHelper(@Nullable Context context) {
        super(context, db_name, null, db_version);

        // Auto generated
    }

    // mengeksekusi perintah SQL diatas untuk membuat tabel database baru

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(db_create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(DBHelper.class.getName(), "Upgrade database from version " + oldVersion + " to "
                + newVersion + ", which will destroy all old data");

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);

        onCreate(db);
    }
}

