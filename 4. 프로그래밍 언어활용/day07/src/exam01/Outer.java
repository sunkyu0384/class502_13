package exam01;

public class Outer {

    private Calculator cal2 = new Calculator() {
        @Override
        public int add(int num1, int num2) {
            return num1 + num2;
        }
    };

    public Calculator method() {
        return new Calculator() {
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };

    }
}