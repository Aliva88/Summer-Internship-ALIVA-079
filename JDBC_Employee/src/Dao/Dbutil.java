package Dao;

import Entity.Employee;

import java.sql.*;

public class Dbutil {
    private static String url = "jdbc:mysql://localhost:3306/employee_db";
    private static String user = "root";
    private static String password = "Aliva@2003";
    private static Connection connection = null;

    public static void connecToDb() {
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int insert(Employee employee) {
        String sql = "insert into employee values(?,?,?)";
        try {
            PreparedStatement prt = connection.prepareStatement(sql);
            prt.setInt(1, employee.getId());
            prt.setString(2, employee.getName());
            prt.setString(3, employee.getDepartment());
            return prt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void DisplayAll() {

        String sql = "select * from employee";
        try {
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " | " +
                                rs.getString(2) + " | " +
                                rs.getString(3)
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean deleteByid(int id) {

        try {
            PreparedStatement prt = connection.prepareStatement(
                    "delete from employee where id=?"
            );

            prt.setInt(1, id);

            if (prt.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int update(Employee emp) {

        String sql = "update employee set name=?, department=? where id=?";

        try {
            PreparedStatement prt = connection.prepareStatement(sql);

            prt.setString(1, emp.getName());
            prt.setString(2, emp.getDepartment());
            prt.setInt(3, emp.getId());

            return prt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getByid(int id) {

        connecToDb();

        try {

            PreparedStatement prt = connection.prepareStatement(
                    "select * from employee where id=?"
            );

            prt.setInt(1, id);

            ResultSet rt = prt.executeQuery();

            if (rt.next()) {
                System.out.println(
                        rt.getInt(1) + " | " +
                                rt.getString(2) + " | " +
                                rt.getString(3)
                );
            } else {
                System.out.println("Data not Exist");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}