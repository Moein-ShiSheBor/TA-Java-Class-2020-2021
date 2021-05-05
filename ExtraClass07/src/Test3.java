public class Test3 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 0, 5};
        try {
            for (int i : nums) {
                System.out.println(10 / i);
            }
        } catch (ArithmeticException e) {
            System.out.println("division by Zero");
        }

        int temp;
        for (int i : nums) {
            if (i == 0)
                throw new ArithmeticException();
            temp = 10 / i;
            System.out.println(temp);
        }
    }
}
