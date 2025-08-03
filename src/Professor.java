public class Professor extends User {

    public Professor() {
        super("", "", "");
    }

    public Professor(String id, String name, String password) {
        super(id, name, password);
    }

    public void createUser(UserLogin user, Student student) {
        user.addUser(student);
    }

    public void assignGradeToStudent(UserLogin userLogin, String studentId, Course course, double grade) {
        User user = userLogin.findUserById(studentId);
        if (user instanceof Student) {
            ((Student) user).assignGrade(course, grade);
        }
    }

    public java.util.List<Student> getAddedStudents(UserLogin userLogin) {
        java.util.List<Student> students = new java.util.ArrayList<>();
        for (User u : userLogin.getUsers()) {
            if (u instanceof Student) {
                students.add((Student) u);
            }
        }
        return students;
    }
}
