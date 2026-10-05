package encapsulationAbstractPolymorphismInterface.Hospital;
// Abstract class to store common patient details and behavior
public abstract class Patient {
    private int patientId;
    private String patientName;
    private int age;
    public Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }
    public int getPatientId() {
        return patientId;
    }
    public void setPatientId(int patientId) {
        if (patientId > 0) {
            this.patientId = patientId;
        }
    }
    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    // To calculate the patient's bill
    public abstract double calculateBill();
    // To display patient details
    public void displayDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("patient name: " + patientName);
        System.out.println("Age: " + age);
    }
}