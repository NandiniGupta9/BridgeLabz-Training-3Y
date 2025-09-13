public class SmartHomeMain {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("THERMO-001", "ON", 24.5);

       
        thermostat.displayStatus();
    }
}
