import java.util.Scanner;

public class Test2 {
    /**
     * for Debug -------->   f7 : step into   ,  f8 : step over
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt() ;
        System.out.println(countDigit(n));
    }
    public static int countDigit(int n){
        int temp = 0;
        while (n>0){
            n/=10;
            temp++;
        }
        return temp;
    }
}
