import java.util.Scanner;

public class Main {
    /**
     * keyword - - - > 'psvm' + Enter
     */
    public static void main(String[] args) {
        /**
         * make scanner( here 'in' ) object from Scanner class
         */
        Scanner in = new Scanner(System.in);

        do {
            /**
             * keyword - - - > 'sout' + Enter
             */
            System.out.println(1);
        }while (false);


        int n = in.nextInt();
        double avg = average(n);
        System.out.println(avg);
        /**
         * short code of that 3 up lines
         */
        System.out.println(average(in.nextInt()));

        String str = in.nextLine();
        System.out.println(str);
        /**
         * different methods for print
         */
        System.out.print("Hello");
        System.out.println("Hello");
        System.out.printf("int  : %d",25);
        System.out.format("double  : %f" + " ...\n",17.2);
        System.out.println("int  : "+25 + " ...");
    }

    /**
     * make a func in Main class ( !!! dont forget 'static' !!! )
     * this method give an int and return a double variable
     */
    public static double average(int n){
        Scanner in = new Scanner(System.in);
        double sum = 0;
        for (int i=0;i<n;i++){
            sum+=in.nextDouble();
        }
        return sum/n;
    }
}
