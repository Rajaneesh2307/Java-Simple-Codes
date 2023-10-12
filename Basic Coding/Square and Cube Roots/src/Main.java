import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the value of X : ");
        int X = SC.nextInt();
        System.out.print("Enter the value of Y : ");
        int Y = SC.nextInt();

        System.out.println("The Square Root of " + X + " is : " + SquareRoot(X));
        System.out.println("The Cube Root of " + Y + " is : " + CubeRoot(Y));
    }
    public static Double SquareRoot(int X)
    {
        Double sqrt;
        sqrt = Math.sqrt(X);
        return sqrt;
    }
    public static Double CubeRoot(int Y)
    {
        Double cbrt;
        cbrt = Math.cbrt(Y);
        return cbrt;
    }
}