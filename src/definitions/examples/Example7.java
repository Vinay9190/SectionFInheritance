package definitions.examples;

public class Example7 {
    public static void main(String[] args) {
        Airplane airbus = new Airplane(380);
        airbus.displayInformation();
        Jet privateJet = new Jet(47,410);
        privateJet.displayInformation();
        FighterJet rafael = new FighterJet(24,480,8);
        rafael.displayInformation();
    }
}
class Airplane {
    private int airplanID;

    public Airplane(int airplaneID) {
        this.airplanID = airplaneID;
    }

    public int getAirplanID() {
        return airplanID;
    }

    public void displayInformation() {
        System.out.println("airplaneID = " + airplanID);
    }
}

class Jet extends Airplane {
    int maxSpeed;

    public Jet(int airplaneID, int maxSpeed) {
        super(airplaneID);
        this.maxSpeed = maxSpeed;
    }
    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Max speed = " + maxSpeed);
    }
}
 class FighterJet extends Jet {
    private int numberOfMissiles;

    public FighterJet(int airplaneID, int maxSpeed, int numberOfMissiles) {
        super(airplaneID, maxSpeed);
        this.numberOfMissiles = numberOfMissiles;
    }
    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("numberOfMissiles = " + numberOfMissiles);

    }
 }

