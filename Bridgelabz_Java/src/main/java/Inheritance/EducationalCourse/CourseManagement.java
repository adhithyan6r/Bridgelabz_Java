package Inheritance.EducationalCourse;
// Class to run the educational course hierarchy program
public class CourseManagement {
    public static void main(String[] args) {
        PaidOnlineCourse course = new PaidOnlineCourse(
                "Java Programming",
                6,
                "NPTEL",
                true,
                10000,
                20
        );
        course.displayCourse();
    }
}