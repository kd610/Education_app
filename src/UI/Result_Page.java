/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
public class Result_Page extends Question_Page{
        
    static Text txtName = new Text();
    static Text txtScore = new Text();
    static Button btnO, btnX;
    static int score=0;
    static Button btnNext_Ranking;
    
    protected static StackPane getResultPage() throws FileNotFoundException {
        
        //Implement Labels(Congratulations!, Name, Score)
        Text txtCong = new Text("Congratulations!");
        txtCong.setFont(Font.font("SansSerif", FontWeight.BOLD, 40));
        Text name = new Text("Your Name: ");
        name.setFont(Font.font("SansSerif", 30));
        Label lblScore = new Label("Your Score: ");
        lblScore.setFont(Font.font("SansSerif", 30));
        
        
        txtName.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
        txtScore.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
        
        GridPane gpane = new GridPane();
        gpane.setVgap(13);
        btnNext_Ranking = new Button("Go to Ranking");
        btnNext_Ranking.setStyle(String.format("-fx-font-size: %dpx;", (int)(0.45 * 70)));
        
        gpane.add(txtCong, 0, 0, 2, 1);
        gpane.add(name, 0, 1);
        gpane.add(txtName, 1, 1);
        gpane.add(lblScore, 0, 2);
        gpane.add(txtScore, 1, 2);
        gpane.add(btnNext_Ranking, 0, 3, 2, 1);
        gpane.setAlignment(Pos.CENTER);
        GridPane.setHalignment(txtCong, HPos.CENTER);
        GridPane.setHalignment(name, HPos.RIGHT);
        GridPane.setHalignment(lblScore, HPos.RIGHT);
        GridPane.setHalignment(btnNext_Ranking, HPos.CENTER);
        
        btnNext_Ranking.setOnAction(e -> {
            Main.set_pane(6);
        });
        
        StackPane background = new StackPane();
        
        //Set background picture
        FileInputStream imageBg = new FileInputStream("resultPic.jpg");
        Image bg = new Image(imageBg);
        ImageView bgView = new ImageView(bg);
        bgView.fitWidthProperty().bind(background.widthProperty()); 
        bgView.fitHeightProperty().bind(background.heightProperty()); 
        background.getChildren().addAll(bgView, gpane);
        
        Scene scene = new Scene(background, 800, 600);
        
        StackPane pane = new StackPane(background);
        
        return pane;
    }
    
    //get score from Question_Page
    public static void getScore(int score) throws IOException {
        txtScore.setText(Integer.toString(score));
        Ranking_Page.getScore(score);
        Ranking_Page.setScoreandName();
    }
    
    //Get user name from EnterName_Page
    public static void getName(String name) {
        txtName.setText(name);
        Ranking_Page.getName(name);
    }
    
}

