package com.github.skills.gridview.mygridview.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.github.skills.gridview.mygridview.application.apps.AlphabetAdapter;
import com.github.skills.gridview.mygridview.application.model.Alphabet;
import com.github.skills.gridview.mygridview.application.model.AlphabetList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.my_grid_view);
        AlphabetAdapter adapter = new AlphabetAdapter(this, new AlphabetList().getAlphabetList());
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Alphabet alphabet = (Alphabet) parent.getItemAtPosition(position);
        Toast.makeText(MainActivity.this, alphabet.getLetterName() , Toast.LENGTH_SHORT).show();
    }
}