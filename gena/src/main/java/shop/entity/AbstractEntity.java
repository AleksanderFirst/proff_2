package shop.entity;

import java.io.Serializable;

/**
 * Created by sigen on 7/19/2015.
 */
public abstract class AbstractEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
