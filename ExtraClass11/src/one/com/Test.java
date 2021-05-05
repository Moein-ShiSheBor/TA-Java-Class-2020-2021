package one.com;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("ali", "rezaee", 31);
        Teacher teacher = new Teacher("ali", "rezaee", 31, "math");
        Worker worker = new Worker("ali", "rezaee", 31, "Tile");
        System.out.println(person + "\n" + teacher + "\n" + worker);
    }
}
