//1)
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
//        2)
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String uname = "postgres";
        String pass = "VKDB";

//        String sql = "select sname from student where sid = 1";
//        String sql = "select * from student";
//        String sql = "insert into student values (6,'chaitali',55)";
//        String sql = "update student set sname='raj' where sid=6";
        String sql = "delete from student where sid=6";

        Class.forName("org.postgresql.Driver");

//        3)
        Connection con = DriverManager.getConnection(url,uname,pass);

        System.out.println("Database connected");

//        4)
        Statement st = con.createStatement();

//        5)
//        ResultSet rs = st.executeQuery(sql); // 'executeQuery()' is use to execute the query and return something.

//        6)
//        System.out.println(rs.next()); // it's give the result is true or

        // print particular row(data)
//        rs.next(); // it's gone to the first row
//        String name = rs.getString("sname"); // it's give the fatch the Name of the student
//        System.out.println("Name of the Student is : " + name);

        // print all recored
        // change the sql query to select
//        while (rs.next()) {
//            System.out.print(rs.getInt(1) + " - ");
//            System.out.print(rs.getString(2) + " - ");
//            System.out.println(rs.getInt(3));
//        }

        // Insert data
        // change che a query to insert
        st.execute(sql); // 'execute()' is use to execute the query.
        System.out.println("Query Executed");

        // Update data
        // change che a query to update
        // execute the same as insert

        // Delete data
        // change che a query to Delete
        // execute the same as insert

//        7)
        con.close();
        System.out.println("Connection Colse");
    }
}
