package Questions;


public class scienceLevel1 {
    
    static String[] mQuestions = new String[10];
    static String[] mAnswers = new String[10];
    static String[][] mAlternative = new String[100][100];
    static String[] mHints = new String[10];
    
    //set questions
     public static String[] setQuestion() {
        mQuestions[0] = "Billy is going to clean his teeth. He has a toothbrush. What else does he need to clean his teeth ?";
        mQuestions[1] = "Some children may have allergies. What happens if they eat those foods ?";
        mQuestions[2] = "Some things are made from wood. Wood is brown. It is hard, strong and _____ ?";
        mQuestions[3] = "Will has two tomato plants. What should he do ?";
        mQuestions[4] = "Which of these are not source of light ?";
        mQuestions[5] = "____ helps us to cook our food.";
        mQuestions[6] = "Soya sauce taste ____ .";
        mQuestions[7] = "Coffee tastes ____";
        mQuestions[8] = "Chocolate tastes ____";
        mQuestions[9] = "Lemon tastes ____";

        return mQuestions;
    }
     
     //set answers
     public static String[] setCorrectAnswer() {
        mAnswers[0] = "Toothpaste";
        mAnswers[1] = "They will become ill";
        mAnswers[2] = "Heavy";
        mAnswers[3] = "Water both plants only when they are dry.";
        mAnswers[4] = "Moon";
        mAnswers[5] = "Heat";
        mAnswers[6] = "Salty";
        mAnswers[7] = "Bitter";
        mAnswers[8] = "Sweet";
        mAnswers[9] = "Bitter";
      
        return mAnswers;
    }
    
     //set choices
    public static String[][] setAlternative() {
        mAlternative[0][0] =  "Soap";
        mAlternative[0][1] =  "Shampoo";
        mAlternative[0][2] =  "Toothpaste";
        mAlternative[0][3] =  "Hot water";
        
        mAlternative[1][0] =  "They will become ill";
        mAlternative[1][1] =  "They will eat more of them";
        mAlternative[1][2] =  "They will laugh and play";
        mAlternative[1][3] =  "They will ask for more";
        
        mAlternative[2][0] =  "Light";
        mAlternative[2][1] =  "Heavy";
        mAlternative[2][2] =  "Smooth";
        mAlternative[2][3] =  "Clear";
        
        mAlternative[3][0] =  "Keep both dry";
        mAlternative[3][1] =  "Water one plant and not the other";
        mAlternative[3][2] =  "Water both plants";
        mAlternative[3][3] =  "Water both plants only when they are not dry";
        
        mAlternative[4][0] =  "The Sun";
        mAlternative[4][1] =  "The Moon";
        mAlternative[4][2] =  "A Torch";
        mAlternative[4][3] =  "A candle flame";
        
        mAlternative[5][0] =  "Light";
        mAlternative[5][1] =  "Wind";
        mAlternative[5][2] =  "Heat";
        mAlternative[5][3] =  "Sounds";
        
        mAlternative[6][0] =  "Salty";
        mAlternative[6][1] =  "Sour";
        mAlternative[6][2] =  "Bitter";
        mAlternative[6][3] =  "Sweet";
        
        mAlternative[7][0] =  "Salty";
        mAlternative[7][1] =  "Sour";
        mAlternative[7][2] =  "Bitter";
        mAlternative[7][3] =  "Sweet";
        
        mAlternative[8][0] =  "Salty";
        mAlternative[8][1] =  "Sour";
        mAlternative[8][2] =  "Bitter";
        mAlternative[8][3] =  "Sweet";
        
        mAlternative[9][0] =  "Salty";
        mAlternative[9][1] =  "Sour";
        mAlternative[9][2] =  "Bitter";
        mAlternative[9][3] =  "Sweet";
   
        return mAlternative;
    }
    
    public static String[] setHints() {
        mHints[0] = "It comes in a white tube";
        mHints[1] = "You will get sick.";
        mHints[2] = "It is hard to carry";
        mHints[3] = "Plants need water, air and light to survive.";
        mHints[4] = "The only planet in the solar system that gives light is Sun.";
        mHints[5] = "Food can't be cooked cold.";
        mHints[6] = "Tastes like salt";
        mHints[7] = "Tastes like medicine";
        mHints[8] = "Tastes very nice";
        mHints[9] = "Tastes like medicine";

        return mHints;
    }
  
}
