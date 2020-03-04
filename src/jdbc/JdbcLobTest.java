package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcLobTest {
    public static void main(String[] args) {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC",
                    "root", "lipeng19931112");
            PreparedStatement ps = con.prepareStatement("insert into tb_user values (default , ?, ?)");
            ps.setString(1, "李鹏");
            try(InputStream is = new FileInputStream("test.jpg")) {
                ps.setBinaryStream(2, is);
                System.out.println(ps.executeUpdate() == 1 ? "插入成功" : "插入失败");
            } catch (IOException e){
                System.out.println("读取照片失败！");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null && !con.isClosed()){
                    con.close();
                    con = null;     // 指示垃圾回收器可以回收该对象
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
