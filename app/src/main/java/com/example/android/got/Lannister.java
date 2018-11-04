package com.example.android.got;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Lannister extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Character> words = new ArrayList<Character>();
        words.add(new Character("Tywin Lannister", R.drawable.lannister_tywin, R.raw.lannister_tywin));
        words.add(new Character("Tyrion Lannister", R.drawable.lannister_tyrion, R.raw.lannister_tyrion));
        words.add(new Character("Jaime Lannister", R.drawable.lannister_jaime, R.raw.lannister_jaime));
        words.add(new Character("Cersei Lannister", R.drawable.lannister_cersei, R.raw.lannister_cersei));

        CharacterAdapter adapter = new CharacterAdapter(this, words, R.color.color_lannister);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Character word = words.get(position);
                MediaPlayerHandler.handler(Lannister.this, word.getAudioResourceID());
            }
        });
    }
}