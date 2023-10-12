import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int Number = SC.nextInt();
        int i = 1;

        //for (int i = 1; i <= 5; i++)
        //{
        //    System.out.print(i + " ");
        //}

        //while (i <= Number)
        //{
        //    System.out.print(i + " ");
        //    i++;
        //}

        do
        {
            System.out.print(i + " ");
            i++;
        }
        while (i <= Number);
        SC.close();
    }
}