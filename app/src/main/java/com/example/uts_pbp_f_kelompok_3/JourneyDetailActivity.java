package com.example.uts_pbp_f_kelompok_3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class JourneyDetailActivity extends AppCompatActivity {
    private TextInputEditText tiHarga;
    private MaterialButton btnBuy;
    private ImageButton btnBack;
    boolean isAllFieldsChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journey_detail);
        tiHarga = findViewById(R.id.tiHarga);
        btnBuy = findViewById(R.id.btnBuy);
        btnBack = findViewById(R.id.btnBack);

        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isAllFieldsChecked = checkHarga();

                if(isAllFieldsChecked){
                    AlertDialog.Builder builder = new AlertDialog.Builder(JourneyDetailActivity.this);
                    builder.setTitle("Ticket")
                            .setMessage("Apakah Anda Ingin Membeli Ticket ini?")
                            .setPositiveButton("Batal", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    }).setNegativeButton("Beli", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                            finish();
                        }
                    }).show();
                }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }

    private boolean checkHarga(){
//        int value = Integer.parseInt(String.valueOf(tiHarga.getText()));

        if (tiHarga.length() == 0) {
            tiHarga.setError("This field is required");
            return false;
        }
//        else if (value <= 0)  {
//            tiHarga.setError("This field is required");
//            return false;
//        }

        return true;
    }
}