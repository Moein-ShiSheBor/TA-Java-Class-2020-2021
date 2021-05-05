import java.util.Scanner;

public class AnimalTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /**
         * Array of Class --->  type : 'Animal'
         */
        Animal[] animals = new Animal[2];
        /**
         * Set parameters in each obj of Animal
         */
        for (int i = 0; i < 2; i++) {
            animals[i] = new Animal();
            animals[i].setName(in.next());
            animals[i].setAge(in.nextInt());
            animals[i].setColor(in.next());
            animals[i].setWildness(in.nextBoolean());
        }
        /**
         * print properties of 'animals' with 'toString' method
         */
        for (int i = 0; i < 2; i++) {
            System.out.println(animals[i]);
        }
    }
}
