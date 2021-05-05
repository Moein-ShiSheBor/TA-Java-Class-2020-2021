public class Test1 {
    public static void main(String[] args) {
        /**
         * use the second constructor
         */
        Student student = new Student("moein",20);
        /**
         * get age from the Student class
         */
        System.out.println(student.getAge());
        /**
         * set "Math" in the course part of the Student class
         */
        student.setCourse("Math");
        /**
         * get course from the Student class
         */
        System.out.println(student.getCourse());
    }
}


