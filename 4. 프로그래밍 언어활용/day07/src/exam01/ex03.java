package exam01;

public class ex03 {
    public static void main(String[] args) {
        int num = 30;
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };
    }
}
