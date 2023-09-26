//factory methods
// programs for  user defind factory methods 



class Vehicle {
    private String type;

    public Vehicle(String type) {
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void display() {
        System.out.println("This is a " + type + " vehicle.");
    }
}

class VehicleFactory {
    // User-defined factory method to create Vehicle instances based on type.
    public static Vehicle createVehicle(String type) {
        return new Vehicle(type);
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        // Use the user-defined factory method to create different types of vehicles.
        Vehicle car = VehicleFactory.createVehicle("Car");
        Vehicle bike = VehicleFactory.createVehicle("Bike");
        Vehicle truck = VehicleFactory.createVehicle("Truck");

        // Call the display method on the created vehicles.
        car.display();
        bike.display();
        truck.display();
    }
}
