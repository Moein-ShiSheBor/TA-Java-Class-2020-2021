import java.util.Scanner;

/**
 * project 1
 * case : Right
 * status : horizontal
 */
public class Snake {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        /**
         * making the snake and put it in str
         */
        String str = "";
        for (int i = 0; i < n; i++)
            str += "*";
        /**
         * here shows number of left shifts of the snake
         */
        for (int i = 0; i < n; i++) {
            /**
             * spaces from the first of the line
             */
            for (int j = 0; j < 50 - i; j++)
                System.out.print(" ");
            /**
             * print the snake
             */
            System.out.print(str);
            /**
             * replace extra '*' with space to hide them ...
             */
            for (int j = 0; j < i; j++)
                System.out.print(" ");
            Thread.sleep(500);
            /**
             * come it the first of the line
             */
            System.out.print("\r");
        }
    }
}
