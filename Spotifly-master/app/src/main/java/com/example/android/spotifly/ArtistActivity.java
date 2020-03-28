package com.example.android.spotifly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        ArrayList<Categoryitem> artist = new ArrayList<>();
        artist.add(new Categoryitem("Kuame Eugene",R.drawable.kuamieugene));
        artist.add(new Categoryitem("Kwesi Arthur", R.drawable.kwesiarthur));
        artist.add(new Categoryitem("Stonebwoy", R.drawable.stonebwoy));
        artist.add(new Categoryitem("Sarkodie",R.drawable.sarkodie));
        artist.add(new Categoryitem("Rihanna",R.drawable.rihanna));
        artist.add(new Categoryitem("Cudi",R.drawable.cudi));
        artist.add(new Categoryitem("Gunna",R.drawable.gunna));
        artist.add(new Categoryitem("Megantheestallion",R.drawable.megantheestallion));
        artist.add(new Categoryitem("Kehlani",R.drawable.kehlani));
        artist.add(new Categoryitem("King Promise",R.drawable.king));

        ListView listView = findViewById(R.id.artist_listview);
        CategoryAdapter artistAdapter = new CategoryAdapter (this,artist);
        listView.setAdapter(artistAdapter);

    }
}
