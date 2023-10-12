import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the Student Marks : ");
        int Marks = SC.nextInt();

        if (Marks < 0 || Marks > 100)
        {
            System.out.println("Invalid.");
        }
        else if (Marks < 50)
        {
            System.out.println("Grade is F");
        }
        else if (Marks >= 50 && Marks < 60)
        {
            System.out.println("Grade is D");
        }
        else if (Marks >= 60 && Marks < 70)
        {
            System.out.println("Grade is C");
        }
        else if (Marks >= 70 && Marks < 80)
        {
            System.out.println("Grade is B");
        }
        else if (Marks >= 80 && Marks < 90)
        {
            System.out.println("Grade is A");
        }
        else
        {
            System.out.println("Grade is A+");
        }
        SC.close();
    }
}