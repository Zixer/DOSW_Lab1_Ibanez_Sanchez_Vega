import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WelcomeMessage {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Yazid Alejandro Sanchez Sanchez", 19, "yazid.sanchez-s@mail.escuelaing.edu.co", 6), new Student("Sergio Andres Vega Pachon", 20, "sergio.vega-p@mail.escuelaing.edu.co", 6),new Student("Daniel Santiago Ibañez Gonzalez", 19, "daniel.ibanez-g@mail.escuelaing.edu.co", 6));

        System.out.println("Hello and welcome!\n");

        List<String> studentDescriptions = students.stream().map(student -> student.getFullName() + ", a " + student.getCurrentSemester() + "th-semester student, " + student.getAge() + " years old").collect(Collectors.toList());

        System.out.println("We are");

        studentDescriptions.forEach(description -> System.out.println(description));

        System.out.println("\nOur institutional emails are:");

        students.stream().map(Student::getInstitutionalEmail).forEach(email -> System.out.println(email));
    }
}