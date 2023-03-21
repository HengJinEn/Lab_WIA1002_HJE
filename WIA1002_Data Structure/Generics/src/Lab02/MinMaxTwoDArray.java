package Lab02;

public class MinMaxTwoDArray <E extends Comparable<E>> implements Comparable<MinMaxTwoDArray<E>>
{
    private E item;

    public MinMaxTwoDArray(E item) {
        this.item = item;
    }

    public MinMaxTwoDArray() {

    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public static <E extends Comparable<E>> E min(E[][] list)
    {
        E minValue = list[0][0];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j].compareTo(minValue)<0)
                {
                    minValue = list[i][j];
                }
            }
        }

        return minValue;
    }

    public static <E extends Comparable<E>> E max(E[][] list)
    {
        E maxValue = list[0][0];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j].compareTo(maxValue)>0)
                {
                    maxValue = list[i][j];
                }
            }
        }

        return maxValue;
    }

    public int compareTo(MinMaxTwoDArray<E> o) {
        return item.compareTo(o.getItem());
    }

    public static void main(String[] args) {
        Integer[][] elements = {{4,5,6},{1,2,3}};
        MinMaxTwoDArray<Integer> obj = new MinMaxTwoDArray<>();
        System.out.println(obj.<Integer>min(elements));
        System.out.println(obj.<Integer>max(elements));
    }

}
