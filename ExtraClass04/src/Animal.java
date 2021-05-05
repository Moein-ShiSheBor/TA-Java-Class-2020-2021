public class Animal {
    private String name;
    private int age;
    private String color;
    private boolean wildness;

    public Animal() {
    }

    public Animal(String name, int age, String color, boolean wildness) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.wildness = wildness;
    }

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWildness() {
        return wildness;
    }

    public void setWildness(boolean wildness) {
        this.wildness = wildness;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", wildness=" + wildness +
                '}';
    }
}
