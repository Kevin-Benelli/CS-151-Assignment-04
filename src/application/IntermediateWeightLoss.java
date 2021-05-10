package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.Random;

public class IntermediateWeightLoss implements ExerciseInt{
    private String[] exerciseList = new String[10];
    VBox exerciseRoot = new VBox();
    Label intWLLabel = new Label("Weight Loss Workout - Intermediate \n");
    Button backToFIPageBtn = new Button("Back to Fitness Intake Page");

    public IntermediateWeightLoss()
    {
        intWLLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 30));
        intWLLabel.styleProperty().set("-fx-padding: 30 50 30 50; -fx-background-color: #A0DEE7; -fx-text-alignment: center;");

        String image = LoginPage.class.getResource("pictures/background.jpeg").toExternalForm();
        exerciseRoot.setStyle("-fx-background-image: url('" + image + "'); " +
                "-fx-background-position: center center; " +
                "-fx-background-repeat: stretch;" + "-fx-background-size: 900px 600px;" + "-fx-background-color:transparent");

    }

    @Override
    public void listExercises() {
        generateRandomExercises();

        exerciseRoot.getChildren().clear();
        exerciseRoot.getChildren().addAll(intWLLabel, backToFIPageBtn);
        // Lists Advanced workouts on Exercise Page
        for(String exercise : exerciseList) {
            exerciseRoot.getChildren().add(new Label(exercise));
        }
    }

    public void generateRandomExercises(){
        int max = workouts.length;
        Random randInt = new Random();
        int seed = randInt.nextInt(max);

        for(int i = 0; i < 10; i++){
//            System.out.println(allWorkouts[randInt.nextInt(seed)]);
            //Generate random int value from 1 to allWorkouts length
            exerciseList[i] = workouts[randInt.nextInt(seed)];
        }
    }
}
