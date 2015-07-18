package shop.entity;

import java.io.Serializable;

/**
 * Created by Антон on 18.07.2015.
 */
public class Warehouse implements Serializable{
    private int id;
    private int supplier_id;
    private int good_id;
    private int good_qty;

    public void setId(int id) {
        this.id = id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }

    public void setGood_id(int good_id) {
        this.good_id = good_id;
    }

    public void setGood_qty(int good_qty) {
        this.good_qty = good_qty;
    }

    public int getId() {
        return id;
    }

    public int getSupplier_id() {
        return supplier_id;
    }

    public int getGood_id() {
        return good_id;
    }

    public int getGood_qty() {
        return good_qty;
    }
}
