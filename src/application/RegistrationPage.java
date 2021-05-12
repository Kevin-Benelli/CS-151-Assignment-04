package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.Font;

public class RegistrationPage {

    private String[] registrationFields = new String[]{" Email: ", " Create New Password: "};

    protected Button registrationToLoginBtn = new Button("Back to Login Page");
    protected Button registrationBtn = new Button("Register");
    protected Label registrationHeader = new Label("Registration Page - Sign Up Now! \n");
    protected VBox registrationRoot = new VBox(20);
    protected Button signupBtn = new Button("Sign Up!");

    /**
     * Initializing Constructor sets Registration page header style
     */
    public RegistrationPage(){

        registrationRoot.setAlignment(Pos.CENTER);
        registrationHeader.setFont(new Font(18));
        registrationHeader.setFont(Font.font("Verdana", FontWeight.BOLD, 30));
        registrationHeader.styleProperty().set("-fx-padding: 30 50 30 50; -fx-background-color: #A0DEE7; -fx-text-alignment: center;");

        //background image
        String image = LoginPage.class.getResource("pictures/background.jpeg").toExternalForm();
        registrationRoot.setStyle("-fx-background-image: url('" + image + "'); " +
                "-fx-background-position: center center; " +
                "-fx-background-repeat: repeat-y;" + "-fx-background-color:transparent");

        /*registrationHeader.setFont(Font.font("Verdana", FontWeight.BOLD, 25));
        registrationHeader.styleProperty().set("-fx-padding: 30; -fx-background-color: #88BDC4;");
        registrationHeader.setTextAlignment(TextAlignment.LEFT);
        registrationHeader.setStyle("-fx-font: normal bold 20px 'serif' ");
        //registrationBtn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        registrationToLoginBtn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");*/
    }

    /**
     * List all Registration field names on Registration Page
     */
    public void listFieldNames(){
        for(String exercise : registrationFields){
            TextField exerciseTextField = new TextField();
            exerciseTextField.setPromptText(exercise);
            registrationRoot.getChildren().add(exerciseTextField);
            exerciseTextField.setMaxWidth(300);
        }
    }

}