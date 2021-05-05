
import java.io.IOException;

public class UniversityTest {
    public static void main(String[] args) throws IOException {
        final String FILE_NAME = "C:\\Users\\Moein\\Desktop\\MidTerm2\\src\\data.dat";
        Student[] students = new Student[5];
        students[0] = new Student("ali", "ahmadi", "9834000", new double[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19});
        students[1] = new Student("mohammad", "yavari", "9834001", new double[]{10, 10, 10, 10, 10, 10, 10, 17, 18, 19});
        students[2] = new Student("zahra", "khodaii", "9834002", new double[]{10, 11, 11, 11, 11, 11, 11, 11, 18, 19});
        students[3] = new Student("neda", "soltani", "9834003", new double[]{10, 11, 12, 12, 12, 12, 12, 17, 18, 19});
        students[4] = new Student("moein", "shishebor", "9834004", new double[]{10, 11, 12, 13, 13, 13, 13, 13, 13, 19});
        University uni = new University(FILE_NAME);
        uni.addStudent(students[0]);
        uni.addStudent(students[1]);
        uni.addStudent(students[2]);
        uni.addStudent(students[3]);
        uni.addStudent(students[4]);
        uni.printAllStudents();
        System.out.println("- - - - - - - - - - - ");
        System.out.println(uni.findStudent("9834000").toString());
        System.out.println(uni.findStudent("9834001").toString());
        System.out.println(uni.findStudent("9834002").toString());
        System.out.println(uni.findStudent("9834004").toString());
        System.out.println("- - - - - - - - - - - ");
        uni.removeStudent("9834000");
        uni.removeStudent("9834003");
        uni.printAllStudents();
    }
}
