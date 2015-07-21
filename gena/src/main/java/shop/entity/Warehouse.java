package shop.entity;

import java.io.Serializable;

/**
 * Created by sigen on 7/16/2015.
 */
public class Warehouse extends AbstractEntity{
    private int goodId;
    private int supllierId;
    private long qty;

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public int getSupllierId() {
        return supllierId;
    }

    public void setSupllierId(int supllierId) {
        this.supllierId = supllierId;
    }

    public long getQty() {
        return qty;
    }

    public void setQty(long qty) {
        this.qty = qty;
    }
}
