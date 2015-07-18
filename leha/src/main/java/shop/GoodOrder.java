package shop;

/**
 * Created by oleksii on 18.07.2015.
 */
public class GoodOrder {
    private int id;
    private int clientId;
    private int goodId;
    private int goodQty;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public int getGoodQty() {
        return goodQty;
    }

    public void setGoodQty(int goodQty) {
        this.goodQty = goodQty;
    }
}
