package Lab02;

import java.util.Comparator;

public class CompareMax {
    public static <T extends Comparable<T>>T maximum(T a, T b, T c){
        T max = a;
        if (b.compareTo(max)>0) max = b;
        if (c.compareTo(max)>0) max = c;
        return max;
    }

    public static void main(String[] args) {

        System.out.println(CompareMax.maximum(10,20,30));
    }
}
