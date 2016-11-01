package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by myousef on 02.11.16.
 */

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Context context, ArrayAdapter<Word>) {

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
