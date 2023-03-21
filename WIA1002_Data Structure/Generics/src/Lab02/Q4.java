package Lab02;

public class Q4{
    public static <T extends  Comparable<T>> String minmax(T [] arr){
        T minValue = arr[0];
        T maxValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(minValue)<0)
            {
                minValue=arr[i];
            }

            if (arr[i].compareTo(maxValue)>0)
            {
                maxValue =arr[i] ;
            }
        }

        return "Min = " + minValue + "\nMax = " + maxValue;

    }

    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};

        System.out.println(Q4.minmax(intArray));
        System.out.println(Q4.minmax(strArray));

    }

}
