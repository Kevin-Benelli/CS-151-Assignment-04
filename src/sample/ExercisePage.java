package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class ExercisePage {

    private String[] beginnerWorkouts = new String[]{ "\n", "Kneeled Push Ups: 10 reps", "\n", "Sit Ups: 10 reps", "\n", "Crunches: 10 reps", "\n", "Pull-Ups: 5 reps", "\n", "Tricep Dips: 10 reps"};
    private String[] intermediateWorkouts = new String[]{"Push-ups: 10 reps", "Tricep Dips: 15 reps", "Leg lifts: 15 reps", "Bicep CUrls: 15 reps"};
    private String[] advanceWorkouts = new String[]{"Pull-Ups", "ex2"};
    //private String[] advanceWorkouts = new String[]{"Kneeled Push-ups: 10 reps", "Tricep Dips"};

    protected Button exerciseToLoginBtn = new Button("Back to Login Page");
    protected Label exercisePageHeader = new Label("Your Exercises");
    protected Button exerciseBtn = new Button("Generate Exercises");
    protected VBox exerciseRoot = new VBox();

    /**
     * Initializing Constructor sets Exercise page header style
     */
    public ExercisePage(){
        //exercisePageHeader.setFont(new Font(18));
        exercisePageHeader.setFont(Font.font("Verdana", FontWeight.BOLD, 25));
        exercisePageHeader.styleProperty().set("-fx-padding: 30; -fx-background-color: #88BDC4;");
        exercisePageHeader.setTextAlignment(TextAlignment.CENTER);
    }


    /**
     * List all Fitness Intake field names on Fitness Intake Page
     */
    public void listExercises(){
        //String fitnessLevel = fitnessLevelField.getText();
        // Lists Beginner workouts on Exercise Page
        for(String exercise : beginnerWorkouts) {
            exerciseRoot.getChildren().add(new Label(exercise));
        }

    }

}
