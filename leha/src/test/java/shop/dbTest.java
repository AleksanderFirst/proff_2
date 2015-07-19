package shop;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by oleksii on 18.07.2015.
 */
public class dbTest {

    @Test
    public void testInsert(){
        Client c = new Client();
        ClientDao cDao = new ClientDao();

        c.setFirstName("Karina");
        c.setLastName("Vasylenko");
        c.setEmail("old@ukr.net");

        cDao.insert(c);
        System.out.println("Email:" + c.getEmail() + " id:" + c.getId());

        cDao.select(c);
        System.out.println("Email:" + c.getEmail() + " id:" + c.getId());

        c.setEmail("new@ukr.net");
        cDao.update(c);
        System.out.println("Email:" + c.getEmail() + " id:" + c.getId());

        cDao.delete(c);
        System.out.println("Email:" + c.getEmail() + " id:" + c.getId());
    }


}
