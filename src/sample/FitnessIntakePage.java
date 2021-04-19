package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class FitnessIntakePage {

    private String[] fitnessIntake = new String[]{"Name: ", "Age: ", "Fitness level: ", "Goals: "};
    protected Button fitnessIntakeToLoginBtn = new Button("Back to Login Page");
    protected Text fitnessIntakeHeader = new Text("Fitness Intake Page\n Lets start by getting your personalized metrics");
    protected  VBox fitnessIntakeRoot = new VBox();
    private int fitnessLevel = 0;

    /**
     * Initializing Constructor sets Fitness Intake page header style
     */
    public FitnessIntakePage(){
        fitnessIntakeHeader.setFont(new Font(18));
        fitnessIntakeHeader.setTextAlignment(TextAlignment.LEFT);
    }

    /**
     * List all Fitness Intake field names on Fitness Intake Page
     */
    public void listFieldNames(){

        for(String exercise : fitnessIntake){
            TextField exerciseTextField = new TextField();
            exerciseTextField.setPromptText(exercise);
            fitnessIntakeRoot.getChildren().add(exerciseTextField);
        }
    }


}
