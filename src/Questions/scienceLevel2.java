package Questions;


public class scienceLevel2 {
    
    static String[] mQuestions = new String[10];
    static String[] mAnswers = new String[10];
    static String[][] mAlternative = new String[100][100];
    static String[] mHints = new String[10];
    
     public static String[] setQuestion() {
        mQuestions[0] = "Which of the following ia a living thing?";
        mQuestions[1] = "Which of the following is a non-living thing?";
        mQuestions[2] = "Living things need ________________ to stay alive.";
        mQuestions[3] = "Living things need _____________ to breathe.";
        mQuestions[4] = "A cat can _______________ but a table cannot.";
        mQuestions[5] = "All plants come from ____";
        mQuestions[6] = "Plants need food, water, air and ____ to grow.";
        mQuestions[7] = "All living things need ____ to drink";
        mQuestions[8] = "All living things require _____ to live in.";
        mQuestions[9] = "Which of the following activities makes the air unclean ?";

        return mQuestions;
    }
     
     public static String[] setCorrectAnswer() {
        mAnswers[0] = "Rabbit";
        mAnswers[1] = "A car";
        mAnswers[2] = "Food";
        mAnswers[3] = "Air";
        mAnswers[4] = "Move by itself";
        mAnswers[5] = "Seeds";
        mAnswers[6] = "Soil";
        mAnswers[7] = "Water";
        mAnswers[8] = "Shelter";
        mAnswers[9] = "Smoke from cars";
      
        return mAnswers;
    }
    
    public static String[][] setAlternative() {
        mAlternative[0][0] =  "Ball";
        mAlternative[0][1] =  "Rabbit";
        mAlternative[0][2] =  "Car";
        mAlternative[0][3] =  "Phone";
        
        mAlternative[1][0] =  "A rose plant";
        mAlternative[1][1] =  "A car";
        mAlternative[1][2] =  "A mouse";
        mAlternative[1][3] =  "A bear";
        
        mAlternative[2][0] =  "Food";
        mAlternative[2][1] =  "Soil";
        mAlternative[2][2] =  "Book";
        mAlternative[2][3] =  "Bed";
        
        mAlternative[3][0] =  "Food";
        mAlternative[3][1] =  "Water";
        mAlternative[3][2] =  "Air";
        mAlternative[3][3] =  "Soil";
        
        mAlternative[4][0] =  "Fly";
        mAlternative[4][1] =  "Move by itself";
        mAlternative[4][2] =  "Swim";
        mAlternative[4][3] =  "Walk";
        
        mAlternative[5][0] =  "Bud";
        mAlternative[5][1] =  "Stem";
        mAlternative[5][2] =  "Seed";
        mAlternative[5][3] =  "Petals";
        
        mAlternative[6][0] =  "Soil";
        mAlternative[6][1] =  "Oil";
        mAlternative[6][2] =  "Gas";
        mAlternative[6][3] =  "Juice";
        
        mAlternative[7][0] =  "Food";
        mAlternative[7][1] =  "Water";
        mAlternative[7][2] =  "Shelter";
        mAlternative[7][3] =  "Air";
        
        mAlternative[8][0] =  "Food";
        mAlternative[8][1] =  "Water";
        mAlternative[8][2] =  "Shelter";
        mAlternative[8][3] =  "Air";
        
        mAlternative[9][0] =  "Washing clothes";
        mAlternative[9][1] =  "Boiling milk";
        mAlternative[9][2] =  "Smoke from cars";
        mAlternative[9][3] =  "Watering plants";
   
        return mAlternative;
    }
    
    public static String[] setHints() {
        mHints[0] = "Non living things don't need air.";
        mHints[1] = "Living things need air";
        mHints[2] = "Living things need food, air and water to survive.";
        mHints[3] = "Living things need food, air and water to survive.";
        mHints[4] = "Table can't move by itself";
        mHints[5] = "It looks like sand and its in dark brown";
        mHints[6] = "Plants need food, air, light and water to survive.";
        mHints[7] = "Living things need food, air and water to survive.";
        mHints[8] = "We sleep in this place everyday";
        mHints[9] = "The air smells bad because of this.";

        return mHints;
    }
  
}
