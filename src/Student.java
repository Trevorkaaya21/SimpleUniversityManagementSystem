import java.util.ArrayList;
import java.util.List;

public class Student extends User {

    private List<Course> registeredCourses;
    private List<Double> grades;

    public Student() {
        super("", "", "", 0);
        this.registeredCourses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public Student(String id, String name, String password) {
        super(id, name, password, 0);
        this.registeredCourses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public Student(String id, String name, String password, int year) {
        super(id, name, password, year);
        this.registeredCourses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public boolean registerCourse(Course course) {
        if (isCourseAlreadyRegistered(course)) {
            return false;
        }
        if (registeredCourses.size() < 4) {
            registeredCourses.add(course);
            grades.add(0.0);
            return true;
        }
        return false;
    }

    private boolean isCourseAlreadyRegistered(Course course) {
        for (Course registeredCourse : registeredCourses) {
            if (registeredCourse.getCourseId().equals(course.getCourseId())) {
                return true;
            }
        }
        return false;
    }

    public boolean withdrawCourse(Course course) {
        for (int i = 0; i < registeredCourses.size(); i++) {
            if (registeredCourses.get(i).getCourseId().equals(course.getCourseId())) {
                registeredCourses.remove(i);
                grades.remove(i);
                return true;
            }
        }
        return false;
    }

    public void assignGrade(Course course, double grade) {
        for (int i = 0; i < registeredCourses.size(); i++) {
            if (registeredCourses.get(i).getCourseId().equals(course.getCourseId())) {
                grades.set(i, grade);
                return;
            }
        }
    }

    public double calculateGPA() {
        if (grades.isEmpty()) return 0.0;
        double sum = 0;
        for (double g : grades) sum += g;
        return sum / grades.size();
    }

}
