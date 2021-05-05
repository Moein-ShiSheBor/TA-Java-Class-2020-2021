public class Student {

    private String fName;
    private String lName;
    private String stdNo;
    private double[] grads;

    public Student(String fName, String lName, String stdNo, double[] grads) {
        this.fName = fName;
        this.lName = lName;
        this.stdNo = stdNo;
        this.grads = grads;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getStdNo() {
        return stdNo;
    }

    public double[] getGrads() {
        return grads;
    }

    @Override
    public String toString() {
        return "Name: " + fName + "  Family: " + lName + "  stdNo: " + stdNo + "  Grades: " + printGrades();
    }

    private String printGrades() {
        String fStr = "";
        for (double s : grads)
            fStr += (s + " ");
        return fStr;
    }
}
