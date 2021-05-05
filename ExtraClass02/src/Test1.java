public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        String str = "Java";
        System.out.println(str);
        /**
         * \t : move cursor 4 step forward
         */
        System.out.println(str + "\t" + str);
        /**
         * \b : move cursor one step back
         */
        System.out.println(str + "\b" + "A");
        System.out.println(str + "\b\b\b" + "00");
        /**
         * \t : move cursor to te first of the line
         */
        System.out.println(str + "\r" + "ABC");

        System.out.println(str);
        Thread.sleep(1000);
        System.out.println("\r" + "ABC");
    }
    /**
     *  !!! note  :  \r , \b will work correctly just in CMD
     */


    /**
     * cleaning command line
     */
    public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
