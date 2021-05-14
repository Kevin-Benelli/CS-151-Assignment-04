package application;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.Random;

public class IntermediateBuildMuscle implements ExerciseInt{

    //workout images
    private final Image pullups  = new Image("application/pictures/intBM/pullups.jpeg");
    private final Image bbdeadlifts  = new Image("application/pictures/intBM/bbdeadlifts.jpeg");
    private final Image bbrows  = new Image("application/pictures/intBM/bbrows.jpeg");
    private final Image reardeltpull = new Image("application/pictures/intBM/reardeltpull.jpeg");
    private final Image bbcurls  = new Image("application/pictures/intBM/bbcurls.jpeg");
    private final Image closegriplat  = new Image("application/pictures/intBM/closegriplat.jpeg");
    private final Image revfly  = new Image("application/pictures/intBM/revfly.jpeg");
    private final Image shadowboxing  = new Image("application/pictures/intBM/shadowboxing.jpeg");
    private Image[] listOfImages = {pullups, bbdeadlifts, bbrows, reardeltpull, bbcurls, closegriplat, revfly, shadowboxing};

    private String[] exerciseList = new String[10];
    VBox exerciseRoot = new VBox();
    Button backToFIPageBtn = new Button("Back to Fitness Intake Page");
    Label intBMLabel = new Label("Muscle Building Workout - Intermediate \n");
    ListView<String> listView = new ListView<String>();

    public IntermediateBuildMuscle()
    {
        exerciseRoot.setAlignment(Pos.CENTER);
        intBMLabel.setFont(Font.font("Courier New", FontWeight.BOLD, 30));
        intBMLabel.styleProperty().set("-fx-padding: 30 50 30 50; -fx-background-color: #A0DEE7; -fx-text-alignment: center;");
        String image = LoginPage.class.getResource("pictures/background.jpeg").toExternalForm();
        exerciseRoot.setStyle("-fx-background-image: url('" + image + "'); " +
                "-fx-background-position: center center; " +
                "-fx-background-repeat: repeat;" + "-fx-background-size: 900px 600px;");
    }

    @Override
    public void listExercises() {
        ObservableList<String> items
                = FXCollections.observableArrayList (
                "To Failure! If too difficult, exchange for reverse rows using a bar. Can you beat last week?",
                "Progressive overloading, focus on your form, keep your back straight and chin up! Bend the legs.",
                "Progressive overloading. Get that barbel up to your chest, and don't forget to review the instructions!",
                "Higher reps, lower weight. As you pull be sure to pinch those rear delts together.",
                "Feel like Arnie!",
                "Lighter weight, use your biceps to pull the bar to your upper chest.",
                "Pick a weight to fail at 12 reps. Try not to take off, you winged creature of the night!",
                "Take out some swings in the mirror, but don't hit the mirror because the mirror will win.");
        listView.setItems(items);
        listView.setMaxWidth(1000);
        listView.setPrefHeight(2000);
        listView.setCellFactory(param -> new ListCell<String>() {
            private ImageView imageView = new ImageView();
            @Override
            public void updateItem(String name, boolean empty) {
                super.updateItem(name, empty);
                if (empty) {
                    setText(null);
                    setGraphic(null);
                } else {
                    if(name.equals("To Failure! If too difficult, exchange for reverse rows using a bar. Can you beat last week?"))
                        imageView.setImage(listOfImages[0]);
                    else if(name.equals("Progressive overloading, focus on your form, keep your back straight and chin up! Bend the legs."))
                        imageView.setImage(listOfImages[1]);
                    else if(name.equals("Progressive overloading. Get that barbel up to your chest, and don't forget to review the instructions!"))
                        imageView.setImage(listOfImages[2]);
                    else if(name.equals("Higher reps, lower weight. As you pull be sure to pinch those rear delts together."))
                        imageView.setImage(listOfImages[3]);
                    else if(name.equals("Feel like Arnie!"))
                        imageView.setImage(listOfImages[4]);
                    else if(name.equals("Lighter weight, use your biceps to pull the bar to your upper chest."))
                        imageView.setImage(listOfImages[5]);
                    else if(name.equals("Pick a weight to fail at 12 reps. Try not to take off, you winged creature of the night!"))
                        imageView.setImage(listOfImages[6]);
                    else if(name.equals("Take out some swings in the mirror, but don't hit the mirror because the mirror will win."))
                        imageView.setImage(listOfImages[7]);
                    setText(name);
                    setGraphic(imageView);
                }
            }
        });

        exerciseRoot.getChildren().clear();
        exerciseRoot.getChildren().addAll(intBMLabel, backToFIPageBtn, listView);
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
            //Generate random int value from 1 to allWorkouts length
            exerciseList[i] = workouts[randInt.nextInt(seed)];
        }
    }
}
