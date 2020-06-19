/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import Fun_Facts.Fun_facts;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/**
 *
 * @author zono
 */
public class Start_Page {
    
    protected static StackPane getMainPage() throws FileNotFoundException {
        
        StackPane background = new StackPane();
        
        //Set background picture
        FileInputStream imageStream1 = new FileInputStream("mainPic.png");
        Image bg = new Image(imageStream1);
        ImageView bgView = new ImageView(bg);
        bgView.fitWidthProperty().bind(background.widthProperty()); 
        bgView.fitHeightProperty().bind(background.heightProperty()); 
        
        //Set main panel
        BorderPane main = new BorderPane();
        Label menuLabel = new Label("Hello ! Are you ready ?");
        menuLabel.setFont(Font.font("Family", FontWeight.BOLD, 60));
        Label factsLabel = new Label("Here is a fun fact: ");
        factsLabel.setFont(Font.font("Family", FontWeight.BOLD, 15));
        
        String funfact = Fun_facts.getFunFacts();
        Label f = new Label(funfact);
        f.setFont(Font.font("Family", 15));
        f.setStyle("-fx-background-color: white;");
        
        //Set playbutton
        FileInputStream imageStream2 = new FileInputStream("playButton.png");
        Image playImg = new Image(imageStream2);
        ImageView play = new ImageView(playImg);
        
        //Action of showing fan fucts
        Button btnMorefacts = new Button("More facts !");
        btnMorefacts.setOnAction(e -> {
            f.setText(Fun_facts.getFunFacts());
        });
        
        BorderPane title = new BorderPane();
        title.setCenter(menuLabel);
        
        GridPane facts = new GridPane();
        facts.setVgap(10);
        facts.setPadding(new Insets(10));
        facts.add(factsLabel, 0, 0);
        facts.add(f, 0, 1);
        facts.add(btnMorefacts, 0, 2);
        GridPane.setHalignment(f, HPos.CENTER);
        GridPane.setHalignment(btnMorefacts, HPos.CENTER);
        
        background.getChildren().addAll(bgView, main);
        main.setTop(title);
        main.setCenter(play);
        main.setBottom(facts);
        facts.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(background, 800, 600);
        
        //Set a index of 1 as Level_Page
        play.setOnMouseClicked(e -> {
            Main.set_pane(1);
        });
        
        StackPane pane = new StackPane(background);
        
        return pane;
        
    }
    
}
