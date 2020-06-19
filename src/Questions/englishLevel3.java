package Questions;

public class englishLevel3 {


    static String[] mQuestions = new String[10];
    static String[] mAnswers = new String[10];
    static String[][] mAlternative = new String[100][100];
    static String[] mHints = new String[10];

    //set questions
     public static String[] setQuestion() {
        mQuestions[0] = "What is the plural form a knife";
        mQuestions[1] = "What is past tense of  place?";
        mQuestions[2] = "What is the verb in the following sentence." + "\n" + "I set the glass on the table.";
        mQuestions[3] = "What is the verb?I ran out of the room.";
        mQuestions[4] = "What is the helping verb?Sidney has helped stray cats before.";
        mQuestions[5] = "Identify the neuter gender nouns from the sentence." + "\n" + "Jamila hung from the tree that she had climbed to pluck the mangoes.";
        mQuestions[6] = "I ... ... . . (go) to English classes every week";
        mQuestions[7] = "I ... ... ... (cut) the carrots yesterday";
        mQuestions[8] = "I ... ... (call) you tomorrow";
        mQuestions[9] = "She ... ... (like) tomatoes";

        return mQuestions;
    }

     //set answers
     public static String[] setCorrectAnswer() {
        mAnswers[0] = "Knives";
        mAnswers[1] = "Placed";
        mAnswers[2] = "Set";
        mAnswers[3] = "Ran";
        mAnswers[4] = "Has";
        mAnswers[5] = "Tree and mangoes";
        mAnswers[6] = "Go";
        mAnswers[7] = "Cut";
        mAnswers[8] = "Will call";
        mAnswers[9] = "Likes";

        return mAnswers;
    }

    // set choices
    public static String[][] setAlternative() {
        mAlternative[0][0] =  "Knifes";
        mAlternative[0][1] =  "Knives";
        mAlternative[0][2] =  "Nifes";
        mAlternative[0][3] =  "Nives";

        mAlternative[1][0] =  "Placed";
        mAlternative[1][1] =  "Plased";
        mAlternative[1][2] =  "Plasis";
        mAlternative[1][3] =  "Placing";

        mAlternative[2][0] =  "Glass";
        mAlternative[2][1] =  "Set";
        mAlternative[2][2] =  "On";
        mAlternative[2][3] =  "Table";

        mAlternative[3][0] =  "I";
        mAlternative[3][1] =  "Ran";
        mAlternative[3][2] =  "Out";
        mAlternative[3][3] =  "Room";

        mAlternative[4][0] =  "Has";
        mAlternative[4][1] =  "Cats";
        mAlternative[4][2] =  "Helped";
        mAlternative[4][3] =  "Before";

        mAlternative[5][0] =  "Jamila, tree and mangoes";
        mAlternative[5][1] =  "Tree and mangoes";
        mAlternative[5][2] =  "Jamila and She";
        mAlternative[5][3] =  "Jamila";

        mAlternative[6][0] =  "Gone";
        mAlternative[6][1] =  "Have go";
        mAlternative[6][2] =  "Go";
        mAlternative[6][3] =  "Will goes";

        mAlternative[7][0] =  "Cut";
        mAlternative[7][1] =  "Am cutting";
        mAlternative[7][2] =  "Cuts";
        mAlternative[7][3] =  "Will be cutting";

        mAlternative[8][0] =  "Call";
        mAlternative[8][1] =  "Called";
        mAlternative[8][2] =  "Will call";
        mAlternative[8][3] =  "Would be";

        mAlternative[9][0] =  "Like";
        mAlternative[9][1] =  "Likes";
        mAlternative[9][2] =  "Will likes";
        mAlternative[9][3] =  "Have liked";

        return mAlternative;
    }

    public static String[] setHints() {
        mHints[0] = "Add a v in the center and an s at the end";
        mHints[1] = "Try adding ed at the end";
        mHints[2] = "Starts with an s";
        mHints[3] = "Starts with an r";
        mHints[4] = "Starts with an h";
        mHints[5] = "It is T and M";
        mHints[6] = "The correct answer is in the question";
        mHints[7] = "The correct answer is in the question";
        mHints[8] = "Try add will before";
        mHints[9] = "try add s behind";

        return mHints;
    }
}
