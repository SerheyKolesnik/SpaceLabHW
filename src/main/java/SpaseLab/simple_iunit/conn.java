package SpaseLab.simple_iunit;

import java.sql.*;

public class conn {
    public static Connection conn;
    public static Statement statmt;
    public static ResultSet resSet;

    // --------ПОДКЛЮЧЕНИЕ К БАЗЕ ДАННЫХ--------
    public static void Conn() throws ClassNotFoundException, SQLException {
        conn = null;
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Sergey\\IdeaProjects\\SpaceLabEducation\\src\\main\\resources\\SQLiteTest.db");

        System.out.println("База Подключена!");
    }

    // --------Создание таблицы--------
    public static void CreateDB() throws ClassNotFoundException, SQLException {
        statmt = conn.createStatement();
        statmt.execute("CREATE TABLE if not exists 'users' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'name' text, 'phone' INT);");

        System.out.println("Таблица создана или уже существует.");
    }

    // --------Заполнение таблицы--------
    public static void WriteDB() throws SQLException {
        statmt.execute("INSERT INTO 'users' ('name', 'phone') VALUES ('Petya', 125453); ");
        statmt.execute("INSERT INTO 'users' ('name', 'phone') VALUES ('Vasya', 321789); ");
        statmt.execute("INSERT INTO 'users' ('name', 'phone') VALUES ('Masha', 456123); ");

        System.out.println("Таблица заполнена");
    }

    // -------- Вывод таблицы--------
    public static void ReadDB() throws ClassNotFoundException, SQLException {
        resSet = statmt.executeQuery("SELECT * FROM users");

        while (resSet.next()) {
            int id = resSet.getInt("id");
            String name = resSet.getString("name");
            String phone = resSet.getString("phone");
            System.out.println("ID = " + id);
            System.out.println("name = " + name);
            System.out.println("phone = " + phone);
            System.out.println();
        }

        System.out.println("Таблица выведена");
    }

    public static void clearUsers() throws ClassNotFoundException, SQLException {
        Statement statmt;
        statmt = conn.createStatement();
        statmt.execute("DELETE FROM users; ");
        //statmt.execute("SELECT * FROM users; ");
        System.out.println("Таблица users очищена");
    }

    public static void incertFromExcel() throws ClassNotFoundException, SQLException {
        Statement statmt;
        statmt = conn.createStatement();
        statmt.execute("INCERT INTO 'users'('name', 'phone') SELECT 'name', 'phone' FROM OPENROWSET ('Microsoft.ACE.OLEDB.12.0','Excel 12.0 Xml;HDR=YES;Database=C:\\Users\\Sergey\\IdeaProjects\\SpaceLabEducation\\src\\main\\resources\\dbExcel.xlsx', SELECT 'name','phone' FROM [users$B:C]);");
        //"'Microsoft.ACE.OLEDB.12.0','Excel 12.0 Xml;HDR=YES;Database=C:\\Users\\Sergey\\IdeaProjects\\SpaceLabEducation\\src\\main\\resources\\dbExcel.xlsx','SELECT * FROM [Employees$]'"
        System.out.println("Данные из ДБ Ексель импортированы");
    }

    // --------Закрытие--------
    public static void CloseDB() throws ClassNotFoundException, SQLException {
        conn.close();
        statmt.close();
        resSet.close();

        System.out.println("Соединения закрыты");
    }
}
