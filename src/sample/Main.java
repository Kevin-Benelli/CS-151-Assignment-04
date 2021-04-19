package sample;

import javafx.application.Application;;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


public class Main extends Application {

    private Button fitnessIntakeToLoginBtn = new Button("Back to Login Page");
    private Button registrationToLoginBtn = new Button("Back to Login Page");
    private Button exerciseToLoginBtn = new Button("Back to Login Page");


    private String[] allWorkouts = new String[]{"Push Ups", "Sit Ups", "Crunches", "Pull-Ups", "Tricep Dips"};
    private String[] fitnessIntake = new String[]{"Name: ", "Age: ", "Fitness level: ", "Goals: "};
    private String[] registrationFields = new String[]{"Set Email: ", "Set Password: "};
    private String[] loginFields = new String[]{"Email: ", "Password: "};


    private String[] validCredentials = new String[]{"test123", "pass123"};

//    private String[] begginerWorkouts = new String[]{"Kneeled Push-ups: 10 reps", "Tricep Dips"};
//    private String[] intermediateWorkouts = new String[]{"Pull-Ups", "ex2"};
//    private String[] advanceWorkouts = new String[]{"Kneeled Push-ups: 10 reps", "Tricep Dips"};

    private int fitnessLevel = 0;
    Stage window;
    Scene loginPageScene, registrationScene, fitnessIntakeScene, exerciseScene;


    @Override
    public void start(Stage primaryStage){
        try{
            window = primaryStage;

            /* TODO:
              1.) FORMAT APPLY OOP TO MODULARIZE CODE TO IMPROVE READABILITY AND CODE RESUSABILITY
              2.) ADD METHODS FOR:
                 a.) VALIDATE PASSWORD
                 b.) FITNESS INTAKE CALCULATIONS
                 c.) MAPPING TO SPECIFIC WORKOUT REGIMES
                 d.) REGISTER USER METHOD
                 e.) CLEAR INPUT ONCLICK FOR BACK TO LOGIN BUTTON
            */

            // Login Page
            Label loginLbl = new Label("iWorkout - Login page");
            loginLbl.setFont(new Font(18));
            loginLbl.setTextAlignment(TextAlignment.CENTER);

            VBox loginRoot = new VBox(20); // spaces 20 px to avoid crowding
            Button loginBtn = new Button("Login");
            loginBtn.setOnAction(event -> window.setScene(fitnessIntakeScene));

            // Sets event listeners for fitness, registration, and exercise btns
            fitnessIntakeToLoginBtn.setOnAction(event -> window.setScene(loginPageScene));
            registrationToLoginBtn.setOnAction(event -> window.setScene(loginPageScene));
            exerciseToLoginBtn.setOnAction(event -> window.setScene(loginPageScene));

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


            // Exercises Page
            Text exercisePageHeader = new Text("Your Exercises");
            exercisePageHeader.setFont(new Font(18));
            exercisePageHeader.setTextAlignment(TextAlignment.CENTER);
            Button exerciseBtn = new Button("Generate Exercises");
            exerciseBtn.setOnAction(event -> window.setScene(exerciseScene));
            VBox exerciseRoot = new VBox();

            // Create Exercise Layout
            exerciseRoot.getChildren().addAll(exercisePageHeader, exerciseToLoginBtn);


            // Create Login Page
            loginRoot.getChildren().addAll(loginLbl); // Setting Login page with login lbl and registration and login buttons


            // Create Registration Layout
            registrationRoot.getChildren().addAll(registrationHeader, registrationToLoginBtn);

            // Create Fitness Intake Layout
            fitnessIntakeRoot.getChildren().addAll(fitnessIntakeHeader, fitnessIntakeToLoginBtn, exerciseBtn);



            // List all login field names on Login Page
            for(String exercise : loginFields){
                TextField exerciseTextField = new TextField();
                exerciseTextField.setPromptText(exercise);
                loginRoot.getChildren().add(exerciseTextField);
            }

            // Lists all registration field names on Registration page
            for(String exercise : registrationFields){
                TextField exerciseTextField = new TextField();
                exerciseTextField.setPromptText(exercise);
                registrationRoot.getChildren().add(exerciseTextField);
            }


            // Lists all fitness intake questions on Fitness Intake Page
            for(String exercise : fitnessIntake){
                TextField exerciseTextField = new TextField();
                exerciseTextField.setPromptText(exercise);
                fitnessIntakeRoot.getChildren().add(exerciseTextField);
            }

            // Lists All workouts on Exercise Page
            for(String exercise : allWorkouts){
                exerciseRoot.getChildren().add(new Label(exercise));
            }

            // Create Login Page
            loginRoot.getChildren().addAll(registrationBtn, loginBtn); // Setting Login page with login lbl and registration and login buttons


            // Sets scenes with layout and dimensions
            loginPageScene = new Scene(loginRoot, 400, 400);
            registrationScene = new Scene(registrationRoot, 400, 400);
            fitnessIntakeScene = new Scene(fitnessIntakeRoot, 400, 400);
            exerciseScene = new Scene(exerciseRoot, 400, 400);

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
