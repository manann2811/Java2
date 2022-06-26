import java.util.*;
public class Array2d {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();

        int[][] array = new int[row][col];

        int mul = row * col;
        System.out.println("Enter " + mul + " values:");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix:");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
