import java.util.Scanner;
import java.sql.*;

class Opration {

    int Eid;
    String Ename;
    int Eage;

    String url = "jdbc:postgresql://localhost:5432/Employee";
    String uname = "postgres";
    String pass = "VKDB";

    Connection con = DriverManager.getConnection(url,uname,pass);

    Statement st = con.createStatement();

    Opration() throws SQLException {
    }

    public void insert(int id,String name,int age) throws SQLException {

        Eid = id;
        Ename = name;
        Eage = age;

        String sql = "insert into employee values (" + Eid + ",'" + Ename + "'," + Eage + ")";
        st.execute(sql);
    }

    public void showrd(int idx) throws SQLException {
        String sql = "select * from employee where eid=" + idx + " ";
        ResultSet rs = st.executeQuery(sql);
        rs.next();

        int id = rs.getInt("eid");
        String name = rs.getString("ename");
        int age = rs.getInt("eage");

        System.out.println("Employee ID is: " + id);
        System.out.println("Employee Name is: " + name);
        System.out.println("Employee Age is: " + age);

    }

    public void showAll() throws SQLException {
        String sql = "select * from employee;";
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            System.out.println("Employee ID is: " + rs.getInt(1));
            System.out.println("Employee Name is: " + rs.getString(2));
            System.out.println("Employee Age is: " + rs.getInt(3));
        }

    }

    public void delete(int id) throws SQLException {
        String sql = "delete from employee where eid=" + id + " ";
        st.execute(sql);
    }
}

public class Menu {
    public static void main(String[] args) throws SQLException {



        Scanner s = new Scanner(System.in);
        int num;

        do {
            System.out.println("-------Menu-------");
            System.out.println("1.Insert Eelement");
            System.out.println("2.Show Eelement");
            System.out.println("3.Show All Eelement");
            System.out.println("4.Delete Eelement");
            System.out.println("5.Exit");

            System.out.print("Enter a Opration to Parform :");
            num = s.nextInt();

            Opration op = new Opration();

            switch (num) {
                case 1:
                    System.out.print("Enter a Employee ID :");
                    int id = s.nextInt();
                    System.out.print("Enter a Employee Name :");
                    String name = s.next();
                    System.out.print("Enter a Employee Age :");
                    int age = s.nextInt();

                    op.insert(id,name,age);

                    System.out.println("Recored inserted");
                    break;

                case 2:
                    System.out.print("Enter a Employee ID to show : ");
                    int idsh = s.nextInt();
                    op.showrd(idsh);
                    break;

                case 3:
                    op.showAll();
                    break;

                case 4:
                    System.out.print("Enter a Employee ID you want to delete :");
                    int iddel = s.nextInt();
                    op.delete(iddel);
                    System.out.println("Recored Deleted");
                    break;

                case 5:
                    System.out.println("bye...See you soon...!");
                    return;

                default:
                    System.out.println("Invalid number.");
            }
        } while (num != 5);



        String sql = "insert into employee values (,,)";





    }
}