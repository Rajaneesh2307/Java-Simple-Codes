public class Main {
    public static void main(String[] args)
    {
        Integer a = 2;
        Integer b = 3;
        Add(a,b);
        System.out.println("Result from Main : " + (a + b));
    }
    public static void Add(Integer a, Integer b)
    {
        a = 10;
        System.out.println("Result from Method : " + (a + b));
    }
}