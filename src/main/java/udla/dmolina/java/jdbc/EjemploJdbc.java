package udla.dmolina.java.jdbc;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class EjemploJdbc {
    public static void main(String[] args) {
        String url = "jdbc:mysqL://localhost:3306/java_jdbc";
        String us = "root";
        String pw = "sasa";

        //establece la conexion
        try {
            Connection conn = DriverManager.getConnection(url, us, pw);
            Statement st = conn.createStatement();
            ResultSet resultado = st.executeQuery("select * from productos");
            while(resultado.next()){
                //el get. depende del tipo de dato
                System.out.println(resultado.getString("marca"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
