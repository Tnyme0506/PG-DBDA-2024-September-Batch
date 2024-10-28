import java.sql.*;
import java.util.Scanner;

class sql_methods{
    static Scanner sc = new Scanner(System.in);
    Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/companydb";
        String user = "root";
        String password = "MyNewPass";
        Connection conn =  DriverManager.getConnection(url,user,password);
        System.out.println("Connection Established Successfully");
        return conn;
    }
    void Display_all_rows(Connection conn) throws SQLException {
        Statement s = conn.createStatement();
        String query = "Select * from employee";
        ResultSet rs = s.executeQuery(query);
        while (rs.next()){
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String desig = rs.getString(3);
            float sal = rs.getFloat(4);
            String dept = rs.getString(5);
            System.out.println( "ID:" + id +
                    " | Name:" + name +
                    " | Designation: " + desig +
                    " | Salary: " + sal +
                    " | Department: " + dept);
        }
        rs.close();
        s.close();
    }
    void Insert_row(Connection conn) throws SQLException {
        String insert_query = "Insert Into employee (employeeName,designation,salary,department) Values (?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(insert_query);
        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Designation: ");
        String designation = sc.nextLine();
        System.out.println("Enter Salary: ");
        float sal = sc.nextFloat();
        System.out.println("Enter Department Name: ");
        String dept = sc.next();
        ps.setString(1,name);
        ps.setString(2,designation);
        ps.setFloat(3,sal);
        ps.setString(4,dept);
        int num = ps.executeUpdate();
        System.out.println("Number of Rows Inserted: " + num);
        ps.close();
    }
    void Update_table(Connection conn) throws SQLException {
        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();
        PreparedStatement ps = null;
        String update_query;
        System.out.println("""
                Select the Field to Update\
                
                1. Employee Name\
                
                2. Employee Designation\
                
                3. Employee Salary\
                
                4. Employee Department""");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice){
            case 1:
                update_query = "Update employee set employeeName = ? where employeeID = ?";
                System.out.println("Enter New Employee Name:");
                String name = sc.nextLine();
                ps = conn.prepareStatement(update_query);
                ps.setString(1,name);
                ps.setInt(2,id);
                break;
            case 2:
                update_query = "Update employee set designation = ? where employeeID = ?";
                System.out.println("Enter New Employee Designation:");
                String designation = sc.nextLine();
                ps = conn.prepareStatement(update_query);
                ps.setString(1,designation);
                ps.setInt(2,id);
                break;
            case 3:
                update_query = "Update employee set salary = ? where employeeID = ?";
                System.out.println("Enter Employee New Salary");
                float sal = sc.nextFloat();
                ps = conn.prepareStatement(update_query);
                ps.setFloat(1,sal);
                ps.setInt(2,id);
                break;
            case 4:
                update_query = "Update employee set department = ? where employeeID = ?";
                System.out.println("Enter New Employee Department:");
                String department = sc.nextLine();
                ps = conn.prepareStatement(update_query);
                ps.setString(1,department);
                ps.setInt(2,id);
                break;
            default:
                System.out.println("Incorrect Option");
                break;
        }

        assert ps != null;
        int num = ps.executeUpdate();
        System.out.println("Number of Rows Updated: " + num);
        ps.close();
    }
    void Delete_row(Connection conn) throws SQLException {
        String del_query = "Delete from employee where employeeID = ?";
        PreparedStatement ps = conn.prepareStatement(del_query);
        System.out.println("Enter ID of Employee to delete: ");
        int id = sc.nextInt();
        ps.setInt(1,id);
        int num = ps.executeUpdate();
        System.out.println("Number of Rows Inserted: " + num);
        ps.close();
    }
    void Avg_sal(Connection conn) throws SQLException {
        System.out.println("Enter Department Name: ");
        String dept = sc.next();
        String avg_query = "select avg(salary) from employee where department = ?";
        PreparedStatement ps = conn.prepareStatement(avg_query);
        ps.setString(1,dept);
        ResultSet rs = ps.executeQuery();
        rs.next();
        float avg_sal = rs.getFloat(1);
        System.out.println("Average Salary of "+ dept + "is : "+avg_sal);
        rs.close();
        ps.close();
    }
    void Menu(Connection conn) throws SQLException {
        int choice;
        do {
            System.out.println("""
                Select an Action\
                
                1. Display all Rows\
                
                2. Insert a Row\
                
                3. Update a Row\
                
                4. Delete a Row\
                
                5. Average Salary\
                
                6. EXIT""");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    Display_all_rows(conn);
                    break;
                case 2:
                    Insert_row(conn);
                    break;
                case 3:
                    Update_table(conn);
                    break;
                case 4:
                    Delete_row(conn);
                    break;
                case 5:
                    Avg_sal(conn);
                    break;
                case 6:
                    break;
            }

        }while(choice!=6);
    }


}
public class Connection_mysql
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        sql_methods sm = new sql_methods();
        Connection conn;
        conn = sm.connect();
        sm.Menu(conn);
        conn.close();
    }
}
