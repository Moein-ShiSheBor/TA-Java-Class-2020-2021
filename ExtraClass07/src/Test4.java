import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        choose(getInput());
    }

    public static int getInput() {
        System.out.println(" 1.Product List\n 2.Basket\n 3.Exit");
        Scanner in = new Scanner(System.in);
        try {
            int n = in.nextInt();
            return n;
        } catch (Exception e) {
            System.out.println("- - - - - - - - - - - - -");
            System.out.println("Incorrect Input");
            System.out.println("- - - - - - - - - - - - -");
            getInput();
        }
        return 0;
    }

    public static void choose(int n) {
        switch (n) {
            case 1:
                System.out.println("Product List");
                break;
            case 2:
                System.out.println("Basket");
                break;
            case 3:
                System.out.println("Exit");
                break;
            default:
                choose(getInput());
        }
    }
}
