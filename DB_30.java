import java.sql.*;

public class DB_30 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
            import package
            load and register
            create connection
            create statement
            execute statement
            process the results
            close
         */

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String uname = "postgres";
        String pass = "VKDB";

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(url,uname,pass);

        System.out.println("Database connected");
    }
}
