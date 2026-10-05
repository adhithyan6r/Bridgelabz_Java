package encapsulationAbstractPolymorphismInterface.Hospital;
// Interface to define billing behavior for patients
public interface Billable {
    double calculateBill();
    String getBillDetails();
}