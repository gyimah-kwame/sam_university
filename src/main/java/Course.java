import java.util.List;

public class Course {

    private Lecturer lecturer;
    private List<Student> students;
    private Year year;

    public Course(Lecturer lecturer, List<Student> students, Year year) {
        this.lecturer = lecturer;
        this.students = students;
        this.year = year;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }
}
