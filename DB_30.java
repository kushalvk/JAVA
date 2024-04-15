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

        String sql = "select sname from student where sid = 1";

        Class.forName("org.postgresql.Driver"); // optional

//        3)
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Database connected");

//        4)
        Statement st = con.createStatement();

//        5)
        ResultSet rs = st.executeQuery(sql); // 'executeQuery()' is use to execute the query and return something.

//        6)
        System.out.println(rs.next()); // it's give the result is true or
        rs.next(); // it's gone to the first row

        String name = rs.getString("sname"); // it's give the fatch the Name of the student
        System.out.println("Name of the Student is : " + name);

//        7)
        con.close();
        System.out.println("Connection Colse");

        // print particular row(data)
//        String url = "jdbc:postgresql://localhost:5432/postgres";
//        String uname = "postgres";
//        String pass = "VKDB";
//        String sql = "select sname from student where sid = 1";
//
//        Connection con = DriverManager.getConnection(url,uname,pass);
//        System.out.println("Database connected");
//
//        Statement st = con.createStatement();
//
//        ResultSet rs = st.executeQuery(sql); // 'executeQuery()' is use to execute the query and return something.
//        rs.next(); // it's gone to the first row
//
//        String name = rs.getString("sname"); // it's give the fatch the Name of the student
//        System.out.println("Name of the Student is : " + name);
//        con.close();
//        System.out.println("Connection Colse");

        // print all recored
//        String url = "jdbc:postgresql://localhost:5432/postgres";
//        String uname = "postgres";
//        String pass = "VKDB";
//        String sql = "select * from student";
//
//        Connection con = DriverManager.getConnection(url,uname,pass);
//        System.out.println("Database connected");
//
//        Statement st = con.createStatement();
//
//        ResultSet rs = st.executeQuery(sql); // 'executeQuery()' is use to execute the query and return something.
//        while (rs.next()) {
//            System.out.print(rs.getInt(1) + " - ");
//            System.out.print(rs.getString(2) + " - ");
//            System.out.println(rs.getInt(3));
//        }
//        con.close();
//        System.out.println("Connection Colse");

        // Insert data
//        String url = "jdbc:postgresql://localhost:5432/postgres";
//        String uname = "postgres";
//        String pass = "VKDB";
//        String sql = "insert into student values (8,'denish',30)";
//
//        Connection con = DriverManager.getConnection(url,uname,pass);
//        System.out.println("Database connected");
//
//        Statement st = con.createStatement();
//
//        st.execute(sql); // 'execute()' is use to execute the query.
//        System.out.println("Record Inserted");
//        con.close();
//        System.out.println("Connection Colse");

        // Update data
//        String url = "jdbc:postgresql://localhost:5432/postgres";
//        String uname = "postgres";
//        String pass = "VKDB";
//        String sql = "update student set sname='abhi' where sid=8";
//
//        Connection con = DriverManager.getConnection(url,uname,pass);
//        System.out.println("Database connected");
//
//        Statement st = con.createStatement();
//
//        st.execute(sql); // 'execute()' is use to execute the query.
//        System.out.println("Record Updated");
//        con.close();
//        System.out.println("Connection Colse");

        // Delete data
//        String url = "jdbc:postgresql://localhost:5432/postgres";
//        String uname = "postgres";
//        String pass = "VKDB";
//        String sql = "delete from student where sid=8";
//
//        Connection con = DriverManager.getConnection(url,uname,pass);
//        System.out.println("Database connected");
//
//        Statement st = con.createStatement();
//
//        st.execute(sql); // 'execute()' is use to execute the query.
//        System.out.println("Record Deleted");
//        con.close();
//        System.out.println("Connection Colse");

        // prepared Statment
//        int sid = 8;
//        String sname = "denish";
//        int marks = 35;
//
//        String url = "jdbc:postgresql://localhost:5432/postgres";
//        String uname = "postgres";
//        String pass = "VKDB";
//
////        String sql = "insert into student values (" + sid + ",'" + sname + "'," + marks + ")"; // Canvart this to prepar Statment
//        String sql = "insert into student values (?,?,?)"; // prepared Statment
//
//        Connection con = DriverManager.getConnection(url,uname,pass);
//
//        System.out.println("Database connected");
//
//        PreparedStatement st1 = con.prepareStatement(sql); // Prepared Statment
//        st1.setInt(1,sid);
//        st1.setString(2,sname);
//        st1.setInt(3,marks);
//
//        st1.execute(); // Prepared Statment
//        System.out.println("Recored Inserted by Prepared Statment");
//        con.close();
//        System.out.println("Connection Colse");

    }
}
