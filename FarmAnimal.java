/*
Class Name: Farm Animal
@ author: Stanley Williams
version 1.0
Course: ITEC 2050, Fall 2024
Written: October 14, 2024
 */
public abstract class FarmAnimal {
    private String name;
    private String gender;
    private double weight;
    private int age;


    public abstract void feedLoadingSchedule();

    //constructors
    public FarmAnimal(String name, String gender, double weight , int age){
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    //getters
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public double getWeight(){
        return weight;
    }
    public int getAge(){
        return age;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setAge(int age){
        this.age = age;
    }

    //@override
    public String toString(){
        return name+" "+gender+" "+weight+" "+age+" ";
    }


}