package Questions;

public class englishLevel2 {

    static String[] mQuestions = new String[10];
    static String[] mAnswers = new String[10];
    static String[][] mAlternative = new String[100][100];
    static String[] mHints = new String[10];

    //set questions
     public static String[] setQuestion() {
        mQuestions[0] = "Thing that we use to clean our teeth .............";
        mQuestions[1] = "A thing to boil water is ..........";
        mQuestions[2] = "People sleeps here in the night .........";
        mQuestions[3] = "We are having our meals here everyday ..........";
        mQuestions[4] = "Mother cooks lunch for us in here .........";
        mQuestions[5] = "A thing to cut vegetables and" + "\n" + "fish into small pieces is called a ........";
        mQuestions[6] = "A kettle is used to boil water";
        mQuestions[7] = "We keep and hang our clothes in a cupboard or a dresser.";
        mQuestions[8] = "I read my favourite storybook in the dining room.";
        mQuestions[9] = "....... is Ali's cap.";

        return mQuestions;
    }

     //set answers
     public static String[] setCorrectAnswer() {
        mAnswers[0] = "Toothbrush";
        mAnswers[1] = "Kettle";
        mAnswers[2] = "Bedroom";
        mAnswers[3] = "Dining room";
        mAnswers[4] = "Kitchen";
        mAnswers[5] = "Knife";
        mAnswers[6] = "True";
        mAnswers[7] = "True";
        mAnswers[8] = "False";
        mAnswers[9] = "This";

        return mAnswers;
    }

     //set choices
    public static String[][] setAlternative() {
        mAlternative[0][0] =  "Toothbrush";
        mAlternative[0][1] =  "Toothpaste";
        mAlternative[0][2] =  "Comb";
        mAlternative[0][3] =  "Teeth";

        mAlternative[1][0] =  "Knife";
        mAlternative[1][1] =  "Kettle";
        mAlternative[1][2] =  "Jug";
        mAlternative[1][3] =  "Cup";

        mAlternative[2][0] =  "Toilet";
        mAlternative[2][1] =  "Bathroom";
        mAlternative[2][2] =  "Bedroom";
        mAlternative[2][3] =  "Living room";

        mAlternative[3][0] =  "Bedroom";
        mAlternative[3][1] =  "Living room";
        mAlternative[3][2] =  "Dining room";
        mAlternative[3][3] =  "Toilet";

        mAlternative[4][0] =  "Classroom";
        mAlternative[4][1] =  "Kitchen";
        mAlternative[4][2] =  "Toilet";
        mAlternative[4][3] =  "Bedroom";

        mAlternative[5][0] =  "Knife";
        mAlternative[5][1] =  "Fork";
        mAlternative[5][2] =  "Spoon";
        mAlternative[5][3] =  "Kettle";

        mAlternative[6][0] =  "True";
        mAlternative[6][1] =  "False";

        mAlternative[7][0] =  "True";
        mAlternative[7][1] =  "False";

        mAlternative[8][0] =  "True";
        mAlternative[8][1] =  "False";

        mAlternative[9][0] =  "These";
        mAlternative[9][1] =  "This";

        return mAlternative;
    }

    public static String[] setHints() {
        mHints[0] = "The thing next to your toothpaste ends with brush";
        mHints[1] = "Rhymes with kattle";
        mHints[2] = "The place where your bed is";
        mHints[3] = "Where you eat your food";
        mHints[4] = "Where we cook our food";
        mHints[5] = "This thing is sharp";
        mHints[6] = "Well it starts with T";
        mHints[7] = "Well it starts with T";
        mHints[8] = "Well it starts with F";
        mHints[9] = "The plural of this word is these";

        return mHints;
    }


}
