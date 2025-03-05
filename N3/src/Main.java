import CommandPattern.*;

public class Main {
    public static void main(String[] args) {
        Parking myParking = new Parking();
        Vehicle myBoat = new Vehicle("Boat");
        Vehicle myPlane = new Vehicle("Plane");
        Vehicle myBike = new Vehicle("Bike");
        Vehicle myCar = new Vehicle("Car");
        myParking.addAction(new SlowDown(myBoat));
        myParking.addAction(new SlowDown(myPlane));
        myParking.addAction(new SlowDown(myBike));
        myParking.addAction(new SlowDown(myCar));
        myParking.addAction(new Start(myBike));
        myParking.addAction(new Acceleration(myBike));
        myParking.addAction(new Start(myCar));
        myParking.addAction(new Start(myPlane));
        myParking.addAction(new Acceleration(myPlane));
        myParking.flushActionStack();
    }
}