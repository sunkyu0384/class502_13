package exam03;

public class ex02 {
    public static void main(String[] args) {
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(10);
        System.out.printf("num1 주소: %d%n", System.identityHashCode(num1));
        System.out.printf("sum2 주소: %d%n", System.identityHashCode(num2));

    }
}
