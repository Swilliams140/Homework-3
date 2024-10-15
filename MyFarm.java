/*
Class Name: My Farm
@ author: Stanley Williams
version 1.0
Course: ITEC 2050, Fall 2024
Written: October 14, 2024
 */
import java.util.ArrayList;
public class MyFarm {
    public static void main(String[] args) {

        // creating the objects
        Duck d1 = new Duck("Louie Duck","Male",3.2,12,"Quack Quack");
        Duck d2 = new Duck("Flappette","Female",4.1,15,"Quacky Quacky Quack");
        Cow c1 = new Cow("Charlie","Male",1600.0,4,"Moooooooooooo");
        Chicken ch1 = new Chicken("Flappy","Male",2.8,2,"Cock-a-doodle-doo");
        Chicken ch2 = new Chicken("Molly","Female",2.9,3,"Cluck-CLuck");

        //Array List creation
        ArrayList<FarmAnimal> farm = new ArrayList();
        farm.add(d1);
        farm.add(d2);
        farm.add(c1);
        farm.add(ch1);
        farm.add(ch2);

        // for loop
        for (FarmAnimal farmAnimal : farm) {
            System.out.println(farmAnimal);
        }

        //print the schedules
        d1.feedLoadingSchedule();
        d2.feedLoadingSchedule();
        c1.feedLoadingSchedule();
        ch1.feedLoadingSchedule();
        ch2.feedLoadingSchedule();


    }
}