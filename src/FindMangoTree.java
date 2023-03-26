import java.util.Scanner;

public class FindMangoTree {

    public static String isMangoTree(int row , int col , int treenumber)
    {
        int count = 1;

        // Creating 2D array [ garden ]

        int[][] a = new int[row][col];
        System.out.println("The Garden: ");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                a[i][j] = count++; // Initialize Array
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        //checking if given tree number is present in 1st row , 1st col , last col

        String res = null;
        for(int i = 0; i < row ; i++)
        {
            if (a[i][0] == treenumber || a[i][col - 1] == treenumber || a[0][i] == treenumber) {
                res = "Yes";
                break;
            }
            else{
                res = "No";
            }

        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter the no of cols: ");
        int col = scanner.nextInt();
        System.out.print("Enter the tree Number: ");
        int mango_tree = scanner.nextInt();
        String isMango = isMangoTree(row,col,mango_tree);
        System.out.println(isMango);
    }
}
