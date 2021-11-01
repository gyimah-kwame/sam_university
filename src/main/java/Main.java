import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Student> allStudents = Stream.of(
                generateStudents(Year.FIRST), generateStudents(Year.SECOND), generateStudents(Year.THIRD), generateStudents(Year.FOURTH))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        List<Student> firstYears = allStudents
                .stream()
                .filter(x -> x.getYear() == Year.FIRST)
                .collect(Collectors.toList());

        Course programming = new Course(new Lecturer("Kwame", Lecturer.Subject.PROGRAMMING), firstYears, Year.FIRST);

        List<Student> thirdAndFourthYears = allStudents
                .stream()
                .filter(x -> x.getYear() == Year.THIRD || x.getYear() == Year.FOURTH)
                .collect(Collectors.toList());

        Course advancedGardening = new Course(new Lecturer("Alex", Lecturer.Subject.GARDENING), thirdAndFourthYears, Year.FOURTH);

        List<Student> otherStudents = allStudents
                .stream()
                .filter(x -> x.getYear() == Year.FOURTH)
                .filter(x -> Arrays.stream(new String[]{"a", "e", "i", "o", "u"}).anyMatch(y -> y.equalsIgnoreCase(x.getName().substring(0,1))))
                .collect(Collectors.toList());

        System.out.println(otherStudents);

        Course physics = new Course(new Lecturer("John", Lecturer.Subject.PHYSICS), otherStudents, Year.FOURTH);
    }

    private static List<Student> generateStudents(Year year) {

        List<Student> students = new ArrayList<>();

        for (int i =1; i<=10; i++) {
            students.add(new Student("student_"+i, year));
        }

        return students;
    }
}
