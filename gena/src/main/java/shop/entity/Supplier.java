package shop.entity;

import java.io.Serializable;

/**
 * Created by sigen on 7/16/2015.
 */
public class Supplier extends AbstractEntity{
    private String name;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
