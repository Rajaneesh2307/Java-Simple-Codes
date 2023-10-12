import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the values of X and Y : ");
        int X = SC.nextInt();
        int Y = SC.nextInt();

        System.out.println("The addition of " + X + " and " + Y + " is : " + Addition(X, Y));
        System.out.println("The subtraction of " + X + " and " + Y + " is : " + Subtraction(X, Y));
        System.out.println("The multiplication of " + X + " and " + Y + " is : " + Multiplication(X, Y));
        System.out.println("The division of " + X + " and " + Y + " is : " + Division(X, Y));
        System.out.println("The modulus of " + X + " and " + Y + " is : " + Modulus(X, Y));
        System.out.println("The power of " + X + " and " + Y + " is : " + Power(X, Y));
    }
    public static int Addition(int X, int Y)
    {
        int Add;
        Add = X + Y;
        return Add;
    }
    public static int Subtraction(int X, int Y)
    {
        int Sub;
        Sub = X - Y;
        return Sub;
    }
    public static int Multiplication(int X, int Y)
    {
        int Mul;
        Mul = X * Y;
        return Mul;
    }

    public static double Division(int X, int Y)
    {
        double Div;
        Div = X / Y;
        return Div;
    }
    public static int Modulus(int X, int Y)
    {
        int Mod;
        Mod = X % Y;
        return Mod;
    }
    public static double Power(int X, int Y)
    {
        double Pow;
        Pow = Math.pow(X,Y);
        return Pow;
    }
}