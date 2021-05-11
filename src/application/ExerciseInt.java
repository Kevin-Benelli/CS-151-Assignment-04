package application;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;


public interface ExerciseInt {

        //loading images
        //public final Image cabinetImage  = new Image("Cab.png");


        VBox exerciseRoot = new VBox();
        Button BackToFIPageBtn = new Button("Back to Fitness Intake Page");
        Label exercisePageHeader = new Label("Your Exercises");
        
        String[] BeginnerBuildMuscleWorkouts = {"50 Jumping Jacks","30 Lunges","30 Squats","50 High Knees","30 Butt Kickers",
        "20 Side Lunges","30 Crunches","10 Leg Lifts","20sec. Sprint","20sec. Calf Raises","15 Push up",
        "15 Glute Bridges","20 V-ups","45sec. Plank","30 Russian Twists","20 Mountain Climbers",
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
        
        String[] IntermediateBuildMuscleWorkouts = {"75 Jumping Jacks","40 Lunges","40 Squats"," 75 High Knees","40 Butt Kickers",
                "25 Side Lunges","40 Crunches","15 Leg Lifts","30sec. Sprint","30sec. Calf Raises","25 Push up",
                "25 Glute Bridges","30 V-ups","1min. Plank","45 Russian Twists","30 Mountain Climbers",
                "40 Flutter Kicks","30 Jump Squats","30 Burpees","30 Box Jumps","30 Leg Raises","30 Tricep Dips",
                "15 Pull-ups","30 Bench Press","25 Bicep Curls","25 Donkey Kicks","25 Clams","25 Fire Hydrants",
                "25 Hip Dips","15 pistol squats","25 Sumo Squats","25 Kettle Bell Swings","25 Dead Lifts","15 Chin-ups"};
        
        String[] AdvancedBuildMuscleWorkouts = {"100 Jumping Jacks","50 Lunges","50 Squats","105 High Knees","50 Butt Kickers",
                "30 Side Lunges","55 Crunches","20 Leg Lifts","40sec. Sprint","45sec. Calf Raises","30 Push up",
                "30 Glute Bridges","35 V-ups","1min 15sec. Plank","50 Russian Twists","40 Mountain Climbers",
                "50 Flutter Kicks","35 Jump Squats","35 Burpees","35 Box Jumps","35 Leg Raises","35 Tricep Dips",
                "25 Pull-ups","40 Bench Press","35 Bicep Curls","30 Donkey Kicks","35 Clams","30 Fire Hydrants",
                "35 Hip Dips","25 pistol squats","35 Sumo Squats","30 Kettle Bell Swings","30 Dead Lifts","25 Chin-ups"};
        
        String[] BeginnerWeightlossWorkouts = {"40 Jumping Jacks","20 Lunges","20 Squats","40 High Knees","20 Butt Kickers",
                "15 Side Lunges","20 Crunches","8 Leg Lifts","15sec. Sprint","15sec. Calf Raises","12 Push up",
                "12 Glute Bridges","15 V-ups","30sec. Plank","20 Russian Twists","15 Mountain Climbers",
                "25 Flutter Kicks","15 Jump Squats","15 Burpees","15 Box Jumps","15 Leg Raises","15 Tricep Dips",
                "8 Pull-ups","15 Bench Press","15 Bicep Curls","15 Donkey Kicks","15 Clams","15 Fire Hydrants",
                "15 Hip Dips","10 pistol squats","15 Sumo Squats","15 Kettle Bell Swings","15 Dead Lifts","10 Chin-ups"};
        
        String[] IntermediateWeightlossWorkouts = {"65 Jumping Jacks","30 Lunges","30 Squats","60 High Knees","30 Butt Kickers",
                "20 Side Lunges","30 Crunches","12 Leg Lifts","25sec. Sprint","25sec. Calf Raises","20 Push up",
                "20 Glute Bridges","20 V-ups","45sec. Plank","30 Russian Twists","25 Mountain Climbers",
                "30 Flutter Kicks","20 Jump Squats","20 Burpees","20 Box Jumps","20 Leg Raises","20 Tricep Dips",
                "12 Pull-ups","20 Bench Press","20 Bicep Curls","20 Donkey Kicks","20 Clams","20 Fire Hydrants",
                "15 Hip Dips","15 pistol squats","20 Sumo Squats","20 Kettle Bell Swings","20 Dead Lifts","15 Chin-ups"};
        
        String[] AdvancedWeightlossWorkouts = {"90 Jumping Jacks","40 Lunges","40 Squats","90 High Knees","40 Butt Kickers",
                "25 Side Lunges","40 Crunches","15 Leg Lifts","35sec. Sprint","35sec. Calf Raises","25 Push up",
                "25 Glute Bridges","25 V-ups","1min. Plank","40 Russian Twists","35 Mountain Climbers",
                "40 Flutter Kicks","25 Jump Squats","25 Burpees","25 Box Jumps","25 Leg Raises","25 Tricep Dips",
                "20 Pull-ups","25 Bench Press","25 Bicep Curls","25 Donkey Kicks","25 Clams","25 Fire Hydrants",
                "25 Hip Dips","20 pistol squats","25 Sumo Squats","25 Kettle Bell Swings","25 Dead Lifts","20 Chin-ups"};

        //String[] begWL = {""}

        //String[] begWorkouts = {"100 Jumping Jacks","40 Lunges","40 Squats","100 High Knees", "40 Butt Kickers", "20 Side Lunges", "10 Leg Lifts", "100 Crunches", "30 second sprint", "10 minute cycling"};
        //String[] intWorkouts = {"100 Jumping Jacks","40 Lunges","40 Squats","100 High Knees", "40 Butt Kickers", "20 Side Lunges", "10 Leg Lifts", "100 Crunches", "30 second sprint", "10 minute cycling"};
        /**
         * List all Fitness Intake field names on Fitness Intake Page
         */
        void listExercises();


        void generateRandomExercises();

}
