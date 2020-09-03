package definitions.examples;

public class Example4 {
    public static void main(String[] args) {
        Bus miniBus = new Bus();
        miniBus.methodA();

    }
}

class Vehicle {
    float speed;
    float mileage;

    void methodA() {
        System.out.println("Vehicle class method.");
    }
}

class Bus extends Vehicle {
    @Override
    void methodA() {
        System.out.println("Bus class method");

    }
}