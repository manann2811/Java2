import java.util.*;
public class Sorted {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the values: ");
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        
        System.out.print("Array is: ");
        for(int i=0; i<size; i++){
            System.out.print(array[i] + " ");
        }

        boolean inAscending = true;
        for(int i=0; i<size-1; i++){
            if(array[i+1] < array[i]){
                inAscending = false;
            }
        }

        System.out.println();
        if(inAscending){
            System.out.println("Array is sorted in ascending order");
        }
        else{
            System.out.println("Array is not sorted in ascending order");
        }
        sc.close();
    }    
}
