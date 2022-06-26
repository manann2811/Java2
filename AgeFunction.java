import java.util.*;
public class AgeFunction {
    public static void vote(int age){
        if(age>=18){
            System.out.println("Person is eligible to Vote");
        }
        else{
            System.out.println("Person is not eligible to Vote");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        vote(age);
        sc.close();
    }
}
