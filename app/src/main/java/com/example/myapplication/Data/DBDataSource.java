package com.example.myapplication.Data;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.myapplication.Data.Tanaman;
import com.example.myapplication.Helper.DBHelper;

import java.util.ArrayList;

public class DBDataSource {

    // inisialisasi SQLite Database
    private SQLiteDatabase database;

    // inisialisasi kelas DBHelper
    private DBHelper dbHelper;

    // ambil semua nama kolom
    private String[] allColumns = {DBHelper.COLUMN_ID, DBHelper.COLUMN_NAME, DBHelper.COLUMN_JENIS};

    // DBHelper diinstansiasi pada constructor
    public DBDataSource(Context context){
        dbHelper = new DBHelper(context);
    }

    // membuka / membuat sambungan baru ke database

    public void open() throws SQLException{
        database = dbHelper.getWritableDatabase();
    }

    // menutup sambungan ke database

    public void close(){
        dbHelper.close();
    }

    // method untuk create / insert tanaman ke database

    public Tanaman createTanaman(String nama, String jenis){

        // membuat sebuah ContentValues, yang berfungsi untuk memasangkan data dengan nama-nama kolom pada database

        ContentValues values = new ContentValues();

        values.put(DBHelper.COLUMN_NAME, nama);
        values.put(DBHelper.COLUMN_JENIS, jenis);

        // mengeksekusi perintah SQL insert data yang akan mengembalikan sebuah insert ID

        long insertId = database.insert(DBHelper.TABLE_NAME, null, values);

        // setelah data dimasukkan,
        // memanggil perintah SQL Select menggunakan Cursor untuk
        // melihat apakah data tadi benar2 sudah masuk
        // dengan menyesuaikan ID = insertID

        Cursor cursor = database.query(DBHelper.TABLE_NAME, allColumns, DBHelper.COLUMN_ID + " = " + insertId, null,null, null, null);

        // pindah ke data paling pertama

        cursor.moveToFirst();

        // mengubah objek pada kursor pertama tadi
        // ke dalam objek tanaman

        Tanaman newTanaman = cursorToTanaman(cursor);

        // close cursor

        cursor.close();

        // mengembalikan tanaman baru
        return newTanaman;

    }

    private Tanaman cursorToTanaman(Cursor cursor) {

        // buat objek tanaman baru

        Tanaman tanaman = new Tanaman();
        // debug LOGCAT
        Log.v("info", "The getLONG "+cursor.getLong(0));
        Log.v("info", "The setLatLng "+cursor.getString(1)+","+cursor.getString(2));

        /* Set atribut pada objek tanaman dengan data kursor yang diambil dari database*/

        tanaman.setId(cursor.getLong(0));
        tanaman.setNama_tanaman(cursor.getString(1));
        tanaman.setJenis_tanaman(cursor.getString(2));

        //kembalikan sebagai objek tanaman

        return tanaman;
    }

    public ArrayList<Tanaman> getAllTanaman(){
        ArrayList<Tanaman> daftarTanaman = new ArrayList<Tanaman>();

        // select all SQL query
        Cursor cursor = database.query(DBHelper.TABLE_NAME, allColumns, null, null, null, null, null);

        // pindah ke data paling pertama

        cursor.moveToFirst();

        // jika masih ada data, masukkan data tanaman ke daftar tanaman

        while(!cursor.isAfterLast()){
            Tanaman tanaman =cursorToTanaman(cursor);
            daftarTanaman.add(tanaman);
            cursor.moveToNext();
        }

        // make sure to close the cursor

        cursor.close();
        return daftarTanaman;
    }

    //ambil satu tanaman sesuai id
    public Tanaman getTanaman(long id)
    {       Tanaman tanaman = new Tanaman(); //inisialisasi tanaman
        // select query
        Cursor cursor = database.query(DBHelper.TABLE_NAME, allColumns, "_id ="+id, null, null, null, null);
        //ambil data yang pertama
        cursor.moveToFirst();
        //masukkan data cursor ke objek tanaman
        tanaman = cursorToTanaman(cursor);
        //tutup sambungan
        cursor.close();
        //return tanaman
        return tanaman;
    }

    //update tanaman yang diedit
    public void updateTanaman(Tanaman b)
    {
        //ambil id tanaman
        String strFilter = "_id=" + b.getId();
        //memasukkan ke content values
        ContentValues args = new ContentValues();
        //masukkan data sesuai dengan kolom pada database
        args.put(DBHelper.COLUMN_NAME, b.getNama_tanaman());
        args.put(DBHelper.COLUMN_JENIS, b.getJenis_tanaman());

        //update query
        database.update(DBHelper.TABLE_NAME, args, strFilter, null);
    }

    // delete tanaman sesuai ID
    public void deleteTanaman(long id)
    {
        String strFilter = "_id=" + id;
        database.delete(DBHelper.TABLE_NAME, strFilter, null);
    }

}
