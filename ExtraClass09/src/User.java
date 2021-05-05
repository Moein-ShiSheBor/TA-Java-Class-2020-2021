public class User {
    /*    */
    /**
     * constant size of variables in file
     *//*
    private final int ID_LENGTH = 4;
    private final int Age_LENGTH = 4;
    private final int AVG_LENGTH = 8;
    private final int CHAR_LENGTH = 2;
    private final int F_NAME_SIZE_LENGTH = 4;
    private final int L_NAME_SIZE_LENGTH = 4;*/

    private int id;
    private String fName;
    private String lName;
    private int age;
    private double avg;

    public User() {
    }

    public User(int id, String fName, String lName, int age, double avg) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.avg = avg;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", avg=" + avg +
                '}';
    }
    
}
