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

public class BeginnerBuildMuscle implements ExerciseInt{

    //workout images
    private final Image toetaps  = new Image("application/pictures/begBM/toetaps.jpeg");
    private final Image kneepush_ups  = new Image("application/pictures/begBM/kneepush_ups.jpeg");
    private final Image inclinepush_ups  = new Image("application/pictures/begBM/inclinepush_ups.jpeg");
    private final Image swissballchestfly = new Image("application/pictures/begBM/swissballchestfly.jpeg");
    private final Image mballwallthrow  = new Image("application/pictures/begBM/mballwallthrow.jpeg");
    private final Image assisttricepdips  = new Image("application/pictures/begBM/assisttricepdips.jpeg");
    private final Image seatedtriceppress  = new Image("application/pictures/begBM/seatedtriceppress.jpeg");
    private final Image crunches  = new Image("application/pictures/begBM/crunches.jpeg");
    private final Image leglifts  = new Image("application/pictures/begBM/leglifts.jpeg");
    private Image[] listOfImages = {toetaps, kneepush_ups, inclinepush_ups, swissballchestfly, mballwallthrow, assisttricepdips, seatedtriceppress, crunches, leglifts};


    private String[] exerciseList = new String[10];
    VBox exerciseRoot = new VBox();
    Label begBMLabel = new Label("Muscle Building Workout - Beginner \n");
    Button backToFIPageBtn = new Button("Back to Fitness Intake Page");
    ListView<String> listView = new ListView<String>();

    public BeginnerBuildMuscle()
    {
        exerciseRoot.setAlignment(Pos.CENTER);
        begBMLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 30));
        begBMLabel.styleProperty().set("-fx-padding: 30 50 30 50; -fx-background-color: #A0DEE7; -fx-text-alignment: center;");

        String image = LoginPage.class.getResource("pictures/background.jpeg").toExternalForm();
        exerciseRoot.setStyle("-fx-background-image: url('" + image + "'); " +
                "-fx-background-position: center center; " +
                "-fx-background-repeat: repeat;" + "-fx-background-size: 900px 600px;");

    }

    @Override
    public void listExercises() {

        ObservableList<String> items = FXCollections.observableArrayList (
                "Can you go again? My money is on yes!",
                "Warming up for the real thing!",
                "Our real push up challenges have begun! Try to lower your chest as close to the bench as possible.",
                "No heavy weights here, the goal is to stabilize yourself throughout the exercise; building the muscles necessary.",
                "Can you increase the weight, just a little? Say, 12.5lbs? Go on!",
                "Find a weight that supports you only just enough to hit 12 reps",
                "Take great care when placing the dumbbell behind your head. Use a light weight and do not train to failure.",
                "No more of those heel touches, it's time to get fancy. Make sure your shoulders leave the floor.",
                "Do not let your feet rest on the floor until all the reps are complete.");
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
                    if(name.equals("Can you go again? My money is on yes!"))
                        imageView.setImage(listOfImages[0]);
                    else if(name.equals("Warming up for the real thing!"))
                        imageView.setImage(listOfImages[1]);
                    else if(name.equals("Our real push up challenges have begun! Try to lower your chest as close to the bench as possible."))
                        imageView.setImage(listOfImages[2]);
                    else if(name.equals("No heavy weights here, the goal is to stabilize yourself throughout the exercise; building the muscles necessary."))
                        imageView.setImage(listOfImages[3]);
                    else if(name.equals("Can you increase the weight, just a little? Say, 12.5lbs? Go on!"))
                        imageView.setImage(listOfImages[4]);
                    else if(name.equals("Find a weight that supports you only just enough to hit 12 reps"))
                        imageView.setImage(listOfImages[5]);
                    else if(name.equals("Take great care when placing the dumbbell behind your head. Use a light weight and do not train to failure."))
                        imageView.setImage(listOfImages[6]);
                    else if(name.equals("No more of those heel touches, it's time to get fancy. Make sure your shoulders leave the floor."))
                        imageView.setImage(listOfImages[7]);
                    else if(name.equals("Do not let your feet rest on the floor until all the reps are complete."))
                        imageView.setImage(listOfImages[8]);
                    setText(name);
                    setGraphic(imageView);
                }
            }
        });


        //generateRandomExercises();

        exerciseRoot.getChildren().clear();
        exerciseRoot.getChildren().addAll(begBMLabel, backToFIPageBtn, listView);
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
            //System.out.println(workouts[randInt.nextInt(seed)]);
            //Generate random int value from 1 to allWorkouts length
            exerciseList[i] = workouts[randInt.nextInt(seed)];
        }
    }
}
