package encapsulationAbstractPolymorphismInterface.Hospital;
// Class to represent patients admitted to the hospital
public class InPatient extends Patient implements Billable {
    private int daysAdmitted;
    private double dailyCharge;
    public InPatient(int patientId, String patientName, int age, int daysAdmitted, double dailyCharge) {
        super(patientId, patientName, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }
    public int getDaysAdmitted() {
        return daysAdmitted;
    }
    public void setDaysAdmitted(int daysAdmitted) {
        if (daysAdmitted > 0) {
            this.daysAdmitted = daysAdmitted;
        }
    }
    public double getDailyCharge() {
        return dailyCharge;
    }
    public void setDailyCharge(double dailyCharge) {
        if (dailyCharge >= 0) {
            this.dailyCharge = dailyCharge;
        }
    }
    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }
    @Override
    public String getBillDetails() {
        return "In-patient bill: " + daysAdmitted + " days × " + dailyCharge;
    }
}