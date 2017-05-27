package com.example.android.LeJa;

/**
 * Created by asif on 4/8/17.
 */

public class Word {


    private int mAudioResourceId;
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Word() {
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mAudioResourceId) {
        this.mAudioResourceId = mAudioResourceId;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceId,int mAudioResourceId) {
        this.mAudioResourceId = mAudioResourceId;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceId = mImageResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getmImageResourceId() {
        return mImageResourceId;
    }
    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mAudioResourceId=" + mAudioResourceId +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
