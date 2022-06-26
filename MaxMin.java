import java.util.*;
public class MaxMin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the values: ");
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<size; i++){
            if(array[i] > max){
            max = array[i];
            }
        }

        for(int i=0; i<size; i++){
            if(array[i] < min){
            min = array[i];
            }
        }
        System.out.println("The maximum value is : " + max);
        System.out.println("The minimum value is : " + min);
        sc.close();
    }
}
