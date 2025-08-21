package com.example.amirkalif;

import android.os.Bundle;
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

        imgPhoto = findViewById(R.id.imgPhoto);
        tvName = findViewById(R.id.tvName);
        lstMusician = findViewById(R.id.lstMusician);

        band = new ArrayList<>();
        band.add(new Musician("Freddie", "Mercury", "freddie_mercury"));
        band.add(new Musician("Brian", "May", "brian_may"));
        band.add(new Musician("Roger", "Taylor", "roger_taylor"));
        band.add(new Musician("John", "Deacon", "john_deacon"));

        adapter = new MusicianAdapter(this, band);
        lstMusician.setAdapter(adapter);

        lstMusician.setOnItemClickListener((parent, view, position, id) -> {
            Musician selected = band.get(position);
            tvName.setText(selected.toString());
            int imgId = getResources().getIdentifier(
                    selected.getImageFile(), "drawable", getPackageName());
            if (imgId != 0) {
                imgPhoto.setImageResource(imgId);
            } else {
                imgPhoto.setImageResource(R.drawable.placeholder);
            }
        });
    }
}
