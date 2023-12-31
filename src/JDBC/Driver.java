package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Driver {
    public static void main(String[] args) throws Exception {
        //1.导入jar包
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3.获取数据库连接对象
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/example_db","root","123456");
        //4.定义sql语句
        String sql = "update account set balance = 500 where id =1";
        //5.获取执行sql的对象 Statement
        Statement stmt = (Statement) conn.createStatement();
        //6.执行sql
        int count = stmt.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放结果
        stmt.close();
        conn.close();
    }
}
