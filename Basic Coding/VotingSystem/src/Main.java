import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the Age of Voter : ");
        int Age = SC.nextInt();

        //Ternary Operator
        String Voting = Age >= 18 ? "Candidate is eligible for Voting.." : "Candidate is not eligible for Voting..";
        System.out.println(Voting);


        //if (Age >= 18)
        //{
        //    System.out.println("Candidate is eligible for Voting..");
        //}
        //else
        //{
        //    System.out.println("Candidate is not eligible for Voting..");
        //}
        SC.close();
    }
}