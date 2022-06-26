import java.util.*;
public class circumferenceFunction {
    public static void circumference(double r){
        double cir = 2 * 3.14 * r;
        System.out.println("Circumference : " + cir);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        circumference(r);
        sc.close();
    }
}
