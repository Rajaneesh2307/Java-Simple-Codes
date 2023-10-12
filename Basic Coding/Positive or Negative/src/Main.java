import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int Number = SC.nextInt();

        //if (Number > 0)
        //{
        //    System.out.println("The Given Number is Positive..");
        //}
        //else if (Number < 0)
        //{
        //    System.out.println("The Given Number is Negative..");
        //}
        //else
        //{
        //    System.out.println("The Given Number is Zero..");
        //}

        //if (Number >= 0)
        //{
        //    if (Number == 0)
        //    {
        //        System.out.println("The Given Number is Zero..");
        //    }
        //    else
        //    {
        //        System.out.println("The Given Number is Positive..");
        //    }
        //}
        //else
        //{
        //    System.out.println("The Given Number is Negative..");
        //}

        //Ternary operator
        if (Number == 0)
        {
            System.out.println("The Given Number is Zero..");
        }
        else
        {
           String Result = Number > 0 ? "The Given Number is Positive.." : "The Given Number is Negative..";
           System.out.println(Result);
        }
        SC.close();
    }
}