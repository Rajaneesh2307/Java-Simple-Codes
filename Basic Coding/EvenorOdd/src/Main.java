import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int Number = SC.nextInt();

        //if (Number % 2 == 0)
        //{
        //    System.out.println(Number + " is Even.");
        //}
        //else
        //{
        //    System.out.println(Number + " is Odd");
        //}

        //Ternary Operator
        String Result = (Number % 2 == 0) ? "Even" : "Odd";
        System.out.println(Number + " is " + Result);

        SC.close();
    }
}