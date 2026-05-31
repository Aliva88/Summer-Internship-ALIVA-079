package Dao;

import Entity.Book;

import java.sql.*;

public class Dbutil {

    private static String url = "jdbc:mysql://localhost:3306/book_db";
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

    public int insert(Book book) {

        String sql = "insert into bookdata values(?,?,?)";

        try {

            PreparedStatement prt = connection.prepareStatement(sql);

            prt.setInt(1, book.getId());
            prt.setString(2, book.getName());
            prt.setString(3, book.getSubject());

            return prt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void DisplayAll() {

        String sql = "select * from bookdata";

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

            PreparedStatement prt =
                    connection.prepareStatement(
                            "delete from bookdata where id=?"
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

    public int update(Book book) {

        String sql =
                "update bookdata set name=?, subject=? where id=?";

        try {

            PreparedStatement prt =
                    connection.prepareStatement(sql);

            prt.setString(1, book.getName());
            prt.setString(2, book.getSubject());
            prt.setInt(3, book.getId());

            return prt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getByid(int id) {

        connecToDb();

        try {

            PreparedStatement prt =
                    connection.prepareStatement(
                            "select * from bookdata where id=?"
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