import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter The Size of Array: ");
        int n = SC.nextInt();

        int Array[] = new int[n];
        System.out.print("Enter the elements into Array: ");

        for (int i = 0; i < n; i++)
        {
            Array[i] = SC.nextInt();
        }

        System.out.print("Array Elements are: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(Array[i] + " ");
        }
    }
}