package com.example.android.got;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import android.widget.AdapterView;

public class Targaryen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Character> words = new ArrayList<Character>();
        words.add(new Character("Daenerys Targaryen",R.drawable.targaryen_daenerys, R.raw.targaryen_daenerys));
        words.add(new Character("Viserys Targaryen",R.drawable.targaryen_viserys, R.raw.targaryen_viserys));
        words.add(new Character("Aemon Targaryen",R.drawable.targaryen_aemon, R.raw.targaryen_aemon));


        CharacterAdapter adapter = new CharacterAdapter(this, words, R.color.color_targaryen);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id ) {
                Character word = words.get(position);
                MediaPlayerHandler.handler(Targaryen.this, word.getAudioResourceID());
            }
        });
    }
}
