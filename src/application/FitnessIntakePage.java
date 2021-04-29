package application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class FitnessIntakePage {


    private String[] fitnessIntake = new String[]{"Name: ", "Age: ", "Fitness level: ", "Goals: "};
    protected TextField nameField = new TextField();
    protected TextField ageField = new TextField();
    protected TextField fitnessLevelField = new TextField();
    protected TextField goalsField = new TextField();

    protected Button fitnessIntakeToLoginBtn = new Button("Back to Login Page \n");
    protected Label fitnessIntakeHeader = new Label("Fitness Intake Page\n");
    protected Label fitnessIntakeDetails = new Label("Lets start by getting your personalized metrics\n");
    protected  VBox fitnessIntakeRoot = new VBox();
    private int fitnessLevel = 0;


    /**
     * Initializing Constructor sets Fitness Intake page header style
     */
    public FitnessIntakePage(){
        //fitnessIntakeHeader.setFont(new Font(18));
        fitnessIntakeHeader.setTextAlignment(TextAlignment.LEFT);
        fitnessIntakeHeader.setStyle("-fx-background-color: #88BDC4; ");
        fitnessIntakeHeader.setFont(Font.font("sans serif", FontWeight.BOLD, 40));
        fitnessIntakeDetails.setFont(Font.font("sans serif", 20));
        nameField.setPromptText("Name");
        ageField.setPromptText("Age");
        fitnessLevelField.setPromptText("Fitness level (beginner, intermediate, advanced)");
        goalsField.setPromptText("Fitness goals");
        nameField.setStyle("-fx-font: normal bold 20px 'serif' ");
        ageField.setStyle("-fx-font: normal bold 20px 'serif' ");
        fitnessLevelField.setStyle("-fx-font: normal bold 20px 'serif' ");
        goalsField.setStyle("-fx-font: normal bold 20px 'serif' ");
        fitnessIntakeToLoginBtn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        //fitnessIntakeHeader.setStyle("-fx-font: normal bold 20px 'serif' ");
    }

    /**
     * List all Fitness Intake field names on Fitness Intake Page
     */
    public void listFieldNames(){
        fitnessIntakeRoot.getChildren().addAll(nameField, ageField, fitnessLevelField, goalsField);
    }

    /**
     * Fitness Level ComboBox
     */
    public void fitLevel(){
        //fitnessIntakeRoot.getChildren().add(new Label("Select Fitness Level:"));
        //fitnessIntakeRoot.getChildren().add(comboBox);
        ComboBox<Level> comboBox = new ComboBox<Level>();
        ObservableList<Level> list = LevelList.getLevelList();

        comboBox.setItems(list);
        comboBox.getSelectionModel().select(1);

        //fitnessIntakeRoot.setPadding(new Insets(5));
        //fitnessIntakeRoot.setHgap(5);

        fitnessIntakeRoot.getChildren().add(new Label("Select Fitness Level:"));
        fitnessIntakeRoot.getChildren().add(comboBox);

    }



}