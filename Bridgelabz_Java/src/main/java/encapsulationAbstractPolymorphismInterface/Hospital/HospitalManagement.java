package encapsulationAbstractPolymorphismInterface.Hospital;
import java.util.ArrayList;
// Class to manage hospital patients using encapsulation and polymorphism
public class HospitalManagement {
    // To process different types of patients using one method
    public static void processPatient(Patient patient) {
        patient.displayDetails();
        double bill = patient.calculateBill();
        System.out.println("Bill Amount: " + bill);
        if (patient instanceof Billable) {
            Billable billable = (Billable) patient;
            System.out.println(billable.getBillDetails());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new InPatient(101, "Adhi", 25, 5, 2000));
        patients.add(new OutPatient(102, "Elan", 30, 500));
        for (Patient patient : patients) {
            processPatient(patient);
        }
    }
}