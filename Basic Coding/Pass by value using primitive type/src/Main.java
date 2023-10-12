public class Main {
    public static void main(String[] args)
    {
        int a = 2;
        int b = 3;
        Add(a,b);
        System.out.println("Result from Main : " + (a + b));
    }
    public static void Add(int a, int b)
    {
        a = 10;
        System.out.println("Result from Method : " + (a + b));
    }
}