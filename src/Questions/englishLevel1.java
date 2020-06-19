package Questions;

public class englishLevel1 {

    static String[] mQuestions = new String[10];
    static String[] mAnswers = new String[10];
    static String[][] mAlternative = new String[100][100];
    static String[] mHints = new String[10];

    //Set questions
     public static String[] setQuestion() {
        mQuestions[0] = "I ..... tennis every Sunday morning.";
        mQuestions[1] = "Don't make so much noise." + "\n" + "Noriko ..... to study for her ESL test!";
        mQuestions[2] = "Jun-Sik ..... his teeth before breakfast every morning.";
        mQuestions[3] = "Sorry, she can't come to the phone. She ..... a bath!";
        mQuestions[4] = "..... many times every winter in Frankfurt.";
        mQuestions[5] = "How many students in your class ..... from Korea?";
        mQuestions[6] = "Weather report: It's seven o'clock in Frankfurt and ..... .";
        mQuestions[7] = "Babies .... when they are hungry.";
        mQuestions[8] = "Jane: What ..... in the evenings?" + "\n" + "Mary: Usually I watch TV or read a book.";
        mQuestions[9] = "Jane: What ..... ?" + "\n" + "Mary: I'm trying to fix my calculator.";

        return mQuestions;
    }

     //set Answers
     public static String[] setCorrectAnswer() {
        mAnswers[0] = "play";
        mAnswers[1] = "is trying";
        mAnswers[2] = "cleans";
        mAnswers[3] = "is having";
        mAnswers[4] = "It snows";
        mAnswers[5] = "come";
        mAnswers[6] = "it's snowing";
        mAnswers[7] = "cry";
        mAnswers[8] = "do you do";
        mAnswers[9] = "are you doing";

        return mAnswers;
    }

     //set choices
    public static String[][] setAlternative() {
        mAlternative[0][0] =  "playing";
        mAlternative[0][1] =  "play";
        mAlternative[0][2] =  "am playing";
        mAlternative[0][3] =  "am play";

        mAlternative[1][0] =  "try";
        mAlternative[1][1] =  "tries";
        mAlternative[1][2] =  "tried";
        mAlternative[1][3] =  "is trying";

        mAlternative[2][0] =  "will cleaned";
        mAlternative[2][1] =  "is cleaning";
        mAlternative[2][2] =  "cleans";
        mAlternative[2][3] =  "clean";

        mAlternative[3][0] =  "is having";
        mAlternative[3][1] =  "having";
        mAlternative[3][2] =  "have";
        mAlternative[3][3] =  "has";

        mAlternative[4][0] =  "It snows";
        mAlternative[4][1] =  "It snowed";
        mAlternative[4][2] =  "It is snowing";
        mAlternative[4][3] =  "It is snow";

        mAlternative[5][0] =  "comes";
        mAlternative[5][1] =  "come";
        mAlternative[5][2] =  "came";
        mAlternative[5][3] =  "are coming";

        mAlternative[6][0] =  "there is now";
        mAlternative[6][1] =  "it's snowing";
        mAlternative[6][2] =  "it snows";
        mAlternative[6][3] =  "it snowed";

        mAlternative[7][0] =  "cry";
        mAlternative[7][1] =  "cries";
        mAlternative[7][2] =  "cried";
        mAlternative[7][3] =  "are crying";

        mAlternative[8][0] =  "you doing";
        mAlternative[8][1] =  "you do";
        mAlternative[8][2] =  "do you do";
        mAlternative[8][3] =  "are you doing";

        mAlternative[9][0] =  "you doing";
        mAlternative[9][1] =  "you do";
        mAlternative[9][2] =  "do you do";
        mAlternative[9][3] =  "are you doing";

        return mAlternative;
    }

    public static String[] setHints() {
        mHints[0] = "The correct answer is present tense";
        mHints[1] = "The correct answer is an adjective";
        mHints[2] = "The correct answer is 3rd person present";
        mHints[3] = "The correct answer is present continuous";
        mHints[4] = "The correct answer is simple present tense";
        mHints[5] = "The correct answer is an irregular verb and infinitive";
        mHints[6] = "The correct answer is present continuous";
        mHints[7] = "The correct answer is a noun";
        mHints[8] = "The correct answer means how are you usually spending time";
        mHints[9] = "The correct answer is a question you ask if you want to know what some one is doing at the present time";

        return mHints;
    }
}
