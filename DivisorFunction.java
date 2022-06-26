import java.util.*;
public class DivisorFunction {
    public static void commonDivisor(int a, int b){
          int hcf = 0;
          for(int i=1; i<=a || i<=b; i++){
              if(a%i==0 && b%i==0){
                  hcf = i;
              }
            }
            System.out.println("Greatest Common Divisor : " + hcf);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        commonDivisor(a, b);
        sc.close();
    }    
}
