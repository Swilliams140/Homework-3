/*
Interface Name: Movement
@ author: Stanley Williams
version 1.0
Course: ITEC 2050, Fall 2024
Written: October 14, 2024
 */
public interface Movement extends Flight {

    //implementation of fly method from flight interface
    void fly();

    //walk method
    void walk();

    //jump method
    void jump();
}
