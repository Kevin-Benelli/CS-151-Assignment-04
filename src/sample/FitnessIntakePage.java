package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BackgroundFill;
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

    protected Button fitnessIntakeToLoginBtn = new Button("Back to Login Page");
    protected Text fitnessIntakeHeader = new Text("Fitness Intake Page");
    protected Text fitnessIntakeInfo = new Text("Lets start by getting your personalized metrics");
    protected  VBox fitnessIntakeRoot = new VBox();
    private int fitnessLevel = 0;

    /**
     * Initializing Constructor sets Fitness Intake page header style
     */
    public FitnessIntakePage(){
        fitnessIntakeHeader.setFont(new Font(18));
        fitnessIntakeHeader.setFont(Font.font("Verdana", FontWeight.BOLD, 25));
        fitnessIntakeHeader.styleProperty().set("-fx-padding: 30; -fx-background-color: #88BDC4;");
        fitnessIntakeHeader.setTextAlignment(TextAlignment.LEFT);
        fitnessIntakeInfo.setFont(new Font(20));
        nameField.setPromptText("Name");
        ageField.setPromptText("Age");
        fitnessLevelField.setPromptText("Fitness level (beginner, intermediate, advanced)");
        goalsField.setPromptText("Fitness goals");
    }

    /**
     * List all Fitness Intake field names on Fitness Intake Page
     */
    public void listFieldNames(){
        fitnessIntakeRoot.getChildren().addAll(nameField, ageField, fitnessLevelField, goalsField);
    }


}
