package strategy;

public enum OrderType {
    NORMAL(0, "normal"),
    GROUPON(1, "group");

    private int type;
    private String description;

    OrderType(int type, String description) {
        this.type = type;
        this.description = description;
    }

    public OrderType valueOf(int type) {
        switch (type) {
            case 0:
                return NORMAL;
            case 1:
                return GROUPON;
            default:
                throw new RuntimeException("order type illegal");
        }
    }

    public String getDescription() {
        return description;
    }
}
