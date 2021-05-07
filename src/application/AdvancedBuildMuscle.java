package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class AdvancedBuildMuscle implements ExerciseInt {

    private final static String[] exerciseList =  new String[]{"Squat", "Bench Press", "Deadlift"};
    VBox exerciseRoot = new VBox();
    Button backToFIPageBtn = new Button("Back to Fitness Intake Page");
    @Override
    public void listExercises() {
        if(exerciseList.length > 0){
            // Lists Beginner workouts on Exercise Page
            for(String exercise : exerciseList) {
                exerciseRoot.getChildren().add(new Label(exercise));
            }
        }
    }




}
