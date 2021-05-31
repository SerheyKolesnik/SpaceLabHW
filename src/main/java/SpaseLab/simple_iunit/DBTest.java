package SpaseLab.simple_iunit;

import java.sql.SQLException;

public class DBTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, SQLException {
        conn.Conn();
        conn.CreateDB();
        conn.WriteDB();
        conn.ReadDB();
        conn.CloseDB();
    }
}
