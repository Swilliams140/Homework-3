/*
Class Name: ThingsThatFly
@ Stanley Williams
version 1.0
Course: ITEC 2050, Fall 2024
Written: October 14, 2024
 */
import java.util.ArrayList;
public class ThingsThatFly {
    public static void main(String[] args) {
        Bird b1 = new Bird("Mockingjay");
        Bird b2 = new Bird("Hummingbird");
        Airplane a1 = new Airplane("Boeing", 2019);

        ArrayList<String> flyers = new ArrayList<String>();
        flyers.add(b1.toString());
        flyers.add(b2.toString());
        flyers.add(a1.toString());


        for (int i = 0; i < flyers.size(); i++) {
            System.out.println(flyers.get(i));
                if (i == 0) {
                    b1.fly();
                }
                if (i == 1) {
                    b2.fly();
                }
                if (i == 2) {
                    a1.fly();
                }
            }


        }
    }