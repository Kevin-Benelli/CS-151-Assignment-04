package application;

import javafx.beans.binding.Bindings;
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
import javafx.scene.text.TextAlignment;

import java.util.Random;

public class BeginnerWeightLoss implements ExerciseInt{

    private static final double LIST_CELL_HEIGHT = 6;
    //workout images
    private final Image pushups  = new Image("application/pictures/begWL/push-ups.jpeg");
    private final Image lungefrontkicks  = new Image("application/pictures/begWL/lungefrontkicks.jpeg");
    private final Image doublecrunches  = new Image("application/pictures/begWL/doublecrunches.jpeg");
    private final Image airsquats = new Image("application/pictures/begWL/airsquats.jpeg");
    private final Image inclinepushups  = new Image("application/pictures/begWL/inclinepush-ups.jpeg");
    private final Image jumpsquats  = new Image("application/pictures/begWL/jumpsquats.jpeg");
    private Image[] listOfImages = {pushups, lungefrontkicks, doublecrunches, airsquats, inclinepushups, jumpsquats };

    private String[] exerciseList = new String[10];
    protected Label begWLheader = new Label("Weight Loss Workout - Beginner \n");
    VBox exerciseRoot = new VBox();
    Button backToFIPageBtn = new Button("Back to Fitness Intake Page");
    ListView<String> listView = new ListView<String>();
//    String[] allWorkouts = {"Exercise10","Exercise11","Exercise12","Exercise13","Exercise14","Exercise15","Exercise16","Exercise17","Exercise18","Exercise19","Exercise20","Exercise21","Exercise22","Exercise23","Exercise24","Exercise25","Exercise26","Exercise27","Exercise28","Exercise29","Exercise30","Exercise31","Exercise32","Exercise33","Exercise34","Exercise35","Exercise36","Exercise37","Exercise38","Exercise39","Exercise40","Exercise41","Exercise42","Exercise43","Exercise44","Exercise45","Exercise46","Exercise47","Exercise48","Exercise49","Exercise50","Exercise51","Exercise52","Exercise53","Exercise54","Exercise55","Exercise56","Exercise57","Exercise58","Exercise59","Exercise60","Exercise61","Exercise62","Exercise63","Exercise64","Exercise65","Exercise66","Exercise67","Exercise68","Exercise69","Exercise70","Exercise71","Exercise72","Exercise73","Exercise74","Exercise75","Exercise76","Exercise77","Exercise78","Exercise79","Exercise80","Exercise81","Exercise82","Exercise83","Exercise84","Exercise85","Exercise86","Exercise87","Exercise88","Exercise89","Exercise90","Exercise91","Exercise92","Exercise93","Exercise94","Exercise95","Exercise96","Exercise97","Exercise98","Exercise99","Exercise100"};


    /**
     * Initializing Constructor sets Beginner WL page header style
     */
    public BeginnerWeightLoss(){
        setStyles();
    }

    private void setStyles() {
        exerciseRoot.setAlignment(Pos.CENTER);
        begWLheader.setTextAlignment(TextAlignment.LEFT);
        begWLheader.setStyle("-fx-background-color: #88BDC4; ");
        begWLheader.setFont(Font.font("sans serif", FontWeight.BOLD, 40));
        //fitnessIntakeDetails.setFont(Font.font("sans serif", 20));
//        nameField.setStyle("-fx-font: normal bold 20px 'serif' ");
//        ageField.setStyle("-fx-font: normal bold 20px 'serif' ");
        begWLheader.setFont(Font.font("Courier New", FontWeight.BOLD, 30));
        begWLheader.styleProperty().set("-fx-padding: 30 50 30 50; -fx-background-color: #A0DEE7; -fx-text-alignment: center;");

        String image = LoginPage.class.getResource("pictures/background.jpeg").toExternalForm();
        exerciseRoot.setStyle("-fx-background-image: url('" + image + "'); " +
                "-fx-background-position: center center; " +
                "-fx-background-repeat: repeat;" + "-fx-background-size: 900px 600px;");


        //backToFIPageBtn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");


    }

    @Override
    public void listExercises() {

        ObservableList<String> items = FXCollections.observableArrayList (
                "Get these done! Use your knees if necessary!",
                "That's 15 per leg, easy right?",
                "Complete these in as few sets possible",
                "Get nice and low, stretch with every rep!",
                "These will burn, but in a nice way :D ",
                "Aim to get these done in 2 sets at most!" );
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
                    if(name.equals("Get these done! Use your knees if necessary!"))
                        imageView.setImage(listOfImages[0]);
                    else if(name.equals("That's 15 per leg, easy right?"))
                        imageView.setImage(listOfImages[1]);
                    else if(name.equals("Complete these in as few sets possible"))
                        imageView.setImage(listOfImages[2]);
                    else if(name.equals("Get nice and low, stretch with every rep!"))
                        imageView.setImage(listOfImages[3]);
                    else if(name.equals("These will burn, but in a nice way :D "))
                        imageView.setImage(listOfImages[4]);
                    else if(name.equals("Aim to get these done in 2 sets at most!"))
                        imageView.setImage(listOfImages[5]);
                    setText(name);
                    setGraphic(imageView);
                }
            }
        });

        //generateRandomExercises();
        exerciseRoot.getChildren().clear();
        exerciseRoot.getChildren().addAll(begWLheader, backToFIPageBtn, listView);

        if(exerciseList.length > 0){
            // Lists Advanced workouts on Exercise Page
            for(String exercise : exerciseList) {
                exerciseRoot.getChildren().add(new Label(exercise));


            }
        }

        //styles
        exerciseRoot.setAlignment(Pos.CENTER);
    }

    public void generateRandomExercises(){
        int max = workouts.length;
        Random randInt = new Random();
        int seed = randInt.nextInt(max);

        for(int i = 0; i < 10; i++){
            //System.out.println(workouts[randInt.nextInt(seed)]);
            //Generate random int value from 1 to allWorkouts length
            exerciseList[i] = workouts[randInt.nextInt(seed)];
        }
    }
}
