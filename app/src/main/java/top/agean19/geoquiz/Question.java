package top.agean19.geoquiz;

public class Question {
    private int mTextResId;
    private boolean mAnswer;

    public Question(int testResId,boolean answer){
        mTextResId=testResId;
        mAnswer=answer;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
