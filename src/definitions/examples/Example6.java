package definitions.examples;

public class Example6 {
    public static void main(String[] args) {
        Bike myBike = new Bike(1, "Ducati V78");
        SuperBike mySuperBike = new SuperBike(2, "Ducati X98", 400);
        myBike.displayBikeInformation();
       mySuperBike.displyBikeInformation();

    }
}

class Bike {
    private final int idNumber;
    public String modelName;


    public Bike(int idNumber, String modelName) {
        this.idNumber = idNumber;
        this.modelName = modelName;
    }

    public void displayBikeInformation() {
        System.out.println("IdNumber = " + idNumber);
        System.out.println("ModelName = " + modelName);
    }
}

class SuperBike extends Bike {
    private double maxSpeed;

    public SuperBike(int idNumber, String modelName, double maxSpeed) {
        // the super keyword
        super(idNumber, modelName);
        this.maxSpeed = maxSpeed;

    }
    public void displyBikeInformation() {
        super.displayBikeInformation();
        System.out.println("Max speed = " + this.maxSpeed);
    }
}
