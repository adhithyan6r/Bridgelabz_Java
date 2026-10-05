package Inheritance.EducationalCourse;
// Class to represent a paid online course that inherits from OnlineCourse
public class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;
    public PaidOnlineCourse(String courseName, int duration, String platform,
                            boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    @Override
    public void displayCourse() {
        super.displayCourse();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: " + (fee - (fee * discount / 100)));
    }
}