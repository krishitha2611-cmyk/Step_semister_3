package string.class_problems;

class Course {
    String code;
    String title;
    int credits;
    int labCredits;

    Course(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    Course(String code, String title, int credits) {
        this(code, title, credits, 0);
    }

    int totalCredits() {
        return credits + labCredits;
    }
}

public class CourseMain {
    public static void main(String[] args) {

        Course c1 =
                new Course("CS101", "Java", 3, 2);

        Course c2 =
                new Course("CS102", "DBMS", 4);

        System.out.println(c1.title + " = " + c1.totalCredits());
        System.out.println(c2.title + " = " + c2.totalCredits());
    }
}