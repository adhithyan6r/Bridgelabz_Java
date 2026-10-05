package encapsulationAbstractPolymorphismInterface.Hospital;
// class to represent patients visiting the hospital without admission
public class OutPatient extends Patient implements Billable {
    private double consultationFee;
    public OutPatient(int patientId, String patientName, int age, double consultationFee) {
        super(patientId, patientName, age);
        this.consultationFee = consultationFee;
    }
    public double getConsultationFee() {
        return consultationFee;
    }
    public void setConsultationFee(double consultationFee) {
        if (consultationFee >= 0) {
            this.consultationFee = consultationFee;
        }
    }
    @Override
    public double calculateBill() {
        return consultationFee;
    }
    @Override
    public String getBillDetails() {
        return "Out patientfee: " + consultationFee;
    }
}