package com.github.skills.gridview.mygridview.application.model;

public class Alphabet {

    private final Integer iconName;
    private final String letterName;

    public Alphabet(Integer iconName, String letterName) {
        this.iconName = iconName;
        this.letterName = letterName;
    }

    public Integer getIconName() {
        return iconName;
    }

    public String getLetterName() {
        return letterName;
    }

}
