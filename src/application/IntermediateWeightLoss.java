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
    private final Image legPress  = new Image("application/pictures/legpress.jpeg");
    private final Image ddeadlifts  = new Image("application/pictures/ddeadlifts.jpeg");
    private final Image lungeCurls  = new Image("application/pictures/lungeCurls.jpeg");
    private final Image widelatPulls = new Image("application/pictures/widelatPulls.jpeg");
    private final Image kbSquatSwing  = new Image("application/pictures/kbSquatSwing.jpeg");
    private final Image downWoodChops  = new Image("application/pictures/downWoodChops.jpeg");
    private final Image latShoulder  = new Image("application/pictures/latShoulder.jpeg");
    private final Image declineBenchPress  = new Image("application/pictures/declineBenchPress.jpeg");
    private Image[] listOfImages = {legPress, ddeadlifts, lungeCurls, widelatPulls, kbSquatSwing, downWoodChops, latShoulder, declineBenchPress};


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
                "-fx-background-repeat: stretch;" + "-fx-background-size: 900px 600px;");


    }

    @Override
    public void listExercises() {

        ObservableList<String> items = FXCollections.observableArrayList (
                "legPress", "ddeadlifts", "lungeCurls", "widelatPulls", "kbSquatSwing", "downWoodChops", "latShoulder", "declineBenchPress");
        listView.setItems(items);
        listView.setPrefWidth(900);
        listView.setPrefHeight(600);

        listView.setCellFactory(param -> new ListCell<String>() {
            private ImageView imageView = new ImageView();
            @Override
            public void updateItem(String name, boolean empty) {
                super.updateItem(name, empty);
                if (empty) {
                    setText(null);
                    setGraphic(null);
                } else {
                    if(name.equals("legPress"))
                        imageView.setImage(listOfImages[0]);
                    else if(name.equals("ddeadlifts"))
                        imageView.setImage(listOfImages[1]);
                    else if(name.equals("lungeCurls"))
                        imageView.setImage(listOfImages[2]);
                    else if(name.equals("widelatPulls"))
                        imageView.setImage(listOfImages[3]);
                    else if(name.equals("kbSquatSwing"))
                        imageView.setImage(listOfImages[4]);
                    else if(name.equals("downWoodChops"))
                        imageView.setImage(listOfImages[5]);
                    else if(name.equals("latShoulder"))
                        imageView.setImage(listOfImages[6]);
                    else if(name.equals("declineBenchPress"))
                        imageView.setImage(listOfImages[7]);
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
        int max = IntermediateBuildMuscleWorkouts.length;
        Random randInt = new Random();
        int seed;
        do {
        	seed = randInt.nextInt(max);
        } while(seed == 0);
        if (randInt.nextInt(max)>=0) {
        for(int i = 0; i < 10; i++){
            	//System.out.println(IntermediateBuildMuscleWorkouts[randInt.nextInt(seed)]);
            	//Generate random int value from 1 to allWorkouts length
            	exerciseList[i] = IntermediateBuildMuscleWorkouts[randInt.nextInt(seed)];
        	}
        }
    }
}
