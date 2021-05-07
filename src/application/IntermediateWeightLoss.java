package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class IntermediateWeightLoss implements ExerciseInt{
    private final static String[] exerciseList = new String[]{"Push-ups: 10 reps", "Tricep Dips: 15 reps", "Leg lifts: 15 reps", "Bicep CUrls: 15 reps"};
    VBox exerciseRoot = new VBox();
    Button backToFIPageBtn = new Button("Back to Fitness Intake Page");

    @Override
    public void listExercises() {
        if(exerciseList.length > 0){
            // Lists Advanced workouts on Exercise Page
            for(String exercise : exerciseList) {
                exerciseRoot.getChildren().add(new Label(exercise));
            }
        }
    }
}
