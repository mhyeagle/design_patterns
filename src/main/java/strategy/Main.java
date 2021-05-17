package strategy;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(OrderType.GROUPON);
        DiscountStrategy discountStrategy = DiscountStrategyFactory.getDiscountStrategy(order1.getType());
        System.out.println(order1.getType().getDescription() + " discount value:" + discountStrategy.calDiscount(order1));
    }
}
