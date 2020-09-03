package main;

import java.util.Scanner;

import definitions.transport.FourWheeler;

import definitions.transport.Vehicle;

public class Main  {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.start();
        myVehicle.stop();
        FourWheeler myfourWheeler = new FourWheeler();
        myfourWheeler.start();
        myfourWheeler.stop();



    }
}
