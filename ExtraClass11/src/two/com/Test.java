package two.com;

public class Test {
    public static void main(String[] args) {
/*        Teacher teacher = new Teacher("ali", "rezaee", 31, "math");
        Worker worker = new Worker("ali", "rezaee", 31, "Tile");
        teacher.print();
        worker.print();*/
        Person teacher = new Teacher("ali", "rezaee", 31, "math");
        Person worker = new Worker("ali", "rezaee", 31, "Tile");
        Person[] people = {teacher, worker};
        for (Person p : people)
            p.print();
    }
}
