// Problem 3: Vehicle Registration
public class Vehicle {
    
    String ownerName;
    String vehicleType;

   
    static double registrationFee = 500.0;

   
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

   
    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType + 
                           ", Registration Fee: $" + registrationFee);
    }

    
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: $" + registrationFee);
    }
}
