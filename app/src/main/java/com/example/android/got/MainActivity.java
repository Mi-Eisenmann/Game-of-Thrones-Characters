/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.got;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ImageView colorsView = (ImageView) findViewById(R.id.baratheon);
        colorsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent colorsIntent = new Intent(MainActivity.this, Baratheon.class);
                startActivity(colorsIntent);
            }
        });


        ImageView familyView = (ImageView) findViewById(R.id.stark);
        familyView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent familyIntent = new Intent(MainActivity.this, Stark.class);
                startActivity(familyIntent);
            }
        });


        ImageView numbersView = (ImageView) findViewById(R.id.lannister);
        numbersView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, Lannister.class);
                startActivity(numbersIntent);
            }
        });


        ImageView phrasesView = (ImageView) findViewById(R.id.targaryen);
        phrasesView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent familyIntent = new Intent(MainActivity.this, Targaryen.class);
                startActivity(familyIntent);
            }
        });


        ImageView othersView = (ImageView) findViewById(R.id.others);
        othersView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent othersIntent = new Intent(MainActivity.this, Others.class);
                startActivity(othersIntent);
            }
        });


        ImageView tyrellView = (ImageView) findViewById(R.id.tyrell);
        tyrellView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent tyrellIntent = new Intent(MainActivity.this, Tyrell.class);
                startActivity(tyrellIntent);
            }
        });
    }
}
