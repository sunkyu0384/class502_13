package exam04;

public class ex01 {
    public static void main(String[] args) {
        Box appleBox = new Box();
        appleBox.setItem(new Apple());

        Apple apple = (Apple)appleBox.getItem(); // 형변환 번거로움
        System.out.println(apple.get());

        Box grapeBox = new Box();
        grapeBox.setItem(new Grape());

       // if (grapeBox.getItem() instanceof Apple) { // 타입 안정성 떨어짐
        Apple grape = (Apple)grapeBox.getItem();
        System.out.println(grape.get());
    }
}
