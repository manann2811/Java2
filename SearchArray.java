import java.util.*;
public class SearchArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] array = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Enter the number to search: ");
        int x = sc.nextInt();

        int index_i = -1;
        int index_j = -1;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(x==array[i][j]){
                    index_i = i;
                    index_j = j;
                    System.out.println("The number is found at (" + index_i + ", " + index_j + ") index");
                }
            }
        }

        if(index_i == -1 && index_j == -1){
            System.out.println("Number is not found!");
        }
        sc.close();
    }    
}
