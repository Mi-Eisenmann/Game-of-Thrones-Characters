package com.example.android.got;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Others extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        final ArrayList<Character> words = new ArrayList<Character>();
        words.add(new Character("Petyr Baelish", R.drawable.others_baelish, R.raw.others_baelish));
        words.add(new Character("Varys of Lys", R.drawable.others_varys, R.raw.others_varys));
        words.add(new Character("Brynden Tully", R.drawable.tully_brynden, R.raw.others_tully));
        words.add(new Character("Alliser Thornes", R.drawable.thornes_alliser, R.raw.thornes_alliser));
        words.add(new Character("Theon Greyjoy", R.drawable.greyjoy_theon, R.raw.greyjoy_theon));
        words.add(new Character("Rickard Karstark", R.drawable.karstark_rickard, R.raw.karstark_rickard));
        words.add(new Character("Lysa Arryn", R.drawable.arryn_lysa, R.raw.arryn_lysa));

        CharacterAdapter adapter = new CharacterAdapter(this, words, R.color.color_others);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Character word = words.get(position);
                MediaPlayerHandler.handler(Others.this, word.getAudioResourceID());
            }
        });
    }
}