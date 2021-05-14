package application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Screen;


public class FitnessIntakePage {

    private String fitnessLevel = "Select Fitness Level";
    private String fitnessGoal = "Select Fitness Goal";
    protected ComboBox fitnessLevelField;
    protected ObservableList<String> fitnessLevelFieldOptions;

    protected ComboBox fitnessGoalsField;
    protected ObservableList<String> fitnessGoalFieldOptions;

    protected Button exerciseBtn = new Button("Generate Exercises");

    protected Button fitnessIntakeToLoginBtn = new Button("Back to Login Page \n");
    protected Label fitnessIntakeHeader = new Label("Fitness Intake Page\n");
    protected Label fitnessIntakeDetails = new Label("Lets start by getting your personalized metrics\n");
    protected  VBox fitnessIntakeRoot = new VBox(20);
    /**
     * Initializing Constructor sets Fitness Intake page header style
     */
    public FitnessIntakePage(){
        setInitialFieldStates();
        setStyles();


    }

    private void setInitialFieldStates(){
        fitnessLevelFieldOptions = FXCollections.observableArrayList(
                "Beginner",
                "Intermediate",
                "Advanced"
        );

        fitnessLevelField = new ComboBox(fitnessLevelFieldOptions);
        fitnessLevelField.setValue("Select Fitness Level");
        fitnessLevelField.setMinWidth(Screen.getScreens().size());

        fitnessGoalFieldOptions = FXCollections.observableArrayList(
                "Build Muscle",
                "Weight Loss"
        );
        fitnessGoalsField = new ComboBox(fitnessGoalFieldOptions);
        fitnessGoalsField.setValue("Select Fitness Goal");
        fitnessGoalsField.setMinWidth(Screen.getScreens().size());
    }

    private void setStyles() {
        fitnessIntakeRoot.setAlignment(Pos.CENTER);
        fitnessIntakeHeader.setTextAlignment(TextAlignment.LEFT);
        fitnessIntakeHeader.styleProperty().set("-fx-padding: 30 50 30 50; -fx-background-color: #A0DEE7; -fx-text-alignment: center;");
        fitnessIntakeHeader.setFont(Font.font("Courier New", FontWeight.BOLD, 30));
        fitnessIntakeDetails.setFont(Font.font("Courier New", 20));
        fitnessIntakeDetails.setStyle("-fx-text-fill: white;");
        fitnessIntakeDetails.styleProperty().set("-fx-padding: 1 5 1 5; -fx-background-color: #A0DEE7; -fx-text-alignment: center;");
        String image = LoginPage.class.getResource("pictures/background.jpeg").toExternalForm();
        fitnessIntakeRoot.setStyle("-fx-background-image: url('" + image + "'); " +
                "-fx-background-position: center center; " +
                "-fx-background-repeat: repeat;" + "-fx-background-color:transparent");
    }

    /**
     * List all Fitness Intake field names on Fitness Intake Page
     */
    public void listFieldNames(){
        fitnessIntakeRoot.getChildren().addAll(fitnessLevelField, fitnessGoalsField);
    }

    public String setFitnessLevelValue(){
        fitnessLevel = (String) fitnessLevelField.getValue();
        return fitnessLevel;
    }

    public String setFitnessGoalValue(){
        fitnessGoal = (String) fitnessGoalsField.getValue();
        return fitnessGoal;
    }

    public String getFitnessLevel(){
        return fitnessLevel;
    }

    public String getFitnessGoal(){
        return fitnessGoal;
    }

    private final static String BEGINNER = "BEGINNER";
    private final static String INTERMEDIATE = "INTERMEDIATE";
    private final static String ADVANCED = "ADVANCED";
    private final static String BUILDMUSCLE = "BUILDMUSCLE";
    private final static String WEIGHTLOSS = "WEIGHTLOSS";
    private String[] customWorkout = new String[2];
    protected VBox exerciseRoot = new VBox();



    public String[] generateWorkoutPlan(String goal, String level) {
        FitnessIntakePage fitnessIntakePage = new FitnessIntakePage();
        fitnessIntakePage.getFitnessGoal().toUpperCase();
        level = fitnessIntakePage.getFitnessLevel().toUpperCase();


        fitnessGoal = fitnessIntakePage.getFitnessGoal().toUpperCase();
        fitnessLevel = fitnessIntakePage.getFitnessLevel().toUpperCase();

        System.out.println(goal + "  |  " + level);

        if(fitnessGoal.equals(BUILDMUSCLE)){
            if(fitnessLevel.equals(BEGINNER)){
                customWorkout = new String[]{BUILDMUSCLE, BEGINNER};
            }else if(fitnessLevel.equals(INTERMEDIATE)){
                customWorkout = new String[]{BUILDMUSCLE, INTERMEDIATE};
            }else if(level.equals(ADVANCED)){
                customWorkout = new String[]{BUILDMUSCLE, ADVANCED};
            }

        }else if(fitnessGoal.equals(WEIGHTLOSS)){
            if(fitnessLevel.equals(BEGINNER)){
                customWorkout = new String[]{WEIGHTLOSS, BEGINNER};
            }else if(fitnessLevel.equals(INTERMEDIATE)){
                customWorkout = new String[]{WEIGHTLOSS, INTERMEDIATE};
            }else if(fitnessLevel.equals(ADVANCED)){
                customWorkout = new String[]{WEIGHTLOSS, ADVANCED};
            }
        }
        return customWorkout;
    }

    /**
     * List all Fitness Intake field names on Fitness Intake Page
     */
    public void listExercises(){
        if(customWorkout.length > 0){
            // Lists Beginner workouts on Exercise Page
            for(String exercise : customWorkout) {
                exerciseRoot.getChildren().add(new Label(exercise));
            }
        }
    }
}


//    private final static String[] beginnerMuscleWorkouts = new String[]{ "\n", "Kneeled Push Ups: 10 reps", "\n", "Sit Ups: 10 reps", "\n", "Crunches: 10 reps", "\n", "Pull-Ups: 5 reps", "\n", "Tricep Dips: 10 reps"};
//    private final static String[] intermediateMuscleWorkouts = new String[]{"Push-ups: 10 reps", "Tricep Dips: 15 reps", "Leg lifts: 15 reps", "Bicep CUrls: 15 reps"};
//    private final static String[] advancedMuscleWorkouts = new String[]{"Squat", "Bench Press", "Deadlift"};
//
//    private final static String[] beginnerWLWorkouts = new String[]{ "\n", "Kneeled Push Ups: 10 reps", "\n", "Sit Ups: 10 reps", "\n", "Crunches: 10 reps", "\n", "Pull-Ups: 5 reps", "\n", "Tricep Dips: 10 reps"};
//    private final static String[] intermediateWLWorkouts = new String[]{"Push-ups: 10 reps", "Tricep Dips: 15 reps", "Leg lifts: 15 reps", "Bicep CUrls: 15 reps"};
//    private final static String[] advancedWLWorkouts = new String[]{"Squat", "Bench Press", "Deadlift"};
