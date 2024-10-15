/*
Class Name: Chicken
@ author: Stanley Williams
version 1.0
Course: ITEC 2050, Fall 2024
Written: October 14, 2024
 */


public class Chicken extends FarmAnimal {
    private String sound;

    //constructor
    public Chicken(String name, String gender, double weight, int age, String sound){
        super(name,gender,weight,age);
        this.sound = sound;

    }

    //getters
    public String getSound(){
        return sound;
    }

    //setters
    public void setSound(String sound){
        this.sound = sound;
    }


    public void feedLoadingSchedule(){
        System.out.println(super.getName()+": 8am-12pm-6pm");
    }

    //override toString Method in Superclass
    public String toString(){
        return "Chicken "+sound+"{Name:"+super.getName()+", Gender:"+super.getGender()+", Weight:"+super.getWeight()+", Age:"+super.getAge()+"}";
    }
}
