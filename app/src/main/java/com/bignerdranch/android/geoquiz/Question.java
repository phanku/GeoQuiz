package com.bignerdranch.android.geoquiz;

/**
 * Created by Phanku on 1/20/2018.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;

    /**
     * Constructor
     * @param textResId
     * @param answerTrue
     */
    public Question(int textResId, boolean answerTrue) {

        mTextResId = textResId;
        mAnswerTrue = answerTrue;

    }

    /**
     * Returns the question text.
     * @return int
     */
    public int getTextResId() {
        return mTextResId;
    }

    /**
     * Sets the question text.
     * @param textResId
     */
    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    /**
     * Returns if the answer is true.
     * @return boolean
     */
    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    /**
     * Sets if the answer is true.
     * @param answerTrue
     */
    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
