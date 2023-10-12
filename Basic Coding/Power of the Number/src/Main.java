import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the Base Value : ");
        Double Base = SC.nextDouble();
        System.out.println("Enter the Exponent Value : ");
        int Exponent = SC.nextInt();
        //Double Exponent = SC.nextDouble();

        //System.out.println("The Power of the Value is : " + Math.pow(Base, Exponent));


        double Result = 1;
        //double i = 1;
        //while (i <= Exponent)
        //{
        //    Result = Result * Base;
        //    i++;
        //}
        //System.out.println("The Power of the Value is : " + Result);

        for (int i = 1; i <= Exponent; i++)
        {
            Result = Result * Base;
        }
        System.out.println("The Power of the Value is : " + Result);
    }
}