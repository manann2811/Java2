import java.util.*;
public class SpiralMatrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = sc.nextInt();

        int[][] array = new int[n][m];


        int mul = n * m;
        System.out.println("Enter " + mul + " values:");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Matrix:");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Matrix in Spiral order:");

        int rowstart = 0;
        int rowend = n-1;
        int colstart = 0;
        int colend = m-1;
        
        // eg. 
        // n=5
        // m=5
        //Loop1
        // int rowstart = 0;
        // int rowend = 4;
        // int colstart = 0;
        // int colend = 4;

        //Loop2
        // int rowstart = 1;
        // int rowend = 3;
        // int colstart = 1;
        // int colend = 3;
        
        while(rowstart <= rowend && colstart <=colend){
        //1
        for(int col=colstart; col<=colend; col++){
            System.out.print(array[rowstart][col]+" ");
        }
        rowstart++;

        //Loop1
        // int rowstart = 1;
        // int rowend = 4;
        // int colstart = 0;
        // int colend = 4;

        //Loop2
        // int rowstart = 2;
        // int rowend = 3;
        // int colstart = 1;
        // int colend = 3;

        //2
        for(int row=rowstart; row<=rowend; row++){
            System.out.print(array[row][colend]+" ");
        }
        colend--;

        //Loop1
        // int rowstart = 1;
        // int rowend = 4;
        // int colstart = 0;
        // int colend = 3;

        //Loop2
        // int rowstart = 2;
        // int rowend = 3;
        // int colstart = 1;
        // int colend = 2;

        //3
        for(int col=colend; col>=colstart; col--){
            System.out.print(array[rowend][col]+" ");
        }
        rowend--;

        //Loop1
        // int rowstart = 1;
        // int rowend = 3;
        // int colstart = 0;
        // int colend = 3;

        //Loop2
        // int rowstart = 2;
        // int rowend = 2;
        // int colstart = 1;
        // int colend = 2;

        //4
        for(int row=rowend; row>=rowstart; row--){
            System.out.print(array[row][colstart]+" ");
        }
        colstart++;

        //Loop1
        // int rowstart = 1;
        // int rowend = 3;
        // int colstart = 1;
        // int colend = 3;

        //Loop2
        // int rowstart = 2;
        // int rowend = 2;
        // int colstart = 2;
        // int colend = 2;
        }
        sc.close();
    }
}
