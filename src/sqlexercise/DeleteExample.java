package sqlexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteExample {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:postgresql://localhost:5432/veritabani_adi";
        String kullaniciAdi = "postgres";
        String sifre = "root";

        try {
            Connection conn = DriverManager.getConnection(jdbcURL,kullaniciAdi,sifre);
            String deleteSQL = "DELETE FROM tablo_adi WHERE name = ?";
            PreparedStatement deleteStatement = conn.prepareStatement(deleteSQL);
            deleteStatement.setString(1, "Mustafa");
            int affectedRows = deleteStatement.executeUpdate();
            System.out.println("DELETE işlemi sonucunda etkilenen satır sayısı : " + affectedRows);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
