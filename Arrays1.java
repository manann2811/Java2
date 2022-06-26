import java.util.*;
public class Arrays1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter the values: ");
        for(int i=0; i<n; i++){
            marks[i] = sc.nextInt();
        }

        System.out.println("Printing the marks");
        for(int i=0; i<n; i++){
            System.out.println(marks[i]);
        }
        sc.close();
    }
}
