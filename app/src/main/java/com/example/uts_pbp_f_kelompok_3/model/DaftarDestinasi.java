package com.example.uts_pbp_f_kelompok_3.model;

import java.util.ArrayList;

public class DaftarDestinasi {
    public ArrayList<Destinasi> Destinasi;

    public DaftarDestinasi() {
        Destinasi = new ArrayList();
        Destinasi.add(Bukit_Kelam);
        Destinasi.add(Pantai_Kuta);
        Destinasi.add(Pasir_Panjang);
    }

    public static final Destinasi Bukit_Kelam = new Destinasi("Bukit Kelam", "Sintang",
            "Bukit Kelam adalah ....", "https://upload.wikimedia.org/wikipedia/commons/9/93/Bukit_Kelam_Sintang.jpg", 20000, 0);

    public static final Destinasi Pantai_Kuta = new Destinasi("Pantai Kuta", "Bali",
            "Pantai Kuta adalah .....", "https://upload.wikimedia.org/wikipedia/commons/1/1b/PantaiKutaSore.jpg", 99999, 0);

    public static final Destinasi Pasir_Panjang = new Destinasi("Pasir Panjang", "Singkawang",
            "Pasir Panjang adalah ....", "https://upload.wikimedia.org/wikipedia/id/3/36/PasirPanjang.jpg", 30000, 0);
}
