/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author zono
 */
public class Level_Page {
    static Circle circle1;
    static Circle circle2;
    static Circle circle3;
    
    protected static StackPane getlevelPage() throws FileNotFoundException {
        
        
        //Number 1 Image
        FileInputStream imageStream1 = new FileInputStream("number1.png");
        Image number1 = new Image(imageStream1);
        ImageView circle1 = new ImageView(number1);
        circle1.setFitHeight(150);
        circle1.setFitWidth(150);
        
        //Set a index of 2 as Level_Page when circle1 gets clicked mouse
        //And set level1 
        circle1.setOnMouseClicked(e -> {
            Main.set_pane(2);
            Question_Page.getLevel(1);
        });
        
        //Number 2 Image
        FileInputStream imageStream2 = new FileInputStream("number2.png");
        Image number2 = new Image(imageStream2);
        ImageView circle2 = new ImageView(number2);
        circle2.setFitHeight(150);
        circle2.setFitWidth(150);
        
        //Set a index of 2 as Level_Page when circle1 gets clicked mouse
        //And set level1 
        circle2.setOnMouseClicked(e -> {
            Main.set_pane(2);
            Question_Page.getLevel(2);
        });
        
        //Number 3 Image
        FileInputStream imageStream3 = new FileInputStream("number3.png");
        Image number3 = new Image(imageStream3);
        ImageView circle3 = new ImageView(number3);
        circle3.setFitHeight(150);
        circle3.setFitWidth(150);
        
        //Set a index of 2 as Level_Page when circle1 gets clicked mouse
        //And set level1 
        circle3.setOnMouseClicked(e -> {
            Main.set_pane(2);
            Question_Page.getLevel(3);
        });
        
        HBox hbox = new HBox();
        hbox.getChildren().addAll(circle1, circle2, circle3);
        hbox.setSpacing(40);
        hbox.setAlignment(Pos.CENTER);
        
        Label lbl = new Label("Choose a level");
        lbl.setFont(Font.font("Family", FontWeight.BOLD, 60));
        
        VBox vbox = new VBox();
        vbox.getChildren().addAll(lbl, hbox);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(50);
        
        StackPane background = new StackPane();
        
        FileInputStream imageBg = new FileInputStream("subjectAndLevel.png");
        Image bg = new Image(imageBg);
        ImageView bgView = new ImageView(bg);
        bgView.fitWidthProperty().bind(background.widthProperty()); 
        bgView.fitHeightProperty().bind(background.heightProperty()); 
        background.getChildren().addAll(bgView, vbox);
        
        StackPane pane = new StackPane(background);
        
        return pane;
    }
    
}
