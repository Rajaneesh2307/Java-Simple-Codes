import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the Value : ");
        int Value = SC.nextInt();
        Table(Value);
    }
    public static void Table(int Value)
    {
        //for (int i = 1; i <=10; i++)
        //{
        //    int Mul = Value * i;
        //    System.out.println(Value + " * " + i + " = " + Mul);
        //}

        int i = 1;
        while (i <= 10)
        {
            int Mul = Value * i;
            System.out.println(Value + " * " + i + " = " + Mul);
            i++;
        }
    }
}