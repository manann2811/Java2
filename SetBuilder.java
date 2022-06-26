// import java.util.*;
public class SetBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //chat at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //insert at char 0
        sb.insert(0, 'S');
        System.out.println(sb);

        sb.insert(2, 'n');
        System.out.println(sb);

        //delete char
        sb.delete(2, 4/*exclusive)/*/);
        System.out.println(sb);

        sb.delete(1, sb.length());
        System.out.println(sb);

        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");

        System.out.println(sb);
    }
}
