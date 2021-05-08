package application;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;


public interface ExerciseInt {
        VBox exerciseRoot = new VBox();
        Button BackToFIPageBtn = new Button("Back to Fitness Intake Page");
        Label exercisePageHeader = new Label("Your Exercises");
        String[] allWorkouts = {"100 Jumping Jacks","40 Lunges","40 Squats","100 High Knees","40 Butt Kickers",
                "20 Side Lunges","100 Crunches","10 Leg Lifts","30sec. Sprint","30sec. Calf Raises","Exercise20",
                "20 Glute Bridges","30 V-ups","1min. Plank","50 Russian Twists","50 Crunches","20 Mountain Climbers",
                "30 Flutter Kicks","20 Jump Squats","20 Burpees","20 Box Jumps","20 Leg Raises","20 Tricep Dips",
                "10 Pull-ups","20 Bench Press","20 Bicep Curls","20 Donkey Kicks","20 Clams","20 Fire Hydrants",
                "20 Hip Dips","10 pistol squats","20 Sumo Squats","20 Kettle Bell Swings","20 Dead Lifts","10 Chin-ups",
                "Exercise45","Exercise46","Exercise47","Exercise48","Exercise49","Exercise50",
                "Exercise51","Exercise52","Exercise53","Exercise54","Exercise55","Exercise56",
                "Exercise57","Exercise58","Exercise59","Exercise60","Exercise61","Exercise62",
                "Exercise63","Exercise64","Exercise65","Exercise66","Exercise67","Exercise68",
                "Exercise69","Exercise70","Exercise71","Exercise72","Exercise73","Exercise74",
                "Exercise75","Exercise76","Exercise77","Exercise78","Exercise79","Exercise80",
                "Exercise81","Exercise82","Exercise83","Exercise84","Exercise85","Exercise86",
                "Exercise87","Exercise88","Exercise89","Exercise90","Exercise91","Exercise92",
                "Exercise93","Exercise94","Exercise95","Exercise96","Exercise97","Exercise98",
                "Exercise99","Exercise100"};

        //String[] begWorkouts = {"100 Jumping Jacks","40 Lunges","40 Squats","100 High Knees", "40 Butt Kickers", "20 Side Lunges", "10 Leg Lifts", "100 Crunches", "30 second sprint", "10 minute cycling"};
        //String[] intWorkouts = {"100 Jumping Jacks","40 Lunges","40 Squats","100 High Knees", "40 Butt Kickers", "20 Side Lunges", "10 Leg Lifts", "100 Crunches", "30 second sprint", "10 minute cycling"};
        /**
         * List all Fitness Intake field names on Fitness Intake Page
         */
        void listExercises();


        void generateRandomExercises();

}