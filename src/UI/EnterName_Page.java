/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author zono
 */
public class EnterName_Page {
   
    static Text txtQuestion;
    static Button btnStart;
    static TextField tfName;;
    
    protected static StackPane getENPage() throws FileNotFoundException {
        
        //set 
        Text txtName= new Text("Enter Your Name: ");
        txtName.setFont(Font.font("Family", FontWeight.BOLD, 40));
        Text txtNospace = new Text("*No space");
        txtNospace.setFont(Font.font("Family", 20));
        txtName.setFill(Color.WHITE);
        txtNospace.setFill(Color.WHITE);
        tfName = new TextField();
        tfName.setMinHeight(40);
        
        GridPane gpane = new GridPane();
        gpane.add(txtName, 0, 0);
        gpane.add(tfName, 1, 0);
        gpane.add(txtNospace, 0, 1);
        gpane.setAlignment(Pos.CENTER);
        GridPane.setHalignment(txtNospace, HPos.CENTER);
 
        btnStart = new Button("Ready !");
        btnStart.setPrefSize(200, 100);
        btnStart.setFont(Font.font("Verdana", FontWeight.BOLD, 30));
        
        //Set a index of 4 as Question_Page
        btnStart.setOnAction(e -> {
            Question_Page.setQuestions(); 
            Result_Page.getName(tfName.getText());
            Main.set_pane(4);
        });
        
        VBox vbox = new VBox(gpane, btnStart);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(60);
        vbox.setPadding(new Insets(10));
        
        StackPane background = new StackPane();
        
        FileInputStream imageBg = new FileInputStream("name.jpg");
        Image bg = new Image(imageBg);
        ImageView bgView = new ImageView(bg);
        bgView.fitWidthProperty().bind(background.widthProperty()); 
        bgView.fitHeightProperty().bind(background.heightProperty()); 
        background.getChildren().addAll(bgView, vbox);
        
        Scene scene = new Scene(background, 800, 600);
        
        StackPane pane = new StackPane(background);
        
        return pane;
        
    } 
    
}