package strategy;

public class Order {
    private OrderType type;

    Order(OrderType type) {
        this.type = type;
    }

    public OrderType getType() {
        return type;
    }
}
