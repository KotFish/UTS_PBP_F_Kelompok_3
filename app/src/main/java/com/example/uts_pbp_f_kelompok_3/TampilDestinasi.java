package com.example.uts_pbp_f_kelompok_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.nfc.cardemulation.CardEmulation;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.uts_pbp_f_kelompok_3.databinding.ActivityTampilDestinasiBinding;
import com.example.uts_pbp_f_kelompok_3.model.DaftarDestinasi;
import com.example.uts_pbp_f_kelompok_3.model.Destinasi;

import java.util.ArrayList;

public class TampilDestinasi extends AppCompatActivity {
    private ArrayList<Destinasi> DestinasiList = new DaftarDestinasi().Destinasi;
    private RVDestinasiAdapter rvDestinasiAdapter;
    private ImageButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTampilDestinasiBinding activityTampilDestinasiBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_tampil_destinasi);
        RecyclerView recyclerView = activityTampilDestinasiBinding.rvDestinasi;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        rvDestinasiAdapter = new RVDestinasiAdapter(DestinasiList);
        recyclerView.setAdapter(rvDestinasiAdapter);

        btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}