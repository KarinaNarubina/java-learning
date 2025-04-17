package lv.acodemy;

public class ThirdLessonPartTwo {
    public static void main(String[] args) {

        int summa = add( 10, 30);
        System.out.println(summa);

        System.out.println(add( 20, 10));

        greet("Karina");

        int add = add( 20 , 30, 40);
        System.out.println();

        maxFromArray()
    }

    public static int add(int a, int b) {
        int result = a + b;
        return a + b;
    }

    public static int maxFromArray(int...numbers) {

    }

    // Method overloading

    public static int add (int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    public static void greet(String name) {
        System.out.println("Hello," + name + "!");
    }
}
