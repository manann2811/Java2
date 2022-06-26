import java.util.*;
public class ArraySearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the values: ");
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Array: ");
        for(int i=0; i<size; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.print("Enter the number to search: ");
        int x = sc.nextInt();

        //Linear Search
        int pos=-1;
        for(int i=0; i<size; i++){
            if(x==array[i]){
                pos = i;
            }
        }

        if(pos==-1){
            System.out.println("Number is not present in the array");
        }
        else{
        System.err.print("Number is present at the index: ");
        System.out.println(pos);
        }
        sc.close();
    }
}
