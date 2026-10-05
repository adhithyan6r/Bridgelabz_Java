package Inheritance.SmartHome;
// Class to run the smart home device program
public class SmartHome {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("TH001", "ON", 24.5);
        thermostat.displayStatus();
    }
}