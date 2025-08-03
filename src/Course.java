import java.util.LinkedList;
import java.util.List;

public class Course {

    private String courseId;
    private String courseName;
    private List<Course> courses;

    public Course() {
        courses = new LinkedList<>();
    }

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Course> getCoursesList() {
        if (courses.isEmpty()) {
            courses.add(new Course("130", "General Chemistry 1"));
            courses.add(new Course("201", "Health Disparities in US"));
            courses.add(new Course("260", "Data Structures and Algorithms"));
            courses.add(new Course("255", "Comparative Religious Trad"));
            courses.add(new Course("147", "Statistics"));
            courses.add(new Course("150", "Pre-Calculus "));
            courses.add(new Course("455", "Machine Learning"));
            courses.add(new Course("273", "Database Management"));
        }
        return courses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Course course = (Course) o;
        return courseId != null ? courseId.equals(course.courseId) : course.courseId == null;
    }

    @Override
    public int hashCode() {
        return courseId != null ? courseId.hashCode() : 0;
    }
}
