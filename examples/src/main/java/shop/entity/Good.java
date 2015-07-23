package shop.entity;

public class Good extends SuperEntity {
    private String goodName;
    private String description;
    private double price;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String name) {
        this.goodName = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
