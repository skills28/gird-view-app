package com.github.skills.gridview.mygridview.application.apps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.github.skills.gridview.mygridview.application.R;
import com.github.skills.gridview.mygridview.application.model.Alphabet;

import java.util.ArrayList;

public class AlphabetAdapter extends ArrayAdapter<Alphabet> {

    public AlphabetAdapter(@NonNull Context context , ArrayList<Alphabet> arrayList) {
        super(context, 0 , arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_list_layout, parent,
                    false);
        }
        ImageView imageView = convertView.findViewById(R.id.alphabetImage);
        TextView textView = convertView.findViewById(R.id.alphabetTextView);
        Alphabet alphabet = getItem(position);
        imageView.setImageResource(alphabet.getIconName());
        textView.setText(alphabet.getLetterName());
        return convertView;
    }


}
