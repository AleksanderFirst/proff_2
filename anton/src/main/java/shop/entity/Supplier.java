package shop.entity;

import java.io.Serializable;

/**
 * Created by Антон on 18.07.2015.
 */
public class Supplier implements Serializable{
    private int id;
    private String supplier_name;
    private String phone;

    public void setId(int id) {
        this.id = id;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {

        return id;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public String getPhone() {
        return phone;
    }
}
