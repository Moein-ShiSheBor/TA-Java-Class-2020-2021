public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
//        sb = "Hello";
        sb.append("Hello");
        System.out.println(sb);
        sb.append(" My name is Moein !");
        System.out.println(sb);
        sb.delete(6, 17);
        System.out.println(sb);
//        sb.deleteCharAt(sb.length());
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
        System.out.println(sb.indexOf("M"));
        System.out.println(sb.indexOf("Mo"));
        System.out.println(sb.indexOf("Moi"));
        sb.append(" , It's Make me Happy");
        System.out.println(sb.lastIndexOf("M"));
        sb.replace(0, sb.indexOf(",") + 2, "");
        System.out.println(sb);
        String str = "1. ";
        str += sb;
        System.out.println(str);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        sb.insert(0, "first ");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
    }
}
