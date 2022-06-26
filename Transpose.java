import java.util.*;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();
        

        int[][] array = new int[row][col];
        System.out.print("Enter the values: ");
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

        int[][] transpose = new int[col][row];
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                transpose[i][j] = array[j][i];
            }
        }
        System.out.println();
        System.out.println("Transpose:");
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
