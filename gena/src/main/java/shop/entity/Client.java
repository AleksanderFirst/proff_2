package shop.entity;

import java.io.Serializable;

/**
 * Created by sigen on 7/16/2015.
 */
public class Client extends AbstractEntity{
    private String fitstName;
    private String secondName;
    private String email;


    public String getFitstName() {
        return fitstName;
    }

    public void setFirstName(String fitstName) {
        this.fitstName = fitstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
