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

public class AdvancedWeightLoss implements ExerciseInt{

    //workout images
    private final Image susstraprows  = new Image("application/pictures/advWL/susstraprows.jpeg");
    private final Image singledeadlifts  = new Image("application/pictures/advWL/singlelegdeadlifts.jpeg");
    private final Image dbdeadlifts  = new Image("application/pictures/advWL/dbdeadlifts.jpeg");
    private final Image smithsquats = new Image("application/pictures/advWL/smithsquats.jpeg");
    private final Image lowcablebackrows  = new Image("application/pictures/advWL/lowcablebackrows.jpeg");
    private final Image sumodbsquats  = new Image("application/pictures/advWL/sumodbsquats.jpeg");
    private final Image cablehammerbicepcurls  = new Image("application/pictures/advWL/cablehammerbicepcurls.jpeg");
    private final Image cablesquatrows  = new Image("application/pictures/advWL/cablesquatrows.jpeg");
    private final Image lungewithbicephammer  = new Image("application/pictures/advWL/lungewithbicephammer.jpeg");
    private Image[] listOfImages = {susstraprows, singledeadlifts, dbdeadlifts, smithsquats, lowcablebackrows, sumodbsquats, cablehammerbicepcurls, cablesquatrows, lungewithbicephammer};

    private String[] exerciseList =  new String[10];
    String[] allWorkouts = {"Exercise10","Exercise11","Exercise12","Exercise13","Exercise14","Exercise15","Exercise16","Exercise17","Exercise18","Exercise19","Exercise20","Exercise21","Exercise22","Exercise23","Exercise24","Exercise25","Exercise26","Exercise27","Exercise28","Exercise29","Exercise30","Exercise31","Exercise32","Exercise33","Exercise34","Exercise35","Exercise36","Exercise37","Exercise38","Exercise39","Exercise40","Exercise41","Exercise42","Exercise43","Exercise44","Exercise45","Exercise46","Exercise47","Exercise48","Exercise49","Exercise50","Exercise51","Exercise52","Exercise53","Exercise54","Exercise55","Exercise56","Exercise57","Exercise58","Exercise59","Exercise60","Exercise61","Exercise62","Exercise63","Exercise64","Exercise65","Exercise66","Exercise67","Exercise68","Exercise69","Exercise70","Exercise71","Exercise72","Exercise73","Exercise74","Exercise75","Exercise76","Exercise77","Exercise78","Exercise79","Exercise80","Exercise81","Exercise82","Exercise83","Exercise84","Exercise85","Exercise86","Exercise87","Exercise88","Exercise89","Exercise90","Exercise91","Exercise92","Exercise93","Exercise94","Exercise95","Exercise96","Exercise97","Exercise98","Exercise99","Exercise100"};
    VBox exerciseRoot = new VBox();
    Label advWLLabel = new Label("Weight Loss Workout - Advanced \n");
    Button backToFIPageBtn = new Button("Back to Fitness Intake Page");
    ListView<String> listView = new ListView<String>();

    public AdvancedWeightLoss()
    {
        exerciseRoot.setAlignment(Pos.CENTER);
        advWLLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 30));
        advWLLabel.styleProperty().set("-fx-padding: 30 50 30 50; -fx-background-color: #A0DEE7; -fx-text-alignment: center;");

        String image = LoginPage.class.getResource("pictures/background.jpeg").toExternalForm();
        exerciseRoot.setStyle("-fx-background-image: url('" + image + "'); " +
                "-fx-background-position: center center; " +
                "-fx-background-repeat: repeat-y;" + "-fx-background-size: 900px 600px;");

    }

    @Override
    public void listExercises() {

        ObservableList<String> items = FXCollections.observableArrayList (
                "Let's start out today with some very simple rows.",
                "Use a lighter weight & focus on lowering and raising your body at a slow and controlled speed. 8 per leg per set.",
                "P.O. Use set one as a warm-up set, and then begin increasing the weight to target a failure at 12 reps!",
                "P.O. Use set one as a warm-up set, and then begin increasing the weight to target a failure at 12 reps!",
                "Increase the weight to target a failure at 15 reps!",
                "Stand on 2 platforms if possible and lower that weight between them as you squat!",
                "Increase the weight by a pound here!" );
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
                    if(name.equals("Let's start out today with some very simple rows."))
                        imageView.setImage(listOfImages[0]);
                    else if(name.equals("Use a lighter weight & focus on lowering and raising your body at a slow and controlled speed. 8 per leg per set."))
                        imageView.setImage(listOfImages[1]);
                    else if(name.equals("P.O. Use set one as a warm-up set, and then begin increasing the weight to target a failure at 12 reps!"))
                        imageView.setImage(listOfImages[2]);
                    else if(name.equals("P.O. Use set one as a warm-up set, and then begin increasing the weight to target a failure at 12 reps!"))
                        imageView.setImage(listOfImages[3]);
                    else if(name.equals("Increase the weight to target a failure at 15 reps!"))
                        imageView.setImage(listOfImages[4]);
                    else if(name.equals("Stand on 2 platforms if possible and lower that weight between them as you squat!"))
                        imageView.setImage(listOfImages[5]);
                    else if(name.equals("Increase the weight by a pound here!"))
                        imageView.setImage(listOfImages[6]);
                    setText(name);
                    setGraphic(imageView);
                }
            }
        });

        //generateRandomExercises();
        exerciseRoot.getChildren().clear();
        exerciseRoot.getChildren().addAll(advWLLabel, backToFIPageBtn, listView);

        if(exerciseList.length > 0){
            // Lists Advanced workouts on Exercise Page
            for(String exercise : exerciseList) {
                exerciseRoot.getChildren().add(new Label(exercise));
            }
        }
    }

    public void generateRandomExercises(){
        int max = allWorkouts.length;
        Random randInt = new Random();
        int seed = randInt.nextInt(max);

        for(int i = 0; i < 10; i++){
            //System.out.println(allWorkouts[randInt.nextInt(seed)]);
            //Generate random int value from 1 to allWorkouts length
            exerciseList[i] = allWorkouts[randInt.nextInt(seed)];
        }
    }
}
