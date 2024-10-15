/*
Class Name: Cow
@ author: Stanley Williams
version 1.0
Course: ITEC 2050, Fall 2024
Written: October 14, 2024
 */
public class Cow extends FarmAnimal{

    private String sound;

    //Constructor
    public Cow(String name, String gender, double weight, int age, String sound){
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
        System.out.println("Feed Loading Schedule");
    }

    //override toString Method in Superclass
    public String toString(){
        return "Cow "+sound+"{Name:"+super.getName()+", Gender:"+super.getGender()+", Weight:"+super.getWeight()+", Age:"+super.getAge()+"}";
    }

}
