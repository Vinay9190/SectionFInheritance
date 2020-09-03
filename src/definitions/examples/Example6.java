package definitions.examples;

public class Example6 {
    public static void main(String[] args) {

    }
}
class Bike {
    private int idNumber;
    public String modelName;
}
public Bike(int idNumber, String modelName) {
    this.idNumber = idNumber;
    this.modelName = modelName;
}
public void displayBikeInformation() {
    System.out.println("IdNumber = " + idNumber);
    System.out.println("ModelName = " + modelName);
}
