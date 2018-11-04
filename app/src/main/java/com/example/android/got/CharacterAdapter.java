package com.example.android.got;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class CharacterAdapter extends ArrayAdapter<Character> {

    private int mColorResourceId;

    public CharacterAdapter(Context context, ArrayList<Character> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Character currentWord = getItem(position);

        TextView gotTextView = (TextView) listItemView.findViewById(R.id.itemTextView);
        gotTextView.setText(currentWord.getName());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);
        if(currentWord.imageAvailable()){

            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(currentWord.getImageResourceID());
        }
        else {
            imageView.setVisibility(View.GONE);
        }
        LinearLayout textContainer = (LinearLayout) listItemView.findViewById(R.id.textContainer);
        textContainer.setBackgroundColor(ContextCompat.getColor(getContext(),mColorResourceId));
        return listItemView;
    }
}
