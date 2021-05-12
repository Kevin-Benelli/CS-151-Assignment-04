package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.layout.StackPane;

public class LoginPage {

    private String[] validCredentials = new String[]{"test123", "pass123"};

    protected TextField emailField = new TextField();
    protected Text invalidCredentials = new Text();
    protected TextField passwordField = new TextField();
    protected Label loginLbl = new Label("iWorkout");
    protected VBox loginRoot = new VBox(20); // spaces 20 px to avoid crowding
    protected Button loginBtn = new Button("Login");

    //stackpane to add background image
   /* protected StackPane stackPane = new StackPane();
    protected Image image = new Image(getClass().getResourceAsStream("/application/pullups.jpeg"));
    protected ImageView imageView = new ImageView(image);
    protected Button loginBtn = new Button("Login");*/

    /**
     * Initializing Constructor sets Login page header style
     */
    public LoginPage(){
        loginRoot.setAlignment(Pos.CENTER);
        //loginRoot.styleProperty().set("-fx-background-image: url(\"pullups.jpeg\");");
        loginLbl.setFont(new Font(18));
        loginLbl.setFont(Font.font("Courier New", FontWeight.BOLD, 30));
        loginLbl.styleProperty().set("-fx-padding: 30 50 30 50; -fx-background-color: #A0DEE7; -fx-text-alignment: center;");
        //loginLbl.setTextAlignment(TextAlignment.CENTER);
        emailField.setPromptText("email");
        emailField.setMaxWidth(300);
        passwordField.setPromptText("password");
        passwordField.setMaxWidth(300);

        //stackPane.getChildren().addAll(imageView, loginBtn);
        String image = LoginPage.class.getResource("pictures/background.jpeg").toExternalForm();
        loginRoot.setStyle("-fx-background-image: url('" + image + "'); " +
                "-fx-background-position: center center; " +
                "-fx-background-repeat: repeat-y;" + "-fx-background-color:transparent");
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
//        boolean isCredentialValid = false;
//
//        if(userName.equals(validCredentials[0]) && passWord.equals(validCredentials[1])){
//            isCredentialValid = true;
//            System.out.println("username: " + userName + " | " + validCredentials[0] + "|" + "password: " + passWord + " | " + validCredentials[1] + "|");
//            invalidCredentials.setText("");
//        }else{
//            System.out.println(new Text("Invalid username password combination"));
//            if (invalidCredentials.getText().equals("")) {
//                invalidCredentials.setText("Invalid username password combination");
//                loginRoot.getChildren().add(invalidCredentials);
//            }
//        }
//        invalidCredentials.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
//        invalidCredentials.setFill(Color.BLACK);
//        return isCredentialValid;
//

        Controller controller = new Controller();
        boolean isCredentialValid = controller.verifyLogin(userName, passWord);

        if(isCredentialValid){
            System.out.println("username: " + userName + " | " + validCredentials[0] + "|" + "password: " + passWord + " | " + validCredentials[1] + "|");
            invalidCredentials.setText("");
        }else{
            System.out.println(new Text("Invalid username password combination"));
            if (invalidCredentials.getText().equals("")) {
                invalidCredentials.setText("Invalid username password combination");
                loginRoot.getChildren().add(invalidCredentials);
            }
        }
        invalidCredentials.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        invalidCredentials.setFill(Color.BLACK);

        return isCredentialValid;
    }


}
