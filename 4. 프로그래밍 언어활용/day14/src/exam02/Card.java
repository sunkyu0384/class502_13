package exam02;

public class Card {
    private static int nextCardNumber = 1000;
    private int cardNumber;

    public Card() {
        cardNumber = nextCardNumber++;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void printCardInfo() {
        System.out.println("카드 번호: " + cardNumber);
    }
}