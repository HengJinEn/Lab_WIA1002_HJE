package Lab02;

public class StorePairGeneric<T extends Comparable<T>> implements Comparable<StorePairGeneric<T>>
{
    private T first, second;

    public StorePairGeneric(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "first = " + first + " second = " + second;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StorePairGeneric)) {
            return false;
        }
        StorePairGeneric<T> other = (StorePairGeneric<T>) obj;
        return this.first.equals(other.first);
    }

    @Override
    public int compareTo(StorePairGeneric<T> other)
    {
        return getFirst().compareTo(other.getSecond());
    }
}

class Tester {
    public static void main(String[] args) {
        StorePairGeneric<Integer> a = new StorePairGeneric<>(6, 4);
        StorePairGeneric<Integer> b = new StorePairGeneric<>(2, 2);
        StorePairGeneric<Integer> c = new StorePairGeneric<>(6, 3);

        System.out.println("Object 1: " + a.toString());
        System.out.println("Object 2: " + b.toString());
        System.out.println("Object 3: " + c.toString());
        System.out.println("Object 1 compare with Object 2 ? " + a.compareTo(b));
        System.out.println("Object 1 compare with Object 3 ? " + a.compareTo(c));
        System.out.println("Object 2 compare with Object 3 ? " + b.compareTo(c));
        System.out.println("Object 1 first value equals with Object 2 ? " + a.equals(b));
        System.out.println("Object 1 first value equals with Object 3 ? " + a.equals(c));
        System.out.println("Object 2 first value equals with Object 3 ? " + b.equals(c));
    }
}

