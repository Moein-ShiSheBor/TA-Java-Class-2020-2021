import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /**
         * Run this section for yourself
         * enter ' JAVA ' for input part ( note : is UPPERCASE )
         * and then yourself see why we should use ' equals ' instead of ' == '
         */

        Scanner in = new Scanner(System.in);

        String str1 = "JAVA";
        String str2 = in.next();

        if (str1 == str2)
            System.out.println("Yes");
        else
            System.out.println("No");

        System.out.println(" - - - - - - - - - - - - - - - ");

        if (str1.equals(str2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
