
import java.io.IOException;

public class RandomAFTest {
    public static void main(String[] args) throws IOException {
        RandomAF file = new RandomAF("C:\\Users\\Moein\\Desktop\\ExtraClass08\\src\\data.txt");
        User user1 = new User(1, "Moein", "Shishebor", 20, 16.5);
        User user2 = new User(2, "Ali", "Heidary", 30, 15.23);
        User user3 = new User(3, "Fateme", "Mohammady", 43, 18);
        file.writeUserEnd(user1);
        /**
         * lines 14 & 15 do the same thing
         */
//        file.writeUserEnd(user2);
        file.writeUser(user2, user1.length());
        file.writeUserEnd(user3);
        User user11 = file.readUser(0);
        User user22 = file.readUser();
        User user33 = file.readUser();
        System.out.println(user11);
        System.out.println(user22);
        System.out.println(user33);
        file.closeFile();
    }
}
