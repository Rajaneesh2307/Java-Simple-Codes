import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int Num1 = SC.nextInt();
        System.out.println("Enter the Second Number : ");
        int Num2 = SC.nextInt();

        //if (Num1 > Num2)
        //{
        //    System.out.println(Num1 + " is Greater than " + Num2);
        //}
        //else if (Num2 > Num1)
        //{
        //    System.out.println(Num2 + " is Greater than " + Num1);
        //}
        //else
        //{
        //    System.out.println("Both are Equal..");
        //}

        if (Num1 == Num2)
        {
            System.out.println("Both are Equal..");
        }
        else
        {
            int Greater = (Num1 > Num2) ? Num1 : Num2;
            System.out.println(Greater + " is the Largest Number..");
        }
    }
}