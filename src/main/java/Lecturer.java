public class Lecturer {

    private String name;
    private Subject subject;

    public Lecturer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    enum Subject {
        ENGLISH, MATHS, PHYSICS,PROGRAMMING, GARDENING
    }
}
