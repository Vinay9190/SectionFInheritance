package definitions.transport;

public class Vehicle {
    String car = "Bugatti ";

    public void start() {
        System.out.println(car + "has started.");
    }

    public void stop() {
        System.out.println(car + "has Stop");
    }
}


// Vehicle (Parent) -> Fourwheeler (Child)
// Vehicle (GrandParent) -> Car (GrandChild)
// Fourwheeler (Parent)-> Car (child)
// Fourwheeler -> subclass of Vehicle (child)
// Car -> Super sub class of Vehicle (grand Child)