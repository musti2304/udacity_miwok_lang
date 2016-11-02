package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by myousef on 02.11.16.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView defaulWordTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaulWordTextView.setText(currentWord.getDefaultTranslation());

        TextView miwokWordTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokWordTextView.setText(currentWord.getMiwokTranslation());



        return listItemView;
    }
}
