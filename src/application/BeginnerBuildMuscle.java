package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.Random;

public class BeginnerBuildMuscle implements ExerciseInt{
    private String[] exerciseList = new String[10];

    VBox exerciseRoot = new VBox();
    Button backToFIPageBtn = new Button("Back to Fitness Intake Page");

    @Override
    public void listExercises() {
        generateRandomExercises();

        exerciseRoot.getChildren().clear();
        exerciseRoot.getChildren().add(backToFIPageBtn);
        if(exerciseList.length > 0){
            // Lists Advanced workouts on Exercise Page
            for(String exercise : exerciseList) {
                exerciseRoot.getChildren().add(new Label(exercise));
            }
        }
//        this.exerciseRoot = exerciseRoot;

        //styles
        exerciseRoot.setAlignment(Pos.CENTER);
    }

    public void generateRandomExercises(){
        int max = workouts.length;
        Random randInt = new Random();
        int seed = randInt.nextInt(max);

        for(int i = 0; i < 10; i++){
            System.out.println(workouts[randInt.nextInt(seed)]);
            //Generate random int value from 1 to allWorkouts length
            exerciseList[i] = workouts[randInt.nextInt(seed)];
        }
    }
}
