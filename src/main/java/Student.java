public class Student {
    private String id;
    private String name;
    private Year year;

    private static int num = 1;

    public Student(String name, Year year) {
        id = String.valueOf( num++);
        this.name = name;
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Year getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
