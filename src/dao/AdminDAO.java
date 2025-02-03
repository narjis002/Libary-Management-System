package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminDAO {

    public boolean isValidAdmin(Admin admin) {
        String sql = "select* password from admin where admin_id = ? and password = ?";

        try (Connection conn = Dbconnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, admin.getUsername());
            ps.setString(2, admin.getPassword());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {  // Checks if a result was returned
                if (rs.getString(1).equals(admin.getUsername()) && rs.getString(2).equals(admin.getPassword())) {
                    return true;
                }
            }

            // If no match found, return false
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}
