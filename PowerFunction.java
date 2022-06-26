import java.util.*;
public class PowerFunction {
    public static void power(int x, int n){
        int mul=1;
        for(int i=1; i<=n; i++){
            mul = mul * x;
        }
        System.out.println(mul);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        power(x, n);
        sc.close();
    }    
}




