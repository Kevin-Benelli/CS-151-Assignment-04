package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

public class AdvancedBuildMuscle implements ExerciseInt {

    //workout images
    private final Image hamcurls  = new Image("application/pictures/advBM/hamcurls.jpeg");
    private final Image latlunge  = new Image("application/pictures/advBM/latlunge.jpeg");
    private final Image atomicpushups  = new Image("application/pictures/advBM/atomicpushups.jpeg");
    private final Image abroll = new Image("application/pictures/advBM/abroll.jpeg");
    private final Image tfly  = new Image("application/pictures/advBM/tfly.jpeg");
    private final Image rows  = new Image("application/pictures/advBM/rows.jpeg");
    private final Image chestpress  = new Image("application/pictures/advBM/chestpress.jpeg");
    private final Image tricepext  = new Image("application/pictures/advBM/tricepext.jpeg");
    private final Image bcurls  = new Image("application/pictures/advBM/bcurls.jpeg");
    private Image[] listOfImages = {hamcurls, latlunge, atomicpushups, abroll, tfly, rows, chestpress, tricepext, bcurls};

    private String[] exerciseList =  new String[10];
    VBox exerciseRoot = new VBox();
    Label advBMLabel = new Label("Muscle Building Workout - Advanced \n");
    Button backToFIPageBtn = new Button("Back to Fitness Intake Page");
    ListView<String> listView = new ListView<String>();

    public AdvancedBuildMuscle()
    {
        exerciseRoot.setAlignment(Pos.CENTER);
        advBMLabel.setFont(Font.font("Courier New", FontWeight.BOLD, 30));
        advBMLabel.styleProperty().set("-fx-padding: 30 50 30 50; -fx-background-color: #A0DEE7; -fx-text-alignment: center;");

        String image = LoginPage.class.getResource("pictures/background.jpeg").toExternalForm();
        exerciseRoot.setStyle("-fx-background-image: url('" + image + "'); " +
                "-fx-background-position: center center; " +
                "-fx-background-repeat: repeat;" + "-fx-background-size: 900px 600px;");

    }

    @Override
    public void listExercises() {

        ObservableList<String> items = FXCollections.observableArrayList (
                "Keep the back nice and straight and a slight bend in the knees. All biceps baby!",
                "The further away your feet are from the straps, the more difficult the exercise becomes. Challenge yourself!",
                "Big pushes using those pecs!",
                "Onto that back, allow those big lats to take over here. Remember, keep your feet nice and grounded!",
                "Unleash that sculpted back!",
                "Engage your core like it's a weapon. Lock it and keep it nice and firm with every rep.",
                "Bring in those legs and work that V. You know you want to.",
                "Now on to the lower body, alternate legs with every rep!",
                "Work those hammies and glutes! This is the last one of the day!");
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
                    if(name.equals("Keep the back nice and straight and a slight bend in the knees. All biceps baby!"))
                        imageView.setImage(listOfImages[8]);
                    else if(name.equals("The further away your feet are from the straps, the more difficult the exercise becomes. Challenge yourself!"))
                        imageView.setImage(listOfImages[7]);
                    else if(name.equals("Big pushes using those pecs!"))
                        imageView.setImage(listOfImages[6]);
                    else if(name.equals("Onto that back, allow those big lats to take over here. Remember, keep your feet nice and grounded!"))
                        imageView.setImage(listOfImages[5]);
                    else if(name.equals("Unleash that sculpted back!"))
                        imageView.setImage(listOfImages[4]);
                    else if(name.equals("Engage your core like it's a weapon. Lock it and keep it nice and firm with every rep."))
                        imageView.setImage(listOfImages[3]);
                    else if(name.equals("Bring in those legs and work that V. You know you want to."))
                        imageView.setImage(listOfImages[2]);
                    else if(name.equals("Now on to the lower body, alternate legs with every rep!"))
                        imageView.setImage(listOfImages[1]);
                    else if(name.equals("Work those hammies and glutes! This is the last one of the day!"))
                        imageView.setImage(listOfImages[0]);
                    setText(name);
                    setGraphic(imageView);
                }
            }
        });

        //generateRandomExercises();
        exerciseRoot.getChildren().clear();
        exerciseRoot.getChildren().addAll(advBMLabel, backToFIPageBtn, listView);

        if(exerciseList.length > 0){
            // Lists Beginner workouts on Exercise Page
            for(String exercise : exerciseList) {
                exerciseRoot.getChildren().add(new Label(exercise));
            }
        }
    }

    public void generateRandomExercises(){
        int max = workouts.length;
        Random randInt = new Random();

        for(int i = 0; i < 10; i++){
            //Generate random int value from 1 to allWorkouts length
            exerciseList[i] = workouts[randInt.nextInt(max)];
        }
    }


}
