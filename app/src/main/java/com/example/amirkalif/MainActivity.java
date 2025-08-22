package com.example.amirkalif;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ImageView imgPhoto;
    private TextView tvName;
    private ListView lstMusician;
    private ArrayList<Musician> band;
    private MusicianAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        imgPhoto = findViewById(R.id.imgPhoto);
        tvName = findViewById(R.id.tvName);
        lstMusician = findViewById(R.id.lstMusician);
        ImageButton btnBack = findViewById(R.id.btnBack);

        band = new ArrayList<>();
        band.add(new Musician("Freddie Mercury", R.drawable.freddie_mercury));
        band.add(new Musician("Brian May", R.drawable.brian_may));
        band.add(new Musician("Roger Taylor", R.drawable.roger_taylor));
        band.add(new Musician("John Deacon", R.drawable.john_deacon));

        adapter = new MusicianAdapter(this, band);
        lstMusician.setAdapter(adapter);

        btnBack.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, SplashActivity.class));
            finish();
        });

        lstMusician.setOnItemClickListener((parent, view, position, id) -> {
            Musician selected = band.get(position);
            tvName.setText(selected.getName());
            imgPhoto.setImageResource(selected.getImageResId());
        });
    }
}
