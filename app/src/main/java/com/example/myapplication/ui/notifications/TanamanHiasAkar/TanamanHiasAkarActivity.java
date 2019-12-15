package com.example.myapplication.ui.notifications.TanamanHiasAkar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.R;
import com.example.myapplication.ui.notifications.TanamanHiasAkar.InformasiTanamanHiasAkar.BonsaiActivity;

public class TanamanHiasAkarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanaman_hias_akar);
    }

    public void bonsai(View view) {

        Intent intent = new Intent(this, BonsaiActivity.class);
        startActivity(intent);
    }
}
