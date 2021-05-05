package set;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<String> username = new HashSet<>();
        username.add("Habbit");
        username.add(".A.p.");
        username.add("Garet");
        username.add("ReXes");
        System.out.println(username);
        username.add("ReXes");
        System.out.println(username);
        if (username.contains("Habbit"))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
