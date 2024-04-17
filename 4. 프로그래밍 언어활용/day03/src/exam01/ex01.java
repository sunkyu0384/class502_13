package exam01;

public class ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();

        Schedule _this = s1.returnThis();
        System.out.println(_this == s1); //this 주소 값과 s1 주소 값 같음

        s1.setYear(2024);
        s1.setMonth(2);
        s1.setDay(31);

        s1.showDate();

    }
}
