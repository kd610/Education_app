package Questions;



public class scienceLevel3 {
    
    static String[] mQuestions = new String[10];
    static String[] mAnswers = new String[10];
    static String[][] mAlternative = new String[100][100];
    static String[] mHints = new String[10];
    
     public static String[] setQuestion() {
        mQuestions[0] = "A balanced diet is the one which is";
        mQuestions[1] = "Your balanced diet must be planned at your own calorie level, and\r\n" + 
        		"portion size is key. Is this statement correct or incorrect?";
        mQuestions[2] = "Fruits and vegetables are rich in";
        mQuestions[3] = "The best protein choices are";
        mQuestions[4] = "Which of the following is NOT a healthy habit?";
        mQuestions[5] = "According to doctors, we should sleep in a";
        mQuestions[6] = "Which of the following is an Unhealthy habit?";
        mQuestions[7] = "Which of the following helps us in reducing stress?";
        mQuestions[8] = "Which of the following is a disease-causing germ?";
        mQuestions[9] = "Antibiotics are used to treat infections.";

        return mQuestions;
    }
     
     public static String[] setCorrectAnswer() {
        mAnswers[0] = "Option B and C";
        mAnswers[1] = "Correct";
        mAnswers[2] = "Option A and B";
        mAnswers[3] = "Option A and B";
        mAnswers[4] = "Smoking";
        mAnswers[5] = "Dark room";
        mAnswers[6] = "Drinking soda";
        mAnswers[7] = "All of the above";
        mAnswers[8] = "All of the above";
        mAnswers[9] = "Bacterial";
      
        return mAnswers;
    }
    
    public static String[][] setAlternative() {
        mAlternative[0][0] =  "Tasty";
        mAlternative[0][1] =  "Nutritious";
        mAlternative[0][2] =  "Healthy";
        mAlternative[0][3] =  "Option B and C";
        
        mAlternative[1][0] =  "Correct";
        mAlternative[1][1] =  "Incorrect";
        
        mAlternative[2][0] =  "Carbohydrates";
        mAlternative[2][1] =  "Vitamins";
        mAlternative[2][2] =  "Option A and B";
        mAlternative[2][3] =  "Fats";
        
        mAlternative[3][0] =  "Fish";
        mAlternative[3][1] =  "Poultry";
        mAlternative[3][2] =  "Option A and B";
        mAlternative[3][3] =  "Pizza";
        
        mAlternative[4][0] =  "Regular exercise";
        mAlternative[4][1] =  "Adequate sleep";
        mAlternative[4][2] =  "Smoking";
        mAlternative[4][3] =  "Playing with friends";
        
        mAlternative[5][0] =  "Dark room";
        mAlternative[5][1] =  "Noisy room";
        mAlternative[5][2] =  "A room in which music is being played";
        mAlternative[5][3] =  "Doesn't matter";
        
        mAlternative[6][0] =  "Working hard";
        mAlternative[6][1] =  "Managing your stress";
        mAlternative[6][2] =  "Drinking soda";
        mAlternative[6][3] =  "Eating clean food";
        
        mAlternative[7][0] =  "Talking to friends about the situation";
        mAlternative[7][1] =  "Watching a movie with loved ones";
        mAlternative[7][2] =  "Reading books or playing games";
        mAlternative[7][3] =  "All of the above";
        
        mAlternative[8][0] =  "Bacteria";
        mAlternative[8][1] =  "Virus";
        mAlternative[8][2] =  "Protozoa";
        mAlternative[8][3] =  "All of the above";
        
        mAlternative[9][0] =  "Bacterial";
        mAlternative[9][1] =  "Viral";
        mAlternative[9][2] =  "Option A and B";
        mAlternative[9][3] =  "None of the above";
        
       
   
        return mAlternative;
    }
  
    public static String[] setHints() {
        mHints[0] = "We need our food to have good nutrients to stay healthy.";
        mHints[1] = "If we eat too much we become fat";
        mHints[2] = "Orange is rich in Vitamin C.";
        mHints[3] = "It's a living thing.";
        mHints[4] = "The air becomes unclean because of this";
        mHints[5] = "We can't sleep when the room is bright.";
        mHints[6] = "This drink is carbonated.";
        mHints[7] = "It makes us happy.";
        mHints[8] = "It makes us fall ill";
        mHints[9] = "Can protect us from being ill.";

        return mHints;
    }
}
