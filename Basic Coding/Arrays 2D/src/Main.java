import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter No.of Rows: ");
        int n = SC.nextInt();
        System.out.print("Enter No.of Columns: ");
        int m = SC.nextInt();
        
        int Array[][] = new int[n][m];
        System.out.print("Enter the Elements into 2D Array: ");
        
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                Array[i][j] = SC.nextInt();
            }
        }

        System.out.println("2D Array Elements are: ");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println();
        }
    }
}