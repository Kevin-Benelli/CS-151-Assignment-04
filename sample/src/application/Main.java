package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    Stage window;
    Scene loginPageScene, registrationScene, fitnessIntakeScene, exerciseScene;

    @Override
    public void start(Stage primaryStage){
        try{
            window = primaryStage;

            /* TODO:
              1.) ADD METHODS FOR:
                 a.) VALIDATE PASSWORD
                 b.) FITNESS INTAKE CALCULATIONS
                 c.) MAPPING TO SPECIFIC WORKOUT REGIMES
                 d.) REGISTER USER METHOD
                 e.) CLEAR INPUT ONCLICK FOR BACK TO LOGIN BUTTON
            */

            // Instantiate Login, Registration, Fitness Intake, and Exercise Pages
            LoginPage lgnPage = new LoginPage();
            RegistrationPage regPage = new RegistrationPage();
            FitnessIntakePage FIPage = new FitnessIntakePage();
            ExercisePage exerPage = new ExercisePage();

            lgnPage.loginBtn.setOnAction(event -> {
                String userName = lgnPage.emailField.getText();
                String userPass = lgnPage.passwordField.getText();
                lgnPage.loginRoot.getChildren().getClass();
                Boolean isCredentialValid = lgnPage.validateLoginAttempt(userName, userPass);
                if(isCredentialValid){
                    window.setScene(fitnessIntakeScene);
                }

            });

            // Sets event listeners for fitness, registration, and exercise btns
            FIPage.fitnessIntakeToLoginBtn.setOnAction(event -> window.setScene(loginPageScene));
            regPage.registrationToLoginBtn.setOnAction(event -> window.setScene(loginPageScene));
            exerPage.exerciseToLoginBtn.setOnAction(event -> window.setScene(loginPageScene));

            regPage.registrationBtn.setOnAction(event -> window.setScene(registrationScene));
            exerPage.exerciseBtn.setOnAction(event -> window.setScene(exerciseScene));

            // Create Exercise Layout
            exerPage.exerciseRoot.getChildren().addAll(exerPage.exercisePageHeader, exerPage.exerciseToLoginBtn);

            // Create Login Page
            lgnPage.loginRoot.getChildren().addAll(lgnPage.loginLbl); // Setting Login page with login lbl and registration and login buttons

            // Create Registration Layout
            regPage.registrationRoot.getChildren().addAll(regPage.registrationHeader, regPage.registrationToLoginBtn);

            // Create Fitness Intake Layout
            FIPage.fitnessIntakeRoot.getChildren().addAll(FIPage.fitnessIntakeHeader, FIPage.fitnessIntakeInfo, FIPage.fitnessIntakeToLoginBtn, exerPage.exerciseBtn);

            // List all UI field names for login, registration, fitness intake, and exercise pages
            lgnPage.listFieldNames();
            regPage.listFieldNames();
            FIPage.listFieldNames();
//            exerPage.listExercises();
            //exerPage.listIntExercises();
            //exerPage.listAdvExcercises();

            // Create Login Page
            lgnPage.loginRoot.getChildren().addAll(regPage.registrationBtn, lgnPage.loginBtn); // Setting Login page with login lbl and registration and login buttons

            // Sets scenes with layout and dimensions
            loginPageScene = new Scene(lgnPage.loginRoot, 400, 400);
            registrationScene = new Scene(regPage.registrationRoot, 400, 400);
            fitnessIntakeScene = new Scene(FIPage.fitnessIntakeRoot, 400, 400);
            exerciseScene = new Scene(exerPage.exerciseRoot, 400, 400);

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
