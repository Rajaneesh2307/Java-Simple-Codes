import java.util.Scanner;
class LearnCoding {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Range: ");
        int Low = sc.nextInt();
        int High = sc.nextInt();

        int i = Low;
        while (i <= High)
        //for(int i = Low; i<=high; i++)
        {
            System.out.print(i + " ");

            if(i%13==0)
                break;
            i++;
        }
    }
}