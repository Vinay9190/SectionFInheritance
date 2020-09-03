package definitions.transport;

// If we create a public class in Java,
// the name of the class (Truck)
// the name of the file (Truck.java)
// should be  exactly the same!

//outer class
public class Truck extends Vehicle {

    // inner class
    private class Engine {

    }

}
class DeliveryTruck {

    // we can access the Truck class in the same file.
    private Truck myTruck;
}