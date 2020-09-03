package definitions.transport;

import java.util.Scanner;

public class FourWheeler extends Vehicle {

    // FourWheeler extends Vehicle
    // <subclass> extends <superclass>
    // Vehicle -> (is inherited by ) FourWheeler
    // The child class is inheriting from a single parent,
    // this is Simple Inheritance.
    // superclass -> subclass
    //String car = " Bugatti ";

   // Scanner scanner = new Scanner(System.in);

    public void startFourWheeler(String car){
    System.out.println( car + "has started.");
 }
 public void stopFourWheeler(String car) {
     System.out.println(car + "has Stoped");
 }
}
