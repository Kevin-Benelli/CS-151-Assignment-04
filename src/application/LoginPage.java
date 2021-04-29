package sample;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class LoginPage {

    private String[] validCredentials = new String[]{"test123", "pass123"};

    protected TextField emailField = new TextField();
    protected Text invalidCredentials = new Text();
    protected TextField passwordField = new TextField();
    protected Label loginLbl = new Label("iWorkout - Login page");
    protected VBox loginRoot = new VBox(20); // spaces 20 px to avoid crowding
    protected Button loginBtn = new Button("Login");

    /**
     * Initializing Constructor sets Login page header style
     */
    public LoginPage(){
        loginLbl.setFont(new Font(18));
        loginLbl.setFont(Font.font("Verdana", FontWeight.BOLD, 25));
        loginLbl.styleProperty().set("-fx-padding: 30; -fx-background-color: #88BDC4;");
        loginLbl.setTextAlignment(TextAlignment.LEFT);
        emailField.setPromptText("email");
            emailField.setMaxWidth(300);
        passwordField.setPromptText("password");
            passwordField.setMaxWidth(300);
    }

    /**
     * List all login field names on Login Page
     */
    public void listFieldNames(){
            loginRoot.getChildren().addAll(emailField, passwordField);
    }

    /**
     * Get the userName and Password combo and match them
     * @param userName
     * @param passWord
     * @return isCredentialValid Boolean
     */
    public boolean validateLoginAttempt(String userName, String passWord){
        boolean isCredentialValid = false;

        if(userName.equals(validCredentials[0]) && passWord.equals(validCredentials[1])){
            isCredentialValid = true;
            System.out.println("username: " + userName + " | " + validCredentials[0] + "|" + "password: " + passWord + " | " + validCredentials[1] + "|");
            invalidCredentials.setText("");
        }else{
            System.out.println(new Text("Invalid username password combination"));
            if (invalidCredentials.getText().equals("")) {
                invalidCredentials.setText("Invalid username password combination");
                loginRoot.getChildren().add(invalidCredentials);
            }
        }

        return isCredentialValid;
    }
}
