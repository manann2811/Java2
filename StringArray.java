import java.util.*;
public class StringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int size = sc.nextInt();

        String[] array = new String[size];

        System.out.println("Enter the values:");
        for(int i=0; i<size; i++){
            array[i] = sc.next();
        }

        System.out.println("\nList:");
        for(int i=0; i<size; i++){
            System.out.print(array[i]+" ");
        }

        int total_length = 0;
        for(int i=0; i<size; i++){
            total_length += array[i].length();
        }
    
        System.out.print("\n\nThe cumulative length of all the Strings is: " + total_length);
        sc.close();
    }
}
