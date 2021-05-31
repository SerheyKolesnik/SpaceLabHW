package SpaseLab.simple_iunit;

import java.sql.SQLException;

public class dbTestExcel {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, SQLException {
        conn.Conn();
        //conn.clearUsers();
        conn.incertFromExcel();

    }
}
