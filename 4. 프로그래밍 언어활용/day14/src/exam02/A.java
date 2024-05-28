package exam02;

public class A {
    public int sum(int a, int b) {
        System.out.println("메소드 1 호출됨"); // int형 매개변수 2개
        return a + b;
    }
    public int sum(int a, int b, int c) {
        System.out.println("메소드 2 호출됨"); // int형 매개변수 3개
        return a + b + c;
    }
    public int sum(int a, int b, double c) {
        System.out.println("메소드 3 호출됨"); // int형 매개변수 2개 + double형 매개변수 1개
        return a + b + (int)c;
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.sum(1, 2)); // 메소드 호출
        System.out.println(a.sum(1, 2, 3)); // 메소드 호출
        System.out.println(a.sum(1, 2, 3.3)); // 메소드 호출
    }
}



