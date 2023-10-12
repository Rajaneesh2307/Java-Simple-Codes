import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the Value : ");
        Double Value = SC.nextDouble();

        System.out.println(Math.round(Value));
        System.out.println(Math.floor(Value));
        System.out.println(Math.ceil(Value));
    }
}