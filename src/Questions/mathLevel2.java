package Questions;


public class mathLevel2 {

    static String[] mQuestions = new String[10];
    static String[] mAnswers = new String[10];
    static String[][] mAlternative = new String[100][100];
    static String[] mHints = new String[10];

    //set questions
     public static String[] setQuestion() {
        mQuestions[0] = "What is double 35?";
        mQuestions[1] = "Mary picked 5 apples and Bill picked 9." + "\n" + "The children shared all of their apples evenly." +"\n" + " How many did each child get?";
        mQuestions[2] = "List here the even numbers from 10 to 20.";
        mQuestions[3] = "Find the difference of 75 and 90.";
        mQuestions[4] = "Ed had saved $16. Then grandma gave him $10." + "\n" + "Now how much more does he need in order to buy a toolset for $32?";
        mQuestions[5] = "82 + ... = 90";
        mQuestions[6] = "13 + ... = 21";
        mQuestions[7] = "90 - ... = 83";
        mQuestions[8] = "59 + 8";
        mQuestions[9] = "62 + 8";

        return mQuestions;
    }

     //Set Answers
     public static String[] setCorrectAnswer() {
        mAnswers[0] = "70";
        mAnswers[1] = "7";
        mAnswers[2] = "10, 12, 14, 16, 18, 20";
        mAnswers[3] = "25";
        mAnswers[4] = "6";
        mAnswers[5] = "8";
        mAnswers[6] = "8";
        mAnswers[7] = "7";
        mAnswers[8] = "67";
        mAnswers[9] = "70";

        return mAnswers;
    }

    //Set Choices;
    public static String[][] setAlternative() {
        mAlternative[0][0] =  "68";
        mAlternative[0][1] =  "70";
        mAlternative[0][2] =  "72";
        mAlternative[0][3] =  "74";

        mAlternative[1][0] =  "5";
        mAlternative[1][1] =  "6";
        mAlternative[1][2] =  "7";
        mAlternative[1][3] =  "8";

        mAlternative[2][0] =  "10, 11, 12, 13, 14, 15";
        mAlternative[2][1] =  "15, 16, 17, 18, 19, 20";
        mAlternative[2][2] =  "10, 12, 14, 16, 18, 20";
        mAlternative[2][3] =  "11, 13, 15, 17, 19, 21";

        mAlternative[3][0] =  "25";
        mAlternative[3][1] =  "26";
        mAlternative[3][2] =  "27";
        mAlternative[3][3] =  "28";

        mAlternative[4][0] =  "9";
        mAlternative[4][1] =  "8";
        mAlternative[4][2] =  "7";
        mAlternative[4][3] =  "6";

        mAlternative[5][0] =  "5";
        mAlternative[5][1] =  "6";
        mAlternative[5][2] =  "7";
        mAlternative[5][3] =  "8";

        mAlternative[6][0] =  "5";
        mAlternative[6][1] =  "6";
        mAlternative[6][2] =  "7";
        mAlternative[6][3] =  "8";

        mAlternative[7][0] =  "5";
        mAlternative[7][1] =  "6";
        mAlternative[7][2] =  "7";
        mAlternative[7][3] =  "8";

        mAlternative[8][0] =  "65";
        mAlternative[8][1] =  "66";
        mAlternative[8][2] =  "67";
        mAlternative[8][3] =  "68";

        mAlternative[9][0] =  "68";
        mAlternative[9][1] =  "69";
        mAlternative[9][2] =  "70";
        mAlternative[9][3] =  "71";

        return mAlternative;
    }

    public static String[] setHints() {
        mHints[0] = "What is 35+35? ";
        mHints[1] = "What is (5+9)/2? ";
        mHints[2] = "Only between 10 to 20";
        mHints[3] = "What is 90-75? ";
        mHints[4] = "What is 32-(16+10)? ";
        mHints[5] = "What is 90-82? ";
        mHints[6] = "What is 21-13? ";
        mHints[7] = "What is 90-83? ";
        mHints[8] = "Addition question";
        mHints[9] = "Addition question";

        return mHints;
    }

}
