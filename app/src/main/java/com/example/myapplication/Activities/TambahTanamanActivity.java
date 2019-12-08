package com.example.myapplication.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.myapplication.R;

public class TambahTanamanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_tanaman);

        Spinner spinner = findViewById(R.id.jenis_tanaman_hias);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.jenis_tanaman_hias, android.R.layout.simple_spinner_item
        );


    }
}
