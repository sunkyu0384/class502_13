package exam01;

public class ex04 {
    public static void main(String[] args) {
        Transportation trans = Transportation.BUS;
        String str = trans.name(); // trans.toString()
        System.out.println(str);

        int ordinal = trans.ordinal(); // 상수의 위치 번호
        System.out.println(ordinal);
    }
}
