package Lab02;

public class FindMax {

    static class Circle implements Comparable<Circle>
    {
        private double radius;

        public Circle(double radius){
            this.radius = radius;
        }

        public double getRadius(){
            return radius;
        }

        @Override
        public int compareTo(Circle other){
            if(radius < other.getRadius())
                return -1;
            else if(radius == other.getRadius())
                return 0;
            else
                return 1;
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3};
        String[] strArray = {"red", "green", "blue"};
        Circle[] object = {new Circle(3), new Circle(2.9), new Circle(5.9)};

        System.out.println(FindMax.max(intArray));
        System.out.println(FindMax.max(strArray));
        System.out.println(FindMax.max(object).getRadius());
    }

    public static <E extends Comparable<E>> E max(E[] list){
        E maxValue = list[0];
        for (int i = 0; i < list.length; i++)
        {
            if (list[i].compareTo(maxValue)>0)
            {
                maxValue = list[i];
            }
        }
        return maxValue;
    }

}
