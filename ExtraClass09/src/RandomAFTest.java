
import java.io.IOException;

public class RandomAFTest {
    public static void main(String[] args) throws IOException {
        RandomAF file = new RandomAF("C:\\Users\\Moein\\Desktop\\ExtraClass09\\src\\data.txt");

        User user1 = new User(1, "Moein", "Shishebor", 20, 16.5);
        User user2 = new User(2, "Ali", "Heidary", 30, 15.23);
        User user3 = new User(3, "Fateme", "Mohammady", 43, 18);

        file.writeUserEnd(user1);
        file.writeUserEnd(user2);
        file.writeUserEnd(user3);

        User user11 = file.readUser(3);
        User user22 = file.readUser(2);
        User user33 = file.readUser(1);

        System.out.println(user11);
        System.out.println(user22);
        System.out.println(user33);

        file.closeFile();
    }
}
