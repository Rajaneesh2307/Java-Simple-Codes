import java.util.Scanner;
class LearnCoding {
    public static void main(String[] args)
    {
        Scanner SC = new Scanner(System.in);

        System.out.print("Enter the Range: ");
        int Low = SC.nextInt();
        int High = SC.nextInt();

        for(int i = Low; i <= High; i++)
        {
            if(i%5==0)
                continue;

            System.out.print(i + " ");
        }
    }
}