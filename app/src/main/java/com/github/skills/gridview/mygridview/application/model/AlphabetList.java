package com.github.skills.gridview.mygridview.application.model;

import com.github.skills.gridview.mygridview.application.R;

import java.util.ArrayList;

public class AlphabetList {

    public ArrayList<Alphabet> getAlphabetList(){

        ArrayList<Alphabet> arrayList = new ArrayList<>();
        arrayList.add(new Alphabet(R.drawable.abc , "Alpha"));
        arrayList.add(new Alphabet(R.drawable.b , "Bravo"));
        arrayList.add(new Alphabet(R.drawable.c , "Charlie"));
        arrayList.add(new Alphabet(R.drawable.d , "Delta"));
        arrayList.add(new Alphabet(R.drawable.e , "Echo"));
        arrayList.add(new Alphabet(R.drawable.f , "Foxtrot"));
        arrayList.add(new Alphabet(R.drawable.g, "Golf"));
        arrayList.add(new Alphabet(R.drawable.h , "Hotel"));
        arrayList.add(new Alphabet(R.drawable.i , "Ink"));
        arrayList.add(new Alphabet(R.drawable.j , " Juliet"));
        arrayList.add(new Alphabet(R.drawable.k , "Kilo"));
        arrayList.add(new Alphabet(R.drawable.l , "Lima"));
        return arrayList;

    }

}
