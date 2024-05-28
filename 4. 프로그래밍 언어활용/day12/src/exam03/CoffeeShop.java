package exam03;

public interface CoffeeShop {
    CoffeeShop enter(Person person);
    CoffeeShop order();
    void exit();
    int getTotalSalePrice();
    String getName();

    static void showSaleSummary(CoffeeShop shop)
    {
        System.out.printf("%s의 총 매출액은 %d 원입니다.%n", shop.getName(), shop.getTotalSalePrice());
    }
}
