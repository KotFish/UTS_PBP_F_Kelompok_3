package com.example.uts_pbp_f_kelompok_3.model;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.uts_pbp_f_kelompok_3.R;

public class Destinasi {
    private String nama_wisata, lokasi, deskripsi, url_gambar;
    private int harga, jumlah;

    public Destinasi(String nama_wisata, String lokasi, String deskripsi, String url_gambar, int harga, int jumlah) {
        this.nama_wisata = nama_wisata;
        this.lokasi = lokasi;
        this.deskripsi = deskripsi;
        this.url_gambar = url_gambar;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getNama_wisata() {
        return nama_wisata;
    }

    public void setNama_wisata(String nama_wisata) {
        this.nama_wisata = nama_wisata;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getUrl_gambar() {
        return url_gambar;
    }

    public void setUrl_gambar(String url_gambar) {
        this.url_gambar = url_gambar;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    @BindingAdapter({ "url_gambar" })
    public static void loadImage(ImageView imageView, String imageURL) {
        Glide.with(imageView.getContext())
                .setDefaultRequestOptions(new RequestOptions())
                .load(imageURL)
                .placeholder(R.drawable.ic_baseline_image_24)
                .into(imageView);
    }
}
