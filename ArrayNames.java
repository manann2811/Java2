import java.util.*;
public class ArrayNames {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int size = sc.nextInt();

        String array[] = new String[size];

        System.out.println("Enter the names:");
        for(int i=0; i<size; i++){
            array[i] = sc.next();
        }
        System.out.println();
        System.out.println("The names are as follows:");
        for(int i=0; i<size; i++){
            System.out.println(array[i]);
        }
        sc.close();
    }
}
