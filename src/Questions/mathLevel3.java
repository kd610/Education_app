package Questions;


public class mathLevel3 {

    static String[] mQuestions = new String[10];
    static String[] mAnswers = new String[10];
    static String[][] mAlternative = new String[100][100];
    static String[] mHints = new String[10];

    //set questions
     public static String[] setQuestion() {
        mQuestions[0] = "100 + 60 + 1";
        mQuestions[1] = "1 + ... + 70 = 271";
        mQuestions[2] = "4 x 4";
        mQuestions[3] = "7 x 8";
        mQuestions[4] = "10 + (25-8)";
        mQuestions[5] = "7 + 4 x 4 - 10";
        mQuestions[6] = "54 / 9";
        mQuestions[7] = "340 / 10";
        mQuestions[8] = "Convert 8000cm to m.";
        mQuestions[9] = "Convert 74mm to cm.";

        return mQuestions;
    }

     //Set Answers
     public static String[] setCorrectAnswer() {
        mAnswers[0] = "161";
        mAnswers[1] = "200";
        mAnswers[2] = "16";
        mAnswers[3] = "56";
        mAnswers[4] = "24";
        mAnswers[5] = "13";
        mAnswers[6] = "6";
        mAnswers[7] = "34";
        mAnswers[8] = "80";
        mAnswers[9] = "7.4";

        return mAnswers;
    }

    //Set Choices;
    public static String[][] setAlternative() {
        mAlternative[0][0] =  "160";
        mAlternative[0][1] =  "161";
        mAlternative[0][2] =  "162";
        mAlternative[0][3] =  "163";

        mAlternative[1][0] =  "150";
        mAlternative[1][1] =  "250";
        mAlternative[1][2] =  "200";
        mAlternative[1][3] =  "300";

        mAlternative[2][0] =  "15";
        mAlternative[2][1] =  "16";
        mAlternative[2][2] =  "17";
        mAlternative[2][3] =  "18";

        mAlternative[3][0] =  "56";
        mAlternative[3][1] =  "57";
        mAlternative[3][2] =  "58";
        mAlternative[3][3] =  "59";

        mAlternative[4][0] =  "14";
        mAlternative[4][1] =  "24";
        mAlternative[4][2] =  "34";
        mAlternative[4][3] =  "44";

        mAlternative[5][0] =  "16";
        mAlternative[5][1] =  "15";
        mAlternative[5][2] =  "14";
        mAlternative[5][3] =  "13";

        mAlternative[6][0] =  "3";
        mAlternative[6][1] =  "6";
        mAlternative[6][2] =  "9";
        mAlternative[6][3] =  "4";

        mAlternative[7][0] =  "34";
        mAlternative[7][1] =  "33";
        mAlternative[7][2] =  "32";
        mAlternative[7][3] =  "31";

        mAlternative[8][0] =  "8000";
        mAlternative[8][1] =  "800";
        mAlternative[8][2] =  "80";
        mAlternative[8][3] =  "8";

        mAlternative[9][0] =  "4.7";
        mAlternative[9][1] =  "4.4";
        mAlternative[9][2] =  "7.4";
        mAlternative[9][3] =  "7.7";

        return mAlternative;
    }

    public static String[] setHints() {
        mHints[0] = "Addition question";
        mHints[1] = "What is 271-1-70? ";
        mHints[2] = "Multiplication question";
        mHints[3] = "Multiplication question";
        mHints[4] = "Do the substraction first";
        mHints[5] = "Do the multiplication first";
        mHints[6] = "Division question";
        mHints[7] = "Division question";
        mHints[8] = "Calculation for cm to m is divide by 100";
        mHints[9] = "Calculation for mm to cm is divide by 10";

        return mHints;
    }

}
