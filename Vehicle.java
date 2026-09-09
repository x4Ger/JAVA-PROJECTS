public class Vehicle {

    public static void main(String[] args) {

    Ride vehicle1 = new Car("Car", 10, 10, 60);
    Ride vehicle2 = new Motor("Motor", 50, 10, 60);
    Ride vehicle3 = new Truck("Truck", 80, 60, 70);

    System.out.println(vehicle1.vehicle + " Fuel Cost: " + vehicle1.calculateFuelCost());
    System.out.println(vehicle2.vehicle + " Fuel Cost: " + vehicle2.calculateFuelCost());
    System.out.println(vehicle3.vehicle + " Fuel Cost: " + vehicle3.calculateFuelCost());
        
    }
}

class Ride {
    String vehicle;
    int distance, fuelef, cost;
    Ride(String vehicle, int distance, int fuelef, int cost) {
        this.vehicle = vehicle;
        this.distance = distance;
        this.fuelef = fuelef;
        this.cost = cost;            
    }

    double calculateFuelCost() {
        return 0;
    }
}

class Car extends Ride {
    Car(String vehicle, int distance, int fuelef, int cost) {
        super(vehicle, distance, fuelef, cost);
    }

    @Override
    double calculateFuelCost() {
        return (double) distance / fuelef * cost; 
    }
}

class Motor extends Ride {
    Motor(String vehicle, int distance, int fuelef, int cost) {
        super(vehicle, distance, fuelef, cost);
    }

    @Override
    double calculateFuelCost() {
        return (double) distance / fuelef * cost; 
    }
}

class Truck extends Ride {
    Truck(String vehicle, int distance, int fuelef, int cost) {
        super(vehicle, distance, fuelef, cost);
    }

    @Override
    double calculateFuelCost() {
        return (double) distance / fuelef * cost; 
    }
}
