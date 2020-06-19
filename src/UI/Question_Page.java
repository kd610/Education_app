/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Questions.englishLevel1;
import Questions.englishLevel2;
import Questions.englishLevel3;
import Questions.mathLevel1;
import Questions.mathLevel2;
import Questions.mathLevel3;
import Questions.scienceLevel1;
import Questions.scienceLevel2;
import Questions.scienceLevel3;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author zono
 */
public class Question_Page extends EnterName_Page{
        
    static Text txtUser;
    static Text txtScore;
    static Text txtQuestion;
    static Text txtHint;
    static Text txtChoiceA, txtChoiceB, txtChoiceC, txtChoiceD; 
    static Button btnNext, btnHint;
    static int level = 0;
    static int subject = 0;
    static RadioButton rbA, rbB, rbC, rbD;
    
    static String s;
    static String[] q;
    static String[] qA;
    static String[] qHint;
    static String[][] qAlt;
    public static int qaid = 0;
    static HashMap<Integer, String> map;
    public static String chk;
    
   
    
    protected static StackPane getQuestionPage() throws FileNotFoundException {
        
        txtQuestion = new Text();
        txtQuestion.setFont(Font.font("SansSerif", FontWeight.BOLD, 20));
        
        //Set choices
        txtChoiceA = new Text();
        txtChoiceB = new Text();
        txtChoiceC = new Text();
        txtChoiceD = new Text();
        rbA = new RadioButton();
        rbB = new RadioButton(txtChoiceB.getText());
        rbC = new RadioButton(txtChoiceC.getText());
        rbD = new RadioButton(txtChoiceD.getText());
        ToggleGroup group = new ToggleGroup();
        rbA.setToggleGroup(group);
        rbB.setToggleGroup(group);
        rbC.setToggleGroup(group);
        rbD.setToggleGroup(group);
        
        
        btnNext = new Button("Next");
        btnNext.setPrefSize(80, 50);
        
        //Set next button Action
        btnNext.setOnAction(e -> {
            try {
                getAnswer();
            } catch (IOException ex) {
                Logger.getLogger(Question_Page.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
       
        //Set showing hint action
        btnHint = new Button("Give me Hint!!");
        btnHint.setOnAction(e -> {
            setHint(qaid);
        });
                
        //put choices into HBox
        HBox hboxBtn = new HBox();
        hboxBtn.getChildren().addAll(rbA, rbB, rbC, rbD);
        hboxBtn.setPadding(new Insets(10));
        hboxBtn.setSpacing(15);
        hboxBtn.setAlignment(Pos.CENTER);
        
        VBox centerVbox = new VBox();
        centerVbox.getChildren().addAll(txtQuestion, hboxBtn, btnNext);
        centerVbox.setSpacing(100);
        centerVbox.setAlignment(Pos.CENTER);
        
        //Set comeup picture next to hint
        FileInputStream imageStream = new FileInputStream("ComeUp.png");
        Image image = new Image(imageStream);
        ImageView imageView = new ImageView(image);
        
        txtHint = new Text();
        HBox hintHbox = new HBox();
        hintHbox.getChildren().addAll(imageView, txtHint);
        hintHbox.setAlignment(Pos.CENTER);
        
        VBox bottomVbox = new VBox(hintHbox, btnHint);
        bottomVbox.setSpacing(5);
        bottomVbox.setAlignment(Pos.CENTER);
        
        //Set whole panel
        BorderPane paneB = new BorderPane();
        paneB.setCenter(centerVbox);
        paneB.setBottom(bottomVbox);
        paneB.setPadding(new Insets(5));
        paneB.setStyle("-fx-background-color: White");
        paneB.setMaxHeight(500);
        paneB.setMaxWidth(600);
        
        StackPane background = new StackPane();
        
        //Set backgroud picture
        FileInputStream imageBg = new FileInputStream("questionsPic.jpg");
        Image bg = new Image(imageBg);
        ImageView bgView = new ImageView(bg);
        bgView.fitWidthProperty().bind(background.widthProperty()); 
        bgView.fitHeightProperty().bind(background.heightProperty()); 
        background.getChildren().addAll(bgView, paneB);
        
        Scene scene = new Scene(background, 800, 600);
        
        StackPane pane = new StackPane(background);
        
        return pane;
    }

    //Get level from Level_Page
    public static void getLevel(int lev) {
        level = lev;
    }

    //Get subject from Subject_Page
    public static void getSubject(int sub) {
        subject = sub;
    }
    
    //Get Name
    public static void setText(String q){
        txtQuestion.setText(q);
    }
    
    //Set questions, choices, hints from Questions package   
    public static void setQuestions() { 

        q = new String[10];
        qA = new String[10];
        qAlt = new String[100][100];
        qHint = new String[10];
    
        //Get Math (subject == 1)
        if(level == 1 && subject == 1){
            q = mathLevel1.setQuestion();
            qA = mathLevel1.setCorrectAnswer();
            qAlt = mathLevel1.setAlternative();
            qHint = mathLevel1.setHints();
        }else if(level == 2 && subject == 1){
            q = mathLevel2.setQuestion();
            qA = mathLevel2.setCorrectAnswer();
            qAlt = mathLevel2.setAlternative();
            qHint = mathLevel2.setHints();
        }else if(level == 3 && subject == 1){
            q = mathLevel3.setQuestion();
            qA = mathLevel3.setCorrectAnswer();
            qAlt = mathLevel3.setAlternative();
            qHint = mathLevel3.setHints();
        }
        
        //Get English (subject == 2)
        else if(level == 1 && subject == 2){
            q = englishLevel1.setQuestion();
            qA = englishLevel1.setCorrectAnswer();
            qAlt = englishLevel1.setAlternative();
            qHint = englishLevel1.setHints();
        }else if(level == 2 && subject == 2){
            q = englishLevel2.setQuestion();
            qA = englishLevel2.setCorrectAnswer();
            qAlt = englishLevel2.setAlternative();
            qHint = englishLevel2.setHints();
        }else if(level == 3 && subject == 2){
            q = englishLevel3.setQuestion();
            qA = englishLevel3.setCorrectAnswer();
            qAlt = englishLevel3.setAlternative();
            qHint = englishLevel3.setHints();
        }
        
        //Get Math (subject == 3)
        else if(level == 1 && subject == 3){
            q = scienceLevel1.setQuestion();
            qA = scienceLevel1.setCorrectAnswer();
            qAlt = scienceLevel1.setAlternative();
            qHint = scienceLevel1.setHints();
        }else if(level == 2 && subject == 3){
            q = scienceLevel2.setQuestion();
            qA = scienceLevel2.setCorrectAnswer();
            qAlt = scienceLevel2.setAlternative();
            qHint = scienceLevel2.setHints();
        }else if(level == 3 && subject == 3){
            q = scienceLevel3.setQuestion();
            qA = scienceLevel3.setCorrectAnswer();
            qAlt = scienceLevel3.setAlternative();
            qHint = scienceLevel3.setHints();
        }
       
       //Match user replies with question number (Integer: question number, String: user replies)
       map=new HashMap<Integer, String>();
       
       readQuestion(qaid);
       
    }
    
    public static void setHint(int i){
        txtHint.setText(qHint[i]);
        
    } 
     	
    //read questions
    public static void readQuestion(int i){
		        		       
        txtQuestion.setText(q[i]);
        
        rbA.setText(qAlt[i][0]);
        rbB.setText(qAlt[i][1]);
        rbC.setText(qAlt[i][2]);
        rbD.setText(qAlt[i][3]);
        
	rbA.setSelected(false);
	rbB.setSelected(false);
        rbC.setSelected(false);
	rbD.setSelected(false);
	    	  
    }
    	      
    public static String getSelection(){
	            
	return chk;
    }
    
    //action on radio button
    public static void groupAction(int qaid) {

        if(rbA.isSelected()) {
                chk = qAlt[qaid][0];
        }
        else if(rbB.isSelected())
        {
                chk = qAlt[qaid][1];		 

        }
        else if(rbC.isSelected())
        {
                chk = qAlt[qaid][2];		 

        }
        else if(rbD.isSelected())
        {
                chk = qAlt[qaid][3];		 
        }
        
    }

    //action on next button
    public static void getAnswer() throws IOException {
        groupAction(qaid);
        
        if(qaid < 9){
            //System.out.println(qaid);
            map.put(qaid, getSelection());
            //System.out.println(map.get(qaid));
            qaid++;
            chk = null;
            readQuestion(qaid);
        }
        else {
            //System.out.println(qaid);
            map.put(qaid, getSelection());
            Result_Page.getScore(calCorrectAnswer());
            
            Main.set_pane(5);
            qaid = 0;
        }
        
    }
    
    //Calculate user replies
    public static int calCorrectAnswer(){
        int qnum=10;
        int count=0;
        for(int i = 0; i < qnum; i++){
            if(qA[i].equals(map.get(i))){
        	 count++;
            }
         }
         
        return count;
         
     }
    
}