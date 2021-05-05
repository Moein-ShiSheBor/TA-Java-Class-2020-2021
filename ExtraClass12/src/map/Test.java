package map;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, Student> map = new HashMap<>();
        Student[] students = new Student[4];
        students[0] = new Student(9843043, "Moein", 16.5);
        students[1] = new Student(9843053, "Ali", 15.43);
        students[2] = new Student(9843003, "Neda", 12.2);
        students[3] = new Student(9822222, "Negin", 9);
        for (int i = 0; i < students.length; i++)
            map.put(students[i].getNumber(), students[i]);
        System.out.println(map);
        System.out.println(map.containsKey(9843043));
        System.out.println(map.containsValue(students[1]));
        System.out.println("-------");
        for (int n : map.keySet())
            if (n % 10 == 3)
                System.out.println(map.get(n));
        System.out.println("-------");
        for (Student s : map.values())
            if (s.getAverage() > 15.1)
                System.out.println(s);
        System.out.println("-------");
        map.replace(9843053, new Student(9843053, "Mohsen", 15.43));
        System.out.println(map);
        System.out.println("-------");
        System.out.println(map.size());
        map.putIfAbsent(9822223, new Student(9822223, "mana", 19));
        System.out.println(map.size());
        System.out.println(map);

    }

    public static class Student {
        private int number;
        private String name;
        private double average;

        public Student(int number, String name, double average) {
            this.number = number;
            this.name = name;
            this.average = average;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        @Override
        public String toString() {
            return "Name : " + this.name + " Number : " + this.number + " AVG : " + this.average;
        }
    }
}
