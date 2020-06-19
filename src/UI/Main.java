/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.*;
import UI.*;
import java.io.FileNotFoundException;

/**
 *
 * @author zono
 * 
 * <ReadMe>
 * 
 * • Start_Page: Show start page
 * • Level_Page: Select a level(1 or 2 or 3) as clicking a circle
 * • Subject_Page: Select a Subject(Math or English or Science) as clicking a circle
 * • EnterName_Page: Enter a player name and Start the game as pushing start button
 * • Question_Page: Answering questions
 * • Result_Page: Show a result
 * • Ranking_Page: show a ranking
 * 
 */

public class Main extends Application{
    //listPane has each pages as index of ArrayList
    static List<StackPane> listPane = new ArrayList<StackPane>(); 
    static StackPane pane;
    //This variable is a current index number as page.        
    private static int idx_cur = 0;
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
       
        //Add all pages into listPane
        listPane.add(Start_Page.getMainPage());
        listPane.add(Level_Page.getlevelPage());
        listPane.add(Subject_Page.getSubjectPage());
        listPane.add(EnterName_Page.getENPage());
        listPane.add(Question_Page.getQuestionPage());
        listPane.add(Result_Page.getResultPage());
        listPane.add(Ranking_Page.getRankingPage());

        //Set Start_Page as shown first page
        pane = new StackPane();
        pane.getChildren().add(listPane.get(0));

        Scene scene = new Scene(pane, 950, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
           
      
    }
    
    //Get index of page
    public static StackPane get_Pane(int idx){
        return listPane.get(idx);
    }
    
    //Set index of page in listPane and update idx_cur
    public static void set_pane(int idx){
        //System.out.println(idx);
        pane.getChildren().remove(listPane.get(idx_cur));
        pane.getChildren().add(listPane.get(idx));
        idx_cur = idx;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
