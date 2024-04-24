package exam01;

public class ex01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Calculator cal = outer.method();
        int result = cal.add(10, 20);

        System.out.println(result);
    }
}