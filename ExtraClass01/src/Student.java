public class Student {
    private String name;
    private int age;
    private String course;

    /**
     * constructors
     * keyword  - - - > alt + insert
     */
    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("HELLO");
    }

    /**
     * getter & setters
     * keyword  - - - > alt + insert
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
