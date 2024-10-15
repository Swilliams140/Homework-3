/*
Class Name: Bird
@ author: Stanley Williams
version 1.0
Course: ITEC 2050, Fall 2024
Written: October 14, 2024
 */
public class Bird implements Flight{
    private String type;

    //constructor
    public Bird(String type){
        this.type = type;
    }

    //getter
    public String getType(){
        return type;
    }

    //setter
    public void setType(String type){
        this.type = type;
    }

    //implementation of fly method from Flight Interface
    public void fly(){
        System.out.println("I'm a bird who flaps wings to fly!");
    }

    //toString method
    public String toString(){
        return "Bird [type = " + type + "]";
    }

}
