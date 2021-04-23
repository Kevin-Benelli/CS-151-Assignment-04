package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class ExercisePage {

    private String[] allWorkouts = new String[]{"Push Ups", "Sit Ups", "Crunches", "Pull-Ups", "Tricep Dips"};
//    private String[] beginnerWorkouts = new String[]{"Kneeled Push-ups: 10 reps", "Tricep Dips"};
//    private String[] intermediateWorkouts = new String[]{"Pull-Ups", "ex2"};
//    private String[] advanceWorkouts = new String[]{"Kneeled Push-ups: 10 reps", "Tricep Dips"};

    protected Button exerciseToLoginBtn = new Button("Back to Login Page");
    protected Text exercisePageHeader = new Text("Your Exercises");
    protected Button exerciseBtn = new Button("Generate Exercises");
    protected VBox exerciseRoot = new VBox();

    /**
     * Initializing Constructor sets Exercise page header style
     */
    public ExercisePage(){
        exercisePageHeader.setFont(new Font(18));
        exercisePageHeader.setFont(Font.font("Verdana", FontWeight.BOLD, 25));
        exercisePageHeader.styleProperty().set("-fx-padding: 30; -fx-background-color: #88BDC4;");
        exercisePageHeader.setTextAlignment(TextAlignment.CENTER);
    }


    /**
     * List all Fitness Intake field names on Fitness Intake Page
     */
    public void listExercises(){
        // Lists All workouts on Exercise Page
        for(String exercise : allWorkouts){
            exerciseRoot.getChildren().add(new Label(exercise));
        }
    }

}
