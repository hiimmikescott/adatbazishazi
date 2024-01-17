import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


class addMemberApp {
    public static void insertMember(FamilyMember FamilyMember) {
        Connection conn = null;
        try {
            // csatlakozas az adatbazishoz
            String url = "jdbc:mariadb://localhost:3306/family_tree";
            conn = DriverManager.getConnection(url, 
            "admin", "admin");
            // sql parancs adása az adat bazisnak
            String sql = "INSERT INTO family_members" + 
            "(name, birth_date, birth_place, mother_name, father_name) VALUES" +
                " (?, ?, ?, ?)";        
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, FamilyMember.name);
            pstmt.setInt(2, FamilyMember.birthDate);
            pstmt.setString(3, FamilyMember.birthPlace);
            pstmt.setString(4, FamilyMember.motherName);
            pstmt.setString(5, FamilyMember.fatherName);
            
            int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Family member inserted successfully!");
                } else {
                    System.out.println("Failed to insert family member.");
                }
            
 
 
        }catch(SQLException ex) {
            System.err.println("Hiba! Az SQL művelet sikertelen!");
            System.err.println(ex.getMessage());
        }
    }
}
