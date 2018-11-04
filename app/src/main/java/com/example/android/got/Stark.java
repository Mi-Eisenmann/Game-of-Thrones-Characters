package com.example.android.got;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class Stark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        final ArrayList<Character> words = new ArrayList<Character>();
        words.add(new Character("Eddard Stark", R.drawable.stark_eddard, R.raw.stark_eddard));
        words.add(new Character("Catelyn Stark", R.drawable.stark_catelyn, R.raw.stark_catelyn));
        words.add(new Character("Robb Stark", R.drawable.stark_robb, R.raw.stark_robb));
        words.add(new Character("John (Snow)", R.drawable.stark_john, R.raw.stark_john));
        words.add(new Character("Brandon Stark", R.drawable.stark_brandon, R.raw.stark_brandon));
        words.add(new Character("Arya Stark", R.drawable.stark_arya, R.raw.stark_arya));
        words.add(new Character("Sansa Stark", R.drawable.stark_sansa, R.raw.stark_sansa));

        CharacterAdapter adapter = new CharacterAdapter(this, words, R.color.color_stark);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Character word = words.get(position);
                MediaPlayerHandler.handler(Stark.this, word.getAudioResourceID());
            }
        });
    }
}