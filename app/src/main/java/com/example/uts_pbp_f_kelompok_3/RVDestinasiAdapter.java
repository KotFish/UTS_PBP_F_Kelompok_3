package com.example.uts_pbp_f_kelompok_3;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uts_pbp_f_kelompok_3.databinding.ActivityJourneyDetailBinding;
import com.example.uts_pbp_f_kelompok_3.databinding.ActivityRVDestinasiAdapterBinding;
import com.example.uts_pbp_f_kelompok_3.model.Destinasi;

import java.util.ArrayList;

public class RVDestinasiAdapter extends RecyclerView.Adapter<RVDestinasiAdapter.DestinasiViewHolder>  {
    private ArrayList<Destinasi> DestinasiList;

    public RVDestinasiAdapter(ArrayList<Destinasi> DestinasiList) {
        this.DestinasiList = DestinasiList;
    }

    @NonNull
    @Override
    public DestinasiViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ActivityRVDestinasiAdapterBinding activityRVDestinasiAdapterBinding =
                DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()),
                        R.layout.activity_r_v_destinasi_adapter, viewGroup, false);
        return new DestinasiViewHolder(activityRVDestinasiAdapterBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull DestinasiViewHolder destinasiViewHolder, int i) {
        Destinasi currentDestinasi = DestinasiList.get(i);
        destinasiViewHolder.activityRVDestinasiAdapterBinding.setDes(currentDestinasi);
//        ActivityJourneyDetailBinding binding = DataBindingUtil.inflate(LayoutInflater.from(destinasiViewHolder.itemView.getContext()), R.layout.activity_journey_detail, null, false);
//        binding.setDet(currentDestinasi);
        destinasiViewHolder.activityRVDestinasiAdapterBinding.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(destinasiViewHolder.activityRVDestinasiAdapterBinding.cardView.getContext());
                builder
                        .setTitle("Ticket")
                        .setMessage("Apakah ingin membeli tiket?")
//                        .setView(binding.getRoot())
                        .setPositiveButton("Batal", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).setNegativeButton("Beli", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(destinasiViewHolder.activityRVDestinasiAdapterBinding.cardView.getContext(),
                                "Tiket Berhasil Dibeli!", Toast.LENGTH_SHORT)
                                .show();

                    }
                }).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        if (DestinasiList != null) {
            return DestinasiList.size();
        } else {
            return 0;
        }
    }

    public class DestinasiViewHolder extends RecyclerView.ViewHolder {
        private ActivityRVDestinasiAdapterBinding activityRVDestinasiAdapterBinding;

        public DestinasiViewHolder(@NonNull ActivityRVDestinasiAdapterBinding activityRVDestinasiAdapterBinding) {
            super(activityRVDestinasiAdapterBinding.getRoot());
            this.activityRVDestinasiAdapterBinding = activityRVDestinasiAdapterBinding;
        }
    }
}
