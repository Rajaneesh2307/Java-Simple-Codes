import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        int Option = SC.nextInt();

        switch (Option)
        {
            case 1:
                System.out.println("Option 1 is Selected.");
                break;
            case 2:
                System.out.println("Option 2 is Selected.");
                break;
            case 3:
                System.out.println("Option 3 is Selected.");
                break;
            case 4:
                System.out.println("Option 4 is Selected.");
                break;
            default:
                System.out.println("Invalid.");
                break;
        }
    }
}