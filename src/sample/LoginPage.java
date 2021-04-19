package sample;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class LoginPage {

    private String[] loginFields = new String[]{"Email: ", "Password: "};
    private String[] validCredentials = new String[]{"test123", "pass123"};


    protected Label loginLbl = new Label("iWorkout - Login page");
    protected VBox loginRoot = new VBox(20); // spaces 20 px to avoid crowding
    protected Button loginBtn = new Button("Login");


    /**
     * Initializing Constructor sets Login page header style
     */
    public LoginPage(){
        loginLbl.setFont(new Font(18));
        loginLbl.setTextAlignment(TextAlignment.CENTER);
    }

    /**
     * List all login field names on Login Page
     */
    public void listFieldNames(){
        for(String exercise : loginFields){
            TextField exerciseTextField = new TextField();
            exerciseTextField.setPromptText(exercise);
            loginRoot.getChildren().add(exerciseTextField);
        }
    }



}
