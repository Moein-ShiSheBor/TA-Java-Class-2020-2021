package two.com;

public class Worker extends Person {
    private String company;

    public Worker(String name, String family, int age, String company) {
        super(name, family, age);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    void print() {
        System.out.println(super.toString() + " , company:" + getCompany());
    }
}
