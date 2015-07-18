package shop.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Антон on 18.07.2015.
 */
public class Good implements Serializable{
    private int id;
    private String good_name;
    private String description;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGood_name() {
        return good_name;
    }

    public void setGood_name(String good_name) {
        this.good_name = good_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private BigDecimal price;
}
