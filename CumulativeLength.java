import java.util.*;
public class CumulativeLength{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        // StringBuilder array[] = new StringBuilder[size];
        
        
        /*System.out.println("Enter the values: ");
        for(int i=0; i<size; i++){
            array[i] = StringBuilder;*/
            
        /*StringBuilder sb = new StringBuilder("Hello");
            System.out.println(sb);   */   
            
        StringBuilder array[] = new StringBuilder[size];
        
        System.out.println("Enter ther values: ");
        
        for(int i=0 ; i<size; i++){
            array[i] = new StringBuilder(sc.next());
        }
        
        int totalLength = 0;
        for(int i=0; i<size; i++){
            totalLength += array[i].length();
        }
        
        System.out.println("Total length is: " + totalLength);
        sc.close();
    }
}