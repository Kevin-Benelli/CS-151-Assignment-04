package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class AdvancedWeightLoss implements ExerciseInt{
    private final static String[] exerciseList =  new String[]{"Squat", "Bench Press", "Deadlift"};
    VBox exerciseRoot = new VBox();
    Button backToFIPageBtn = new Button("Back to Fitness Intake Page");
    @Override
    public void listExercises() {
        if(exerciseList.length > 0){
//            System.out.println(allWorkouts[0]);
            // Lists Advanced workouts on Exercise Page
            for(String exercise : exerciseList) {
                exerciseRoot.getChildren().add(new Label(exercise));
            }
        }
    }

}
