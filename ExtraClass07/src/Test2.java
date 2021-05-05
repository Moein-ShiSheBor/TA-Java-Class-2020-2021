import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            char uc = (char) ('A' + Math.random() * 26);
            char lc = (char) ('a' + Math.random() * 26);
            System.out.format("UpperCase : %c , LoweCase : %c\n", uc, lc);
        }

        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(rnd.nextInt(i+1));
        }

        char c = (char) ('A' + rnd.nextInt(26 * 2 + 3));
        System.out.println(c);
    }
}
