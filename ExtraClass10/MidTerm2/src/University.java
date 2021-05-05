import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class University {
    private RandomAccessFile file;

    private final int EACH_STUDENT = 2 * 20 + 2 * 20 + 2 * 10 + 10 * 8;
    private final int STD_NO_PALACE = 2 * 20 + 2 * 20;
    private final int F_NAME_OR_L_NAME_LENGTH = 20;
    private final int STD_NO_LENGTH = 10;
    private final int REMOVE_LENGTH = 20 + 20 + 10;

    public University(String fileName) throws FileNotFoundException {
        file = new RandomAccessFile(fileName, "rw");
    }

    public void addStudent(Student st) throws IOException {
        file.seek(file.length());
        write(st);
    }

    public Student findStudent(String stdNo) throws IOException {
        for (int i = 0; i < file.length() / EACH_STUDENT; i++) {
            file.seek(i * EACH_STUDENT + STD_NO_PALACE);
            if (stdNo.equals(readStdNo())) {
                file.seek(i * EACH_STUDENT);
                Student student = read();
                return student;
            }
        }
        return null;
    }

    public void removeStudent(String stdNo) throws IOException {
        for (int i = 0; i < file.length() / EACH_STUDENT; i++) {
            file.seek(i * EACH_STUDENT + STD_NO_PALACE);
            if (stdNo.equals(readStdNo())) {
                file.seek(i * EACH_STUDENT);
                delete();
            }
        }
    }


    public void printAllStudents() throws IOException {
        for (int i = 0; i < file.length() / EACH_STUDENT; i++) {
            file.seek(i * EACH_STUDENT);
            String name = readFOrLName();
            if (name.equals(""))
                continue;
            else
                System.out.println("Name: " + name + "  Family: " + readFOrLName() + "  stdNo: " + readStdNo() + "  Grades: " + printGrades(readGrades()));
        }
    }


    private void write(Student st) throws IOException {
        file.writeChars(fixe(st.getfName(), F_NAME_OR_L_NAME_LENGTH));
        file.writeChars(fixe(st.getlName(), F_NAME_OR_L_NAME_LENGTH));
        file.writeChars(fixe(st.getStdNo(), STD_NO_LENGTH));
        double[] grades = st.getGrads();
        for (int i = 0; i < grades.length; i++)
            file.writeDouble(grades[i]);
    }

    private Student read() throws IOException {
        Student student = new Student(readFOrLName(), readFOrLName(), readStdNo(), readGrades());
        return student;
    }

    private String readFOrLName() throws IOException {
        String str = "";
        for (int i = 0; i < 20; i++) {
            str += file.readChar();
        }
        return str.trim();
    }

    private String readStdNo() throws IOException {
        String str = "";
        for (int i = 0; i < 10; i++) {
            str += file.readChar();
        }
        return str.trim();
    }

    private double[] readGrades() throws IOException {
        double[] grades = new double[10];
        for (int i = 0; i < 10; i++) {
            grades[i] = file.readDouble();
        }
        return grades;
    }

    private String printGrades(double[] grades) {
        String fStr = "";
        for (double d : grades)
            fStr += (d + " ");
        return fStr;
    }

    private void delete() throws IOException {
        for (int i = 0; i < REMOVE_LENGTH; i++)
            file.writeChars(" ");
        for (int i = 0; i < 10; i++)
            file.writeDouble(-1);
    }


    private String fixe(String str, int len) {
        for (int i = str.length(); i < len; i++)
            str += " ";
        return str;
    }
}
