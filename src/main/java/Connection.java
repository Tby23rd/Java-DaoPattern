import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

    public java.sql.Connection Connection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        java.sql.Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/inventory", "root", "");
        return con1;
    }

}
