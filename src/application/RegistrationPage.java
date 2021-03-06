package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Font;

public class RegistrationPage {
    protected Button registrationToLoginBtn = new Button("Back to Login Page");
    protected Button registrationBtn = new Button("Register");
    protected Label registrationHeader = new Label("Registration Page - Sign Up Now! \n");
    protected VBox registrationRoot = new VBox(20);
    protected Button signupBtn = new Button("Sign Up!");
    protected TextField regEmailField = new TextField();
    protected TextField regPasswordField = new TextField();

    /**
     * Initializing Constructor sets Registration page header style
     */
    public RegistrationPage(){

        registrationRoot.setAlignment(Pos.CENTER);
        registrationHeader.setFont(new Font(18));
        registrationHeader.setFont(Font.font("Courier New", FontWeight.BOLD, 30));
        registrationHeader.styleProperty().set("-fx-padding: 30 50 30 50; -fx-background-color: #A0DEE7; -fx-text-alignment: center;");

        //background image
        String image = LoginPage.class.getResource("pictures/background.jpeg").toExternalForm();
        registrationRoot.setStyle("-fx-background-image: url('" + image + "'); " +
                "-fx-background-position: center center; " +
                "-fx-background-repeat: repeat;" + "-fx-background-color:transparent");

        regEmailField.setPromptText("Create New Username: ");
        regEmailField.setMaxWidth(300);
        regPasswordField.setPromptText("Create New Password: ");
        regPasswordField.setMaxWidth(300);

    }

    /**
     * List all Registration field names on Registration Page
     */
    public void listFieldNames(){
        registrationRoot.getChildren().addAll(regEmailField, regPasswordField);
    }


    public void registerUser(String usrn, String pass){
        Controller controller = new Controller();
        controller.registerUser(usrn, pass);
    }

}