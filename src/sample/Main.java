package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.awt.*;
import java.util.Stack;

public class Main extends Application {

    private Button fitnessIntakeToLoginBtn = new Button("Back to Login Page");
    private Button registrationToLoginBtn = new Button("Back to Login Page");
    private Button backToLoginBtn3 = new Button("Back to Login Page");

    private int fitnessLevel = 0;
    Stage window;
    Scene loginPageScene, registrationScene, fitnessIntakeScene;

//
//    public Main(){
//        backToLoginBtn.setOnAction(event -> window.setScene(loginPageScene));
//        backToLoginBtn.setLayoutX(0);
//        backToLoginBtn.setLayoutY(0);
//    }

    @Override
    public void start(Stage primaryStage){
        try{
            window = primaryStage;

            // TODO: FORMAT ALL CODE MODULAR TO EACH PAGE FOR BETTER READABILITY

            // Login Page
            Label loginLbl = new Label("iWorkout - Login page");
            loginLbl.setFont(new Font(18));
            loginLbl.setTextAlignment(TextAlignment.CENTER);
            Button loginBtn = new Button("Login");
            loginBtn.setOnAction(event -> window.setScene(fitnessIntakeScene));
            VBox loginRoot = new VBox(20); // spaces 20 px to avoid crowding

            fitnessIntakeToLoginBtn.setOnAction(event -> window.setScene(loginPageScene));
            registrationToLoginBtn.setOnAction(event -> window.setScene(loginPageScene));

            // Registration Page
            Button registrationBtn = new Button("Register");
            registrationBtn.setOnAction(event -> window.setScene(registrationScene));
            Text registrationHeader = new Text("Registration Page - Sign Up Now!");
            registrationHeader.setFont(new Font(18));
            registrationHeader.setTextAlignment(TextAlignment.LEFT);
            VBox registrationRoot = new VBox();


            // Fitness Intake Page
            Text fitnessIntakeHeader = new Text("Fitness Intake Page\n Lets start by getting your personalized metrics");
            fitnessIntakeHeader.setFont(new Font(18));
            fitnessIntakeHeader.setTextAlignment(TextAlignment.LEFT);
            VBox fitnessIntakeRoot = new VBox();
            fitnessIntakeRoot.getChildren().addAll(fitnessIntakeHeader, fitnessIntakeToLoginBtn);

            // Exercises Page (IN PROGRESS)


            // Create Login Page
            loginRoot.getChildren().addAll(loginLbl, registrationBtn, loginBtn); // Setting Login page with login lbl and registration and login buttons

            // Create Registration Layout
            registrationRoot.getChildren().addAll(registrationHeader, registrationToLoginBtn);

            // Sets scenes with layout and dimensions
            loginPageScene = new Scene(loginRoot, 400, 400);
            registrationScene = new Scene(registrationRoot, 400, 400);
            fitnessIntakeScene = new Scene(fitnessIntakeRoot, 400, 400);


            // Set first screen to login page
            window.setScene(loginPageScene);
            window.setTitle("iWorkout");
            window.show();


        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
