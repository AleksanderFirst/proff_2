package shop.entity;

import java.io.Serializable;

/**
 * Created by Антон on 18.07.2015.
 */
public class GoodOrder implements Serializable{
    private int id;
    private int client_id;
    private int good_id;
    private int good_qty;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public int getGood_id() {
        return good_id;
    }

    public void setGood_id(int good_id) {
        this.good_id = good_id;
    }

    public int getGood_qty() {
        return good_qty;
    }

    public void setGood_qty(int good_qty) {
        this.good_qty = good_qty;
    }
}
