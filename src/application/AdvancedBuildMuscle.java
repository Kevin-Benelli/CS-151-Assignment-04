package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.Random;

public class AdvancedBuildMuscle implements ExerciseInt {

    private String[] exerciseList =  new String[10];
    VBox exerciseRoot = new VBox();
    Button backToFIPageBtn = new Button("Back to Fitness Intake Page");

    @Override
    public void listExercises() {
        generateRandomExercises();

        if(exerciseList.length > 0){
            // Lists Beginner workouts on Exercise Page
            for(String exercise : exerciseList) {
                exerciseRoot.getChildren().add(new Label(exercise));
            }
        }
    }

    public void generateRandomExercises(){
        int max = allWorkouts.length;
        Random randInt = new Random();

        for(int i = 0; i < 10; i++){
            //Generate random int value from 1 to allWorkouts length
            exerciseList[i] = allWorkouts[randInt.nextInt(max)];
        }
    }


}