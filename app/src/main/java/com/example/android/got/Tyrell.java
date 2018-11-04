package com.example.android.got;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Tyrell extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Character> words = new ArrayList<Character>();
        words.add(new Character("Margaery Tyrell", R.drawable.tyrell_margaery, R.raw.tyrell_margaery));
        words.add(new Character("Loras Tyrell", R.drawable.tyrell_loras, R.raw.tyrell_loras));
        words.add(new Character("Olenna Tyrell", R.drawable.tyrell_olenna, R.raw.tyrell_olenna));
        words.add(new Character("Mace Tyrell", R.drawable.tyrell_mace, R.raw.tyrell_mace));

        CharacterAdapter adapter = new CharacterAdapter(this, words, R.color.color_tyrell);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Character word = words.get(position);
                MediaPlayerHandler.handler(Tyrell.this, word.getAudioResourceID());
            }
        });
    }
}