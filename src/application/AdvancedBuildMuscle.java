package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.Random;

public class AdvancedBuildMuscle implements ExerciseInt {

    private String[] exerciseList =  new String[10];
    VBox exerciseRoot = new VBox();
    Label advBMLabel = new Label("Muscle Building Workout - Advanced \n");
    Button backToFIPageBtn = new Button("Back to Fitness Intake Page");

    public AdvancedBuildMuscle()
    {
        advBMLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 30));
        advBMLabel.styleProperty().set("-fx-padding: 30 50 30 50; -fx-background-color: #A0DEE7; -fx-text-alignment: center;");

        String image = LoginPage.class.getResource("pictures/background.jpeg").toExternalForm();
        exerciseRoot.setStyle("-fx-background-image: url('" + image + "'); " +
                "-fx-background-position: center center; " +
                "-fx-background-repeat: stretch;" + "-fx-background-size: 900px 600px;" + "-fx-background-color:transparent");

    }

    @Override
    public void listExercises() {
        generateRandomExercises();
        exerciseRoot.getChildren().clear();
        exerciseRoot.getChildren().addAll(advBMLabel, backToFIPageBtn);

        if(exerciseList.length > 0){
            // Lists Beginner workouts on Exercise Page
            for(String exercise : exerciseList) {
                exerciseRoot.getChildren().add(new Label(exercise));
            }
        }
    }

    public void generateRandomExercises(){
        int max = AdvancedBuildMuscleWorkouts.length;
        Random randInt = new Random();
        int seed;
        do {
        	seed = randInt.nextInt(max);
        } while(seed == 0);
        for(int i = 0; i < 10; i++){
        	 //System.out.println(AdvancedBuildMuscleWorkouts[randInt.nextInt(seed)]);
             //Generate random int value from 1 to allWorkouts length
             exerciseList[i] = AdvancedBuildMuscleWorkouts[randInt.nextInt(seed)];
            }
        }


}
