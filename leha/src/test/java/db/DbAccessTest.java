package db;

import org.junit.Test;

/**
 * Created by AVasilenko on 13.07.2015.
 */


public class DbAccessTest {

    @Test
    public void execSqlTest(){
        DbAccess db = new DbAccess();
        db.execSql("SELECT * FROM users");
    }
}
