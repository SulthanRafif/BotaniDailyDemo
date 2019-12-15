package com.example.myapplication.ui.notifications.TanamahHiasBatang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.R;
import com.example.myapplication.ui.notifications.TanamahHiasBatang.InformasiTanamanHiasBatang.BambuKuningActivity;
import com.example.myapplication.ui.notifications.TanamanHiasAkar.InformasiTanamanHiasAkar.BonsaiActivity;

public class TanamanHiasBatangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanaman_hias_batang);
    }

    public void bambuKuning(View view) {

        Intent intent = new Intent(this, BambuKuningActivity.class);
        startActivity(intent);
    }
}
