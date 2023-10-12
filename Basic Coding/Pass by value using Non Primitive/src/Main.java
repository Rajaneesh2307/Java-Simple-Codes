public class Main {
    public static void main(String[] args)
    {
        Integer[] array = new Integer[2];
        array[0] = 2;
        array[1] = 3;
        Add(array);
        System.out.println("Result from Main : " + (array[0] + array[1]));
    }
    public static void Add(Integer[] array)
    {
        array[0] = 10;
        System.out.println("Result from Method : " + (array[0] + array[1]));
    }
}