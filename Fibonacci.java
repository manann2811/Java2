import java.util.*;
public class Fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int n1 = 0;
        int n2 = 1;

        if(n==0){
            System.out.println("Not a valid number");
        }
        else if(n==1){
            System.out.print(n1 + " ");
        }
        else{
        System.out.print(n1 + " ");
        System.out.print(n2 + " ");
        for(int i=1; i<=n-2; i++){
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3; 
            System.out.print(n3 + " ");
        }    
        }
        sc.close();
    }
}

//Fibonacci
// 0 1 1 2 3 5 8 13 21

