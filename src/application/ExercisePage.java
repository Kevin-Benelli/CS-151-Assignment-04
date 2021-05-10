package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public final class ExercisePage {
    private final static String BEGINNER = "BEGINNER";
    private final static String INTERMEDIATE = "INTERMEDIATE";
    private final static String ADVANCED = "ADVANCED";
    private final static String BUILDMUSCLE = "BUILDMUSCLE";
    private final static String WEIGHTLOSS = "WEIGHTLOSS";

    private static Object exercisePageInstance = new ExercisePage();


    private String[] customWorkout;

    private final static String[] beginnerMuscleWorkouts = new String[]{ "\n", "Kneeled Push Ups: 10 reps", "\n", "Sit Ups: 10 reps", "\n", "Crunches: 10 reps", "\n", "Pull-Ups: 5 reps", "\n", "Tricep Dips: 10 reps"};
    private final static String[] intermediateMuscleWorkouts = new String[]{"Push-ups: 10 reps", "Tricep Dips: 15 reps", "Leg lifts: 15 reps", "Bicep CUrls: 15 reps"};
    private final static String[] advancedMuscleWorkouts = new String[]{"Squat", "Bench Press", "Deadlift"};

    private final static String[] beginnerWLWorkouts = new String[]{ "\n", "Kneeled Push Ups: 10 reps", "\n", "Sit Ups: 10 reps", "\n", "Crunches: 10 reps", "\n", "Pull-Ups: 5 reps", "\n", "Tricep Dips: 10 reps"};
    private final static String[] intermediateWLWorkouts = new String[]{"Push-ups: 10 reps", "Tricep Dips: 15 reps", "Leg lifts: 15 reps", "Bicep CUrls: 15 reps"};
    private final static String[] advancedWLWorkouts = new String[]{"Squat", "Bench Press", "Deadlift"};


    protected Button exerciseToLoginBtn = new Button("Back to Login Page");
    protected Label exercisePageHeader = new Label("Your Exercises");
    protected Button exerciseBtn = new Button("Generate Exercises");
    protected VBox exerciseRoot = new VBox();

//    private ExercisePage exercisePageInstance = new ExercisePage();

    /**
     * Initializing Constructor sets Exercise page header style
     */
    public ExercisePage(){
        exercisePageHeader.setFont(Font.font("Verdana", FontWeight.BOLD, 25));
        exercisePageHeader.styleProperty().set("-fx-padding: 30; -fx-background-color: #88BDC4;");
        exercisePageHeader.setTextAlignment(TextAlignment.CENTER);

//        generateWorkoutPlan();
    }

    public void generateWorkoutPlan(String goal, String level) {
//        FitnessIntakePage fitnessIntakePage = new FitnessIntakePage();
//
//        goal = FIPage.getFitnessGoal().toUpperCase();
//        level = FIPage.getFitnessLevel().toUpperCase();
//
        System.out.println(goal + "  |  " + level);
        customWorkout = new String[beginnerMuscleWorkouts.length];

        if(goal.equals(BUILDMUSCLE)){
            if(level.equals(BEGINNER)){
                customWorkout = beginnerMuscleWorkouts;
            }else if(level.equals(INTERMEDIATE)){
                customWorkout = intermediateMuscleWorkouts;
            }else if(level.equals(ADVANCED)){
                customWorkout = advancedMuscleWorkouts;
            }

        }else if(goal.equals(WEIGHTLOSS)){
            if(level.equals(BEGINNER)){
                customWorkout = beginnerWLWorkouts;
            }else if(level.equals(INTERMEDIATE)){
                customWorkout = intermediateWLWorkouts;
            }else if(level.equals(ADVANCED)){
                customWorkout = advancedWLWorkouts;
            }
        }
    }


    /**
     * List all Fitness Intake field names on Fitness Intake Page
     */
    public void listExercises(){
        if(customWorkout.length > 0){
            //String fitnessLevel = fitnessLevelField.getText();
            // Lists Beginner workouts on Exercise Page
            for(String exercise : customWorkout) {
                exerciseRoot.getChildren().add(new Label(exercise));
            }
        }
    }




}
