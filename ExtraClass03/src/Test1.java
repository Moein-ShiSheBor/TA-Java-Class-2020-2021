public class Test1 {
    /**
     * Usage of class Math
     */
    public static void main(String[] args) {
        /**
         * find max or min between two int , double , ...
         */
        System.out.println(Math.min(12,5));
        System.out.println(Math.max(12,5));
        /**
         * PI = 3.14...
         */
        System.out.println(Math.PI);
        /**
         * positive amount of input
         */
        System.out.println(Math.abs(-123));
        System.out.println(Math.sqrt(64));
        /**
         * make Random number
         * Note : this method make numbers between 0 & 1
         * +
         * type casting  ---> to change the type of an variable to another...
         * for this should write the the type we want to convert in parenthesis before the variable
         */
        for (int i=0;i<10;i++)
            System.out.println((int) (1 +Math.random() * 100));
        int a = 5;
        double b = 6.7;
        b = a;
        /**
         * next line is wrong !!
         */
//        a = b;
        a = (int) b;
    }
}
