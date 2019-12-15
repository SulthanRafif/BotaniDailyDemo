package com.example.myapplication.ui.notifications.TanamanHiasDaun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.R;
import com.example.myapplication.ui.notifications.TanamanHiasAkar.InformasiTanamanHiasAkar.BonsaiActivity;

public class TanamanHiasDaunActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanaman_hias_daun);
    }

    public void palemKuning(View view) {

        Intent intent = new Intent(this, PalemKuningActivity.class);
        startActivity(intent);
    }
}
