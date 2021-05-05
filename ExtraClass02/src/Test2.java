public class Test2 {
    public static void main(String[] args) {
        /**
         * String Class methods
         */

        String s1 = "Java";
        String s2 = "Class";
        String s3 = "0913-123-456";
        String s4 = "Java";
        System.out.println(s1 + " " + s2);
        /**
         * charAt : return the character of given index
         */
        System.out.println(s1.charAt(2));
        System.out.println(s3);
        /**
         * trim : delete first and end spaces of the given String
         */
        System.out.println(s3.trim());
        /**
         * indexOf : return the First index of given character or String
         */
        System.out.println(s1.indexOf("v"));
        System.out.println(s1.indexOf("va"));
        /**
         * Wrong Example !!!
         * because the < split > method return an array of String and we can;t print it directly
         */
        System.out.println(s3.split("-"));
        /**
         * split : split or break String to some parts based on an Entry String or number
         */
        /**
         * defining an Array :
         *      1. Type of input    2. []    3. name
         */
        String[] ary = s3.split("-");
        for (int i = 0; i < ary.length; i++)
            System.out.println(ary[i]);

        System.out.println("--------------------------");
        /**
         * foreach loop
         */
        for (String s : ary)
            System.out.println(s);
        /**
         * length : calculate the length of String
         */
        System.out.println(s1.length());
        /**
         * toLowerCase : Convert all words to lowercase
         */
        System.out.println(s1.toLowerCase());
        /**
         * toUpperCase : Convert all words to UPPERCASE
         */
        System.out.println(s1.toUpperCase());
        /**
         * equals : compare Strings
         * !!! note : dont use ' == ' for comparing two String ( reason in -----> Test3 )
         */
        if (s1.equals(s4))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
