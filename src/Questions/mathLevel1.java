package Questions;


public class mathLevel1 {

    static String[] mQuestions = new String[10];
    static String[] mAnswers = new String[10];
    static String[][] mAlternative = new String[100][100];
    static String[] mHints = new String[10];

    //set questions
     public static String[] setQuestion() {
        mQuestions[0] = "3 + 6";
        mQuestions[1] = "8 - 5";
        mQuestions[2] = "What number comes after 26";
        mQuestions[3] = "I have 10 bananas. I eat 3 of them. How many are left?";
        mQuestions[4] = "Sally has 5 cakes. She makes 2 more. How many are left?";
        mQuestions[5] = "Which number comes before 18 ?";
        mQuestions[6] = "Write down the number thirty four";
        mQuestions[7] = "26 + 6";
        mQuestions[8] = "What number comes before 70 ?";
        mQuestions[9] = "Frazer eats 8 pies. He eats 4 more. How many has he eaten?";

        return mQuestions;
    }

     //Set Answers
     public static String[] setCorrectAnswer() {
        mAnswers[0] = "9";
        mAnswers[1] = "3";
        mAnswers[2] = "27";
        mAnswers[3] = "7";
        mAnswers[4] = "7";
        mAnswers[5] = "17";
        mAnswers[6] = "34";
        mAnswers[7] = "32";
        mAnswers[8] = "69";
        mAnswers[9] = "12";

        return mAnswers;
    }

    //Set Choices;
    public static String[][] setAlternative() {
        mAlternative[0][0] =  "7";
        mAlternative[0][1] =  "8";
        mAlternative[0][2] =  "9";
        mAlternative[0][3] =  "10";

        mAlternative[1][0] =  "1";
        mAlternative[1][1] =  "2";
        mAlternative[1][2] =  "3";
        mAlternative[1][3] =  "4";

        mAlternative[2][0] =  "26";
        mAlternative[2][1] =  "27";
        mAlternative[2][2] =  "28";
        mAlternative[2][3] =  "29";

        mAlternative[3][0] =  "5";
        mAlternative[3][1] =  "6";
        mAlternative[3][2] =  "7";
        mAlternative[3][3] =  "8";

        mAlternative[4][0] =  "9";
        mAlternative[4][1] =  "8";
        mAlternative[4][2] =  "7";
        mAlternative[4][3] =  "10";

        mAlternative[5][0] =  "19";
        mAlternative[5][1] =  "16";
        mAlternative[5][2] =  "17";
        mAlternative[5][3] =  "18";

        mAlternative[6][0] =  "34";
        mAlternative[6][1] =  "43";
        mAlternative[6][2] =  "44";
        mAlternative[6][3] =  "33";

        mAlternative[7][0] =  "34";
        mAlternative[7][1] =  "33";
        mAlternative[7][2] =  "32";
        mAlternative[7][3] =  "31";

        mAlternative[8][0] =  "70";
        mAlternative[8][1] =  "69";
        mAlternative[8][2] =  "67";
        mAlternative[8][3] =  "68";

        mAlternative[9][0] =  "11";
        mAlternative[9][1] =  "12";
        mAlternative[9][2] =  "13";
        mAlternative[9][3] =  "14";

        return mAlternative;
    }

    public static String[] setHints() {
        mHints[0] = "Addition question";
        mHints[1] = "Substraction question";
        mHints[2] = "Number between 26 and 28";
        mHints[3] = "What is 10-7? ";
        mHints[4] = "What is 5+2? ";
        mHints[5] = "Nimber between 16 and 18";
        mHints[6] = "Read carefully, it's thirty four";
        mHints[7] = "Addition question";
        mHints[8] = "NUmber between 78 and 80";
        mHints[9] = "What is 8+4? ";

        return mHints;
    }

}
