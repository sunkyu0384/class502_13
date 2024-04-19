package exam02;

public class C extends B {
    int numC = 30;

    public C() {
        super(); // B 클래스에 생성된 B();
        System.out.println("C 생성자");
    }
}
