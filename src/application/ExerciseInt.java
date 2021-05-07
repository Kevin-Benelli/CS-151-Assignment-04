package application;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;


public interface ExerciseInt {
        VBox exerciseRoot = new VBox();
        Button BackToFIPageBtn = new Button("Back to Fitness Intake Page");
        Label exercisePageHeader = new Label("Your Exercises");
        String[] allWorkouts = {"Exercise10","Exercise11","Exercise12","Exercise13","Exercise14","Exercise15","Exercise16","Exercise17","Exercise18","Exercise19","Exercise20","Exercise21","Exercise22","Exercise23","Exercise24","Exercise25","Exercise26","Exercise27","Exercise28","Exercise29","Exercise30","Exercise31","Exercise32","Exercise33","Exercise34","Exercise35","Exercise36","Exercise37","Exercise38","Exercise39","Exercise40","Exercise41","Exercise42","Exercise43","Exercise44","Exercise45","Exercise46","Exercise47","Exercise48","Exercise49","Exercise50","Exercise51","Exercise52","Exercise53","Exercise54","Exercise55","Exercise56","Exercise57","Exercise58","Exercise59","Exercise60","Exercise61","Exercise62","Exercise63","Exercise64","Exercise65","Exercise66","Exercise67","Exercise68","Exercise69","Exercise70","Exercise71","Exercise72","Exercise73","Exercise74","Exercise75","Exercise76","Exercise77","Exercise78","Exercise79","Exercise80","Exercise81","Exercise82","Exercise83","Exercise84","Exercise85","Exercise86","Exercise87","Exercise88","Exercise89","Exercise90","Exercise91","Exercise92","Exercise93","Exercise94","Exercise95","Exercise96","Exercise97","Exercise98","Exercise99","Exercise100"};

        /**
         * List all Fitness Intake field names on Fitness Intake Page
         */
        void listExercises();


        void generateRandomExercises();

    }

