package com.example.android.got;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.AdapterView;
import java.util.ArrayList;

public class Baratheon extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Character> words = new ArrayList<Character>();
        words.add(new Character("Robert Baratheon", R.drawable.baratheon_robert, R.raw.baratheon_robert));
        words.add(new Character("Stannis Baratheon", R.drawable.baratheon_stannis, R.raw.baratheon_stannis));
        words.add(new Character("Renly Baratheon", R.drawable.baratheon_renly, R.raw.baratheon_renly));
        words.add(new Character("Joffrey Baratheon", R.drawable.baratheon_joffrey, R.raw.baratheon_joffrey));
        words.add(new Character("Tommen Baratheon", R.drawable.baratheon_tommen, R.raw.baratheon_tommen));
        words.add(new Character("Myrcella Baratheon", R.drawable.baratheon_myrcella, R.raw.baratheon_myrcella));

        CharacterAdapter adapter = new CharacterAdapter(this, words, R.color.color_baratheon);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id ) {
                Character word = words.get(position);
                MediaPlayerHandler.handler(Baratheon.this, word.getAudioResourceID());
            }
        });
    }
}
