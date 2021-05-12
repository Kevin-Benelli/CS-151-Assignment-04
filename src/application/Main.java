package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    private final static String BEGINNER = "BEGINNER";
    private final static String INTERMEDIATE = "INTERMEDIATE";
    private final static String ADVANCED = "ADVANCED";
    private final static String BUILDMUSCLE = "BUILD MUSCLE";
    private final static String WEIGHTLOSS = "WEIGHT LOSS";

    Stage window;
    Scene loginPageScene, registrationScene, fitnessIntakeScene, beginnerBuildMuscleScene, intermediateBuildMuscleScene,
    advancedBuildMuscleScene, beginnerWeightLossScene, intermediateWeightLossScene, advancedWeightLossScene;

    @Override
    public void start(Stage primaryStage){
        try{
            window = primaryStage;
            window.setWidth(900);
            window.setHeight(600);

            /* TODO:
              1.) ADD METHODS FOR:
                 a.) Create master list of all exercises and choose first 10 for each array/bin (beg, inter, adv) Rand num generator to generate new list
                 b.) FITNESS INTAKE CALCULATIONS
                 c.) MAPPING TO SPECIFIC WORKOUT REGIMES
                 d.) REGISTER USER METHOD
                 e.) CLEAR INPUT ONCLICK FOR BACK TO LOGIN BUTTON
            */

            // Instantiate Login, Registration, Fitness Intake, and Exercise Pages
            LoginPage lgnPage = new LoginPage();
            RegistrationPage regPage = new RegistrationPage();
            FitnessIntakePage FIPage = new FitnessIntakePage();
            BeginnerBuildMuscle beginnerBuildMuscle = new BeginnerBuildMuscle();
            IntermediateBuildMuscle intermediateBuildMuscle = new IntermediateBuildMuscle();
            AdvancedBuildMuscle advancedBuildMuscle = new AdvancedBuildMuscle();

            BeginnerWeightLoss beginnerWeightLoss = new BeginnerWeightLoss();
            IntermediateWeightLoss intermediateWeightLoss = new IntermediateWeightLoss();
            AdvancedWeightLoss advancedWeightLoss = new AdvancedWeightLoss();

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
            beginnerBuildMuscle.backToFIPageBtn.setOnAction(event -> window.setScene(fitnessIntakeScene));
            intermediateBuildMuscle.backToFIPageBtn.setOnAction(event -> window.setScene(fitnessIntakeScene));
            advancedBuildMuscle.backToFIPageBtn.setOnAction(event -> window.setScene(fitnessIntakeScene));
            beginnerWeightLoss.backToFIPageBtn.setOnAction(event -> window.setScene(fitnessIntakeScene));
            intermediateWeightLoss.backToFIPageBtn.setOnAction(event -> window.setScene(fitnessIntakeScene));
            advancedWeightLoss.backToFIPageBtn.setOnAction(event -> window.setScene(fitnessIntakeScene));


            regPage.registrationBtn.setOnAction(event -> window.setScene(registrationScene));


            FIPage.fitnessGoalsField.setOnAction(event ->{
                FIPage.setFitnessGoalValue();
            });

            FIPage.fitnessLevelField.setOnAction(event ->{
                FIPage.setFitnessLevelValue();
            });

            FIPage.exerciseBtn.setOnAction(event -> {
                System.out.print(FIPage.getFitnessLevel().toUpperCase().equals("") + " | " + FIPage.getFitnessLevel().toUpperCase() + " |    " + FIPage.getFitnessGoal().toUpperCase() + " bool: " + (!FIPage.getFitnessLevel().toUpperCase().equals("SELECT FITNESS LEVEL") && !FIPage.getFitnessGoal().toLowerCase().equals("SELECT FITNESS GOAL"))+ "\n");
                // Create Exercise Layout

//                beginnerBuildMuscle.exerciseRoot.getChildren().addAll(beginnerBuildMuscle.exercisePageHeader, beginnerBuildMuscle.backToFIPageBtn);
//                intermediateBuildMuscle.exerciseRoot.getChildren().addAll(intermediateBuildMuscle.exercisePageHeader, intermediateBuildMuscle.backToFIPageBtn);
//                advancedBuildMuscle.exerciseRoot.getChildren().addAll(advancedBuildMuscle.exercisePageHeader, advancedBuildMuscle.backToFIPageBtn);
//                beginnerWeightLoss.exerciseRoot.getChildren().addAll(beginnerWeightLoss.exercisePageHeader, beginnerWeightLoss.backToFIPageBtn);
//                intermediateWeightLoss.exerciseRoot.getChildren().addAll(intermediateWeightLoss.exercisePageHeader, intermediateWeightLoss.backToFIPageBtn);
//                advancedWeightLoss.exerciseRoot.getChildren().addAll(advancedWeightLoss.exercisePageHeader, advancedWeightLoss.backToFIPageBtn);

                beginnerBuildMuscle.listExercises();
                intermediateBuildMuscle.listExercises();
                advancedBuildMuscle.listExercises();
                beginnerWeightLoss.listExercises();
                intermediateWeightLoss.listExercises();
                advancedWeightLoss.listExercises();

                // If user does not select fitness level and goal, we will not set new scene
                if(!FIPage.getFitnessLevel().toUpperCase().equals("SELECT FITNESS LEVEL") && !FIPage.getFitnessGoal().toUpperCase().equals("SELECT FITNESS GOAL")) {
                    Scene customWorkoutScene = generateWorkoutPlan(FIPage, FIPage.getFitnessGoal(), FIPage.getFitnessLevel());
                    // Create Fitness Intake Layout

                    window.setScene(customWorkoutScene);
                }

            });

            // Create Exercise Layout
            beginnerBuildMuscle.exerciseRoot.getChildren().addAll(beginnerBuildMuscle.exercisePageHeader, beginnerBuildMuscle.backToFIPageBtn);
            intermediateBuildMuscle.exerciseRoot.getChildren().addAll(intermediateBuildMuscle.exercisePageHeader, intermediateBuildMuscle.backToFIPageBtn);
            advancedBuildMuscle.exerciseRoot.getChildren().addAll(advancedBuildMuscle.exercisePageHeader, advancedBuildMuscle.backToFIPageBtn);
            beginnerWeightLoss.exerciseRoot.getChildren().addAll(beginnerWeightLoss.exercisePageHeader, beginnerWeightLoss.backToFIPageBtn, beginnerWeightLoss.begWLheader);
            intermediateWeightLoss.exerciseRoot.getChildren().addAll(intermediateWeightLoss.exercisePageHeader, intermediateWeightLoss.backToFIPageBtn);
            advancedWeightLoss.exerciseRoot.getChildren().addAll(advancedWeightLoss.exercisePageHeader, advancedWeightLoss.backToFIPageBtn);


            // Create Login Page
            lgnPage.loginRoot.getChildren().addAll(lgnPage.loginLbl); // Setting Login page with login lbl and registration and login buttons

            // Create Registration Layout
            regPage.registrationRoot.getChildren().addAll(regPage.registrationHeader, regPage.registrationToLoginBtn);

            // Create Fitness Intake Layout
            FIPage.fitnessIntakeRoot.getChildren().addAll(FIPage.fitnessIntakeHeader, FIPage.fitnessIntakeDetails, FIPage.fitnessIntakeToLoginBtn, FIPage.exerciseBtn);

            // List all UI field names for login, registration, fitness intake, and exercise pages
            lgnPage.listFieldNames();
            regPage.listFieldNames();
            FIPage.listFieldNames();
            beginnerBuildMuscle.listExercises();
            intermediateBuildMuscle.listExercises();
            advancedBuildMuscle.listExercises();
            beginnerWeightLoss.listExercises();
            intermediateWeightLoss.listExercises();
            advancedWeightLoss.listExercises();

            // Create Login Page
            lgnPage.loginRoot.getChildren().addAll(regPage.registrationBtn, lgnPage.loginBtn); // Setting Login page with login lbl and registration and login buttons

            // Sets scenes with layout and dimensions
            loginPageScene = new Scene(lgnPage.loginRoot, 400, 400);
            registrationScene = new Scene(regPage.registrationRoot, 400, 400);
            fitnessIntakeScene = new Scene(FIPage.fitnessIntakeRoot, 600, 600);

            //Build Muscle Scenes
            beginnerBuildMuscleScene = new Scene(beginnerBuildMuscle.exerciseRoot, 600, 600);
                window.setScene(beginnerBuildMuscleScene);
                window.setHeight(1500);
                window.setWidth(900);
            intermediateBuildMuscleScene = new Scene(intermediateBuildMuscle.exerciseRoot, 600, 600);
                window.setScene(intermediateBuildMuscleScene);
                window.setHeight(1500);
                window.setWidth(900);
            advancedBuildMuscleScene = new Scene(advancedBuildMuscle.exerciseRoot, 600, 600);
                window.setScene(advancedBuildMuscleScene);
                window.setHeight(1500);
                window.setWidth(900);

                //Weight Loss Scenes
            beginnerWeightLossScene = new Scene(beginnerWeightLoss.exerciseRoot, 600, 600);
                window.setScene(beginnerWeightLossScene);
                window.setHeight(1500);
                window.setWidth(900);
            intermediateWeightLossScene = new Scene(intermediateWeightLoss.exerciseRoot, 600, 600);
                window.setScene(intermediateWeightLossScene);
                window.setHeight(1500);
                window.setWidth(900);
            advancedWeightLossScene = new Scene(advancedWeightLoss.exerciseRoot, 600, 600);
                window.setScene(advancedWeightLossScene);
                window.setHeight(1500);
                window.setWidth(900);

            // Set first screen to login page
            window.setScene(loginPageScene);
            window.setTitle("iWorkout");
            window.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }


    public Scene generateWorkoutPlan(FitnessIntakePage FIPage, String goal, String level) {
        Scene customWorkout = null;

        goal = FIPage.getFitnessGoal().toUpperCase();
        level = FIPage.getFitnessLevel().toUpperCase();
        System.out.println("Yoooo: " + goal + " | " + level);
        if(goal.equals(BUILDMUSCLE)){
            if(level.equals(BEGINNER)){
                customWorkout = beginnerBuildMuscleScene;
            }else if(level.equals(INTERMEDIATE)){
                customWorkout = intermediateBuildMuscleScene;
            }else if(level.equals(ADVANCED)){
                customWorkout = advancedBuildMuscleScene;
            }
            System.out.println(customWorkout);
        }else if(goal.equals(WEIGHTLOSS)){
            if(level.equals(BEGINNER)){
                customWorkout = beginnerWeightLossScene;
            }else if(level.equals(INTERMEDIATE)){
                customWorkout = intermediateWeightLossScene;
            }else if(level.equals(ADVANCED)){
                customWorkout = advancedWeightLossScene;
            }
            System.out.println(customWorkout);
        }

        return customWorkout;
    }

    public static void main(String[] args) {
        launch(args);
    }
}