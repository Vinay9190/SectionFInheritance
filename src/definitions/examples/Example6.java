package definitions.examples;

public class Example6 {
    public static void main(String[] args) {

    }
}

class Bike {
    public String modelName;
    private final int idNumber;


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
    private  double maxSpeed;

    public SuperBike(int idNumber, String modelName, double maxSpeed) {
        // the super keyword
        super(idNumber,modelName);
        this.maxSpeed = maxSpeed;

    }
}
