package two.com;

public class Teacher extends Person {

    private String lesson;

    public Teacher(String name, String family, int age, String lesson) {
        super(name, family, age);
        this.lesson = lesson;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    void print() {
        System.out.println(super.toString() + " , lesson:" + getLesson());
    }
}
