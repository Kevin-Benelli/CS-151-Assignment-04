package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class BeginnerBuildMuscle implements ExerciseInt{
    private final static String[] exerciseList = new String[]{ "\n", "Kneeled Push Ups: 10 reps", "\n", "Sit Ups: 10 reps", "\n", "Crunches: 10 reps", "\n", "Pull-Ups: 5 reps", "\n", "Tricep Dips: 10 reps"};

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
