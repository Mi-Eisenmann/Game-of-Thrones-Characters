package com.example.android.got;

public class Character {

    private String mName;
    private int mImageResourceID;
    private static final int NO_IMAGE_AVAILABLE = -1;
    private int mAudioResourceID;

    public Character(String name, int audioResourceID) {
        mName = name;
        mImageResourceID = NO_IMAGE_AVAILABLE;
        mAudioResourceID = audioResourceID;
    }
    public Character(String name, int imageResourceID, int audioResourceID) {
        mName = name;
        mImageResourceID = imageResourceID;
        mAudioResourceID = audioResourceID;
    }

    public String getName() {
        return mName;
    }
    public int getImageResourceID() {
        return mImageResourceID;
    }
    public int getAudioResourceID(){
        return mAudioResourceID;
    }
    public boolean imageAvailable(){
        return mImageResourceID !=NO_IMAGE_AVAILABLE;
    }

}
