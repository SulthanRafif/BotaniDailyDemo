package com.example.myapplication.ui.notifications.TanamanHiasBunga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.R;
import com.example.myapplication.ui.notifications.TanamanHiasBuah.InformasiTanamanHiasBuah.BuahLemonActivity;
import com.example.myapplication.ui.notifications.TanamanHiasBunga.InformasiTanamanHiasBunga.BungaAnggrekActivity;
import com.example.myapplication.ui.notifications.TanamanHiasBunga.InformasiTanamanHiasBunga.BungaKambojaActivity;
import com.example.myapplication.ui.notifications.TanamanHiasBunga.InformasiTanamanHiasBunga.BungaKembangSepatuActivity;
import com.example.myapplication.ui.notifications.TanamanHiasBunga.InformasiTanamanHiasBunga.BungaMawarActivity;
import com.example.myapplication.ui.notifications.TanamanHiasBunga.InformasiTanamanHiasBunga.BungaMelatiActivity;

public class TanamanHiasBungaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanaman_hias_bunga);
    }

    public void anggrek(View view) {
        Intent intent = new Intent(this, BungaAnggrekActivity.class);
        startActivity(intent);
    }

    public void mawar(View view) {
        Intent intent = new Intent(this, BungaMawarActivity.class);
        startActivity(intent);
    }

    public void melati(View view) {
        Intent intent = new Intent(this, BungaMelatiActivity.class);
        startActivity(intent);
    }

    public void kembangSepatu(View view) {
        Intent intent = new Intent(this, BungaKembangSepatuActivity.class);
        startActivity(intent);
    }

    public void kamboja(View view) {
        Intent intent = new Intent(this, BungaKambojaActivity.class);
        startActivity(intent);
    }
}
