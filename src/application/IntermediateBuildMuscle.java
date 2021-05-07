package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.Random;

public class IntermediateBuildMuscle implements ExerciseInt{
    private String[] exerciseList = new String[10];

    VBox exerciseRoot = new VBox();
    Button backToFIPageBtn = new Button("Back to Fitness Intake Page");
    @Override
    public void listExercises() {
        generateRandomExercises();

        // Lists Advanced workouts on Exercise Page
        for(String exercise : exerciseList) {
            exerciseRoot.getChildren().add(new Label(exercise));
        }
    }
    public void generateRandomExercises(){
        int max = allWorkouts.length;
        Random randInt = new Random();
        int seed = randInt.nextInt(max);

        for(int i = 0; i < 10; i++){
            System.out.println(allWorkouts[randInt.nextInt(seed)]);
            //Generate random int value from 1 to allWorkouts length
            exerciseList[i] = allWorkouts[randInt.nextInt(seed)];
        }
    }
}
