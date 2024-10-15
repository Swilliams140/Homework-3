/*
Class Name: Airplane
@ author: Stanley Williams
version 1.0
Course: ITEC 2050, Fall 2024
Written: October 14, 2024
 */
public class Airplane implements Movement{
    private String model;
    private int year;

    //constructor
    public Airplane(String model, int year){
        this.model = model;
        this.year = year;
    }

    //getter
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

    //setters
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }

    //Implementation of fly method from Flight interface
    public void fly(){
        System.out.println("I'a a airplane that relies on a engine to fly!");
    }

    //toString Method
    public String toString(){
        return "Airplane [model=" + model + ", year=" + year + "]" ;
    }

}
