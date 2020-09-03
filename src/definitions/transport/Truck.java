package definitions.transport;

// If we create a public class in Java,
// the name of the class (Truck)
// the name of the file (Truck.java)
// should be  exactly the same!

//outer class
public class Truck extends Vehicle {

    protected void startTruck() {
        System.out.println("Truck is starting ....");
    }

    // inner class
    protected class Engine {
        //this cannot be accessed outside the class they are declared in.

    }

}
class DeliveryTruck extends Truck{

    // we can access the Truck class in the same file.
    private Truck myTruck;

    public void startDeliveryTruck() {
        startTruck();
    }
}