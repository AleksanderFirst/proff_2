package shop.entity;

import java.io.Serializable;

/**
 * Created by sigen on 7/16/2015.
 */
public class Warehouse extends AbstractEntity{
    private Long goodId;
    private Long supllierId;
    private long qty;

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    public Long getSupllierId() {
        return supllierId;
    }

    public void setSupllierId(Long supllierId) {
        this.supllierId = supllierId;
    }

    public long getQty() {
        return qty;
    }

    public void setQty(long qty) {
        this.qty = qty;
    }
}
