import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int Num1 = SC.nextInt();
        System.out.println("Enter the Second Number : ");
        int Num2 = SC.nextInt();
        System.out.println("Enter the Third Number : ");
        int Num3 = SC.nextInt();

        //if ((Num1 > Num2) && (Num1 > Num3))
        //{
        //    System.out.println(Num1 + " is Greater than " + Num2 + " " + Num3);
        //}
        //else if ((Num2 > Num3) && (Num2 > Num1))
        //{
        //    System.out.println(Num2 + " is Greater than " + Num1 + " " + Num3);
        //}
        //else
        //{
        //    System.out.println(Num3 + " is Greater than " + Num1 + " " + Num2);
        //}

        int Result = (Num1 > Num2) ? Num1 : Num2;
        int Temp = (Result > Num3) ? Result : Num3;
        System.out.println(Temp + " is the Largest Number..");
    }
}