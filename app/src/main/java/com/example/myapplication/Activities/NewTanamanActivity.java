package com.example.myapplication.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Toast;

import com.example.myapplication.Data.Tanaman;
import com.example.myapplication.R;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class NewTanamanActivity extends AppCompatActivity {
    private EditText editTextTanaman;
    private EditText editTextJenis;
    private NumberPicker numberPickerPriority;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_tanaman);

        editTextTanaman = findViewById(R.id.edit_text_nama_tanaman);
        editTextJenis = findViewById(R.id.edit_text_jenis_tanaman);
        numberPickerPriority = findViewById(R.id.number_picker_priority);

        numberPickerPriority.setMinValue(1);
        numberPickerPriority.setMaxValue(10);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.new_tanaman_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.save_note:
                saveNote();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }

    private void saveNote() {
        String nama_tanaman = editTextTanaman.getText().toString();
        String jenis_tanaman = editTextJenis.getText().toString();
        int priority = numberPickerPriority.getValue();

        if(nama_tanaman.trim().isEmpty() || jenis_tanaman.trim().isEmpty()){
            Toast.makeText(this, "Tolong masukkan nama tanaman dan jenis tanaman", Toast.LENGTH_SHORT).show();
            return;
        }

        CollectionReference notebookRef = FirebaseFirestore.getInstance()
                .collection("Notebook");
        notebookRef.add(new Tanaman(nama_tanaman, jenis_tanaman, priority));
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        finish();
    }
}
