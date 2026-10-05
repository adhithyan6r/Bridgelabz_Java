package javaConstructors.InstanceVsClassVariables;
// Class to manage course details and institute name
public class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "BridgeLabz";
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
    }
    public static void updateInstituteName(String name) {
        instituteName = name;
    }
    public static void main(String[] args) {
        Course course1 = new Course("Java", 3, 10000);
        Course course2 = new Course("Python", 2, 8000);
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        Course.updateInstituteName("ABC Institute");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}