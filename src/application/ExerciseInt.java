package application;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;


public interface ExerciseInt {
        VBox exerciseRoot = new VBox();
        Button BackToFIPageBtn = new Button("Back to Fitness Intake Page");
        Label exercisePageHeader = new Label("Your Exercises");
        String[] allWorkouts = new String[]{"", ""};

        /**
         * List all Fitness Intake field names on Fitness Intake Page
         */
        void listExercises();
    }

