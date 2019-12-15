package com.example.myapplication.ui.notifications.TanamanHiasBuah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.R;
import com.example.myapplication.ui.notifications.TanamahHiasBatang.InformasiTanamanHiasBatang.BambuKuningActivity;
import com.example.myapplication.ui.notifications.TanamanHiasBuah.InformasiTanamanHiasBuah.BuahLemonActivity;
import com.example.myapplication.ui.notifications.TanamanHiasBuah.InformasiTanamanHiasBuah.BuahNagaActivity;

public class TanamanHiasBuahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanaman_hias_buah);
    }

    public void naga(View view) {
        Intent intent = new Intent(this, BuahNagaActivity.class);
        startActivity(intent);
    }

    public void lemon(View view) {
        Intent intent = new Intent(this, BuahLemonActivity.class);
        startActivity(intent);
    }
}
