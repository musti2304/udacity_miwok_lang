package com.example.android.miwok;

/**
 * Created by myousef on 01.11.16.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;

    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

}