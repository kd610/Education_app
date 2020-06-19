/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author zono
 */
public class Ranking_Page {
        
    static String name, score;
    static Text txtQuestion;
    static Button btnBack_Main;
    static TextArea taRanking;
    
    protected static StackPane getRankingPage() throws FileNotFoundException {
        
        Text txtCong = new Text("Ranking!");
        txtCong.setFont(Font.font("SansSerif", FontWeight.BOLD, 40));
        
        taRanking = new TextArea();
        taRanking.setPrefHeight(180);
        taRanking.setMaxWidth(450);
        btnBack_Main = new Button("Back To Main Menu");
        btnBack_Main.setStyle(String.format("-fx-font-size: %dpx;", (int)(0.45 * 70)));
        btnBack_Main.setOnAction(e -> {
            Main.set_pane(0);
        });
        
        GridPane gpane = new GridPane();
        gpane.setPadding(new Insets(60));
        gpane.setVgap(80);
        gpane.add(txtCong, 0, 0);
        gpane.add(taRanking, 0 , 1);
        gpane.add(btnBack_Main, 0, 2);
        gpane.setAlignment(Pos.CENTER);
        GridPane.setHalignment(txtCong, HPos.CENTER);
        GridPane.setHalignment(taRanking, HPos.CENTER);
        GridPane.setHalignment(btnBack_Main, HPos.CENTER);
        
        StackPane background = new StackPane();
        
        FileInputStream imageBg = new FileInputStream("rankingPic.jpg");
        Image bg = new Image(imageBg);
        ImageView bgView = new ImageView(bg);
        bgView.fitWidthProperty().bind(background.widthProperty()); 
        bgView.fitHeightProperty().bind(background.heightProperty()); 
        background.getChildren().addAll(bgView, gpane);
        
        Scene scene = new Scene(background, 800, 600);
        
        StackPane pane = new StackPane(background);
        
        return pane;
    }
   
    //Get name from Result_Page
    public static void getName(String n) {
        name = n;
    }
    
    //get score from Result_Page
    public static void getScore(int s) throws IOException {
        score = Integer.toString(s);
    }
    
    //Connect username and score to keep a record on Ranking.txt
    public static void setScoreandName() throws IOException {
        FileWriter fw = new FileWriter("Ranking.txt", true);
        Writer output = new BufferedWriter(fw);
        output.append(name + " " + score + "\n");
        output.close();
        taRanking.clear();
        Ranking_Page.setRanking();
    }
    
    //Order Ranking.txt
    public static void setRanking() throws FileNotFoundException, IOException {
        
        //get username and score from Ranking.txt and set them to HashMap<String, Integer> nameScore
        String line;
        HashMap<String, Integer> nameScore = new HashMap<String, Integer>();
        String[] nameAndscore = new String[2];
        FileReader fileStream = new FileReader("Ranking.txt");
        BufferedReader reader = new BufferedReader(fileStream);
        while((line = reader.readLine()) != null){
            nameAndscore = line.split(" ");
            nameScore.put(nameAndscore[0], Integer.parseInt(nameAndscore[1]));
        }
        
        //Put values into ArrayList entries and order by score
        List<Map.Entry<String, Integer>> entries 
          = new ArrayList<>(nameScore.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        
        //Put entries into LinkedHashMap<> sortedMap
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        
        //Write sorted values into Ranking.txt
        FileWriter fw = new FileWriter("Ranking.txt");
        Writer output = new BufferedWriter(fw);
        int rank = 1;
        for(String key: sortedMap.keySet()){
            output.append(key + " " + Integer.toString(sortedMap.get(key)) + "\n");
            taRanking.appendText(rank + "st: " + key + ", Score: " + sortedMap.get(key) + "\n");
            rank++;
        }
        
        output.close();
        
    }
    
}

