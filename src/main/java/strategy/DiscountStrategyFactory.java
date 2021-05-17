package strategy;

import java.util.HashMap;
import java.util.Map;

public class DiscountStrategyFactory {
    private static Map<OrderType, DiscountStrategy> discountStrategyMap = new HashMap<>();

    static {
        discountStrategyMap.put(OrderType.NORMAL, new NormalDiscountStrategy());
        discountStrategyMap.put(OrderType.GROUPON, new GrouponDiscountStrategy());
    }

    public static DiscountStrategy getDiscountStrategy(OrderType orderType) {
        return discountStrategyMap.get(orderType);
    }
}
