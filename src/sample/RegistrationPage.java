package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.Font;

public class RegistrationPage {

    private String[] registrationFields = new String[]{"Set Email: ", "Set Password: "};
    protected Button registrationToLoginBtn = new Button("Back to Login Page");

    protected Button registrationBtn = new Button("Register");
    protected Text registrationHeader = new Text("Registration Page - Sign Up Now!");
    protected VBox registrationRoot = new VBox();

    /**
     * Initializing Constructor sets Registration page header style
     */
    public RegistrationPage(){
        registrationHeader.setFont(new Font(18));
        registrationHeader.setTextAlignment(TextAlignment.LEFT);
    }

    /**
     * List all Registration field names on Registration Page
     */
    public void listFieldNames(){
        for(String exercise : registrationFields){
            TextField exerciseTextField = new TextField();
            exerciseTextField.setPromptText(exercise);
            registrationRoot.getChildren().add(exerciseTextField);
        }
    }
}
