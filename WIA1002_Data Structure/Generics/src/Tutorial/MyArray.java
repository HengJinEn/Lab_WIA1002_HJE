package Tutorial;

public class MyArray {
    public static void main(String[] args)
    {
        //list in reference type not in primitive
        Integer[] numbers = {1,2,3,4,5};
        String [] names = {"Jane", "Tom", "Bob"};
        Character [] character = {'a', 'b', 'c'};

        MyArray.<Integer>listAll(numbers);
        MyArray.<String>listAll(names);
        MyArray.<Character>listAll(character);

    }

    public static <E> void listAll(E[] list)
    {
        for (int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
