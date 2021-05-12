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

public class IntermediateWeightLoss implements ExerciseInt{

    //workout images
    private final Image dbchops  = new Image("application/pictures/intWL/dbchops.jpeg");
    private final Image dblifts  = new Image("application/pictures/intWL/dblifts.jpeg");
    private final Image declinebenchpress  = new Image("application/pictures/intWL/declinebenchpress.jpeg");
    private final Image kbsquatswing = new Image("application/pictures/intWL/kbsquatswing.jpeg");
    private final Image latdumbbellraises  = new Image("application/pictures/intWL/latdumbbellraises.jpeg");
    private final Image latpulldowns  = new Image("application/pictures/intWL/latpulldowns.jpeg");
    private final Image legpress  = new Image("application/pictures/intWL/legpress.jpeg");
    private final Image lungehammercurls  = new Image("application/pictures/intWL/lungehammercurls.jpeg");
    private final Image medicineballwc  = new Image("application/pictures/intWL/medicineballwc.jpeg");
    private Image[] listOfImages = {dbchops, dblifts, declinebenchpress, kbsquatswing, latdumbbellraises, latpulldowns, legpress, lungehammercurls, medicineballwc};


    private String[] exerciseList = new String[10];
    VBox exerciseRoot = new VBox();
    Label intWLLabel = new Label("Weight Loss Workout - Intermediate \n");
    Button backToFIPageBtn = new Button("Back to Fitness Intake Page");
    ListView<String> listView = new ListView<String>();

    public IntermediateWeightLoss()
    {
        exerciseRoot.setAlignment(Pos.CENTER);
        intWLLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 30));
        intWLLabel.styleProperty().set("-fx-padding: 30 50 30 50; -fx-background-color: #A0DEE7; -fx-text-alignment: center;");

        String image = LoginPage.class.getResource("pictures/background.jpeg").toExternalForm();
        exerciseRoot.setStyle("-fx-background-image: url('" + image + "'); " +
                "-fx-background-position: center center; " +
                "-fx-background-repeat: repeat-y;" + "-fx-background-size: 900px 600px;");


    }

    @Override
    public void listExercises() {

        ObservableList<String> items = FXCollections.observableArrayList (
                "Imagine you're chopping down a tree, but you're not because you're green!",
                "Focus on your form with every rep. Bend your knees not your back and always keep your chin up!",
                "Push-up power building. Feel a nice burn at the end of every set.",
                "Swing that kettlebell! Watch your movement in the mirror and keep the motion continuous.",
                "Having a slight bend at the knee prevents tension in the back. The bend is your friend.",
                "We're working on getting you to pull-up power! Don't move too fast, control the bar down to your chest.",
                "Take your time here to build up your weight, increase with every set if you can!",
                "2.5 lbs per hand, 25 reps per leg. How quickly can you complete this exercise?",
                "You're still chopping down that tree! Just with a ball now!");
        listView.setItems(items);
        listView.setPrefWidth(800);
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
                    if(name.equals("Imagine you're chopping down a tree, but you're not because you're green!"))
                        imageView.setImage(listOfImages[0]);
                    else if(name.equals("Focus on your form with every rep. Bend your knees not your back and always keep your chin up!"))
                        imageView.setImage(listOfImages[1]);
                    else if(name.equals("Push-up power building. Feel a nice burn at the end of every set."))
                        imageView.setImage(listOfImages[2]);
                    else if(name.equals("Swing that kettlebell! Watch your movement in the mirror and keep the motion continuous."))
                        imageView.setImage(listOfImages[3]);
                    else if(name.equals("Having a slight bend at the knee prevents tension in the back. The bend is your friend."))
                        imageView.setImage(listOfImages[4]);
                    else if(name.equals("We're working on getting you to pull-up power! Don't move too fast, control the bar down to your chest."))
                        imageView.setImage(listOfImages[5]);
                    else if(name.equals("Take your time here to build up your weight, increase with every set if you can!"))
                        imageView.setImage(listOfImages[6]);
                    else if(name.equals("2.5 lbs per hand, 25 reps per leg. How quickly can you complete this exercise?"))
                        imageView.setImage(listOfImages[7]);
                    else if(name.equals("You're still chopping down that tree! Just with a ball now!"))
                        imageView.setImage(listOfImages[8]);
                    setText(name);
                    setGraphic(imageView);
                }
            }
        });

        //generateRandomExercises();

        exerciseRoot.getChildren().clear();
        exerciseRoot.getChildren().addAll(intWLLabel, backToFIPageBtn, listView);
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
