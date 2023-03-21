package Tutorial;

public class Duo <A, B>
{
    public A first;
    public B second;

    public Duo(A first, B second)
    {
        this.first = first;
        this.second = second;
    }

    public static void main(String[] args) {
        Duo<String, Integer> sideShape = new Duo<>("Hi", 456);
        Duo<Double, Double> points = new Duo<>(1.5, 4.6);
    }
}
