package com.example.android.miwok;

/*** {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /** Audio resource ID for the word */
    private int mAudioResourceId;

    /**
     * Create a new Word object (constructor).
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param audioResourceId is the audio resource ID
     */
     public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
         mDefaultTranslation = defaultTranslation;
         mMiwokTranslation = miwokTranslation;
         mAudioResourceId = audioResourceId;
     }

    /**
     * Create a second Word object (constructor) with an image.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is the image resource ID
     * @param audioResourceId is the audio resource ID
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }


    /**
     * Get the Miwok translation of the word.
     *
     * @return current miwok text in the Word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the default translation of the word.
     *
     * @return current default text in the Word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Return the image resource ID for the word.
     *
     * @return current image in the Word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     *
     * @return current image in the Word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the audio resource ID for the word.
     *
     * @return current audio in the Word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
