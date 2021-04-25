package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class ExercisePage {

    private String[] allWorkouts = new String[]{"Push Ups", "Sit Ups", "Crunches", "Pull-Ups", "Tricep Dips"};
//    private String[] begginerWorkouts = new String[]{"Kneeled Push-ups: 10 reps", "Tricep Dips"};
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
        exercisePageHeader.setTextAlignment(TextAlignment.CENTER);
        exerciseToLoginBtn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        exercisePageHeader.setStyle("-fx-font: normal bold 20px 'serif' "); 
        exerciseBtn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
          
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