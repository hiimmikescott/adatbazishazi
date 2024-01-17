import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class memberList {
    public static ArrayList<FamilyMember> getFamilyMembers() {
        ArrayList<FamilyMember> memberList = new ArrayList<>();
        Connection conn = null;
        try {
            String url = "jdbc:mariadb://localhost:3306/family_tree";
            conn = DriverManager.getConnection(url, 
            "admin", "admin");
 
            String sql = "select * from employees";        
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                FamilyMember member = new FamilyMember(
                    rs.getString("name"),
                    rs.getInt("birth_date"),
                    rs.getString("birth_place"),
                    rs.getString("mother_name"),
                    rs.getString("father_name")
                    );
                memberList.add(member);
            }
        }catch(SQLException ex) {
            System.err.println("Hiba! Az SQL művelet sikertelen!");
            System.err.println(ex.getMessage());
        }
        return memberList;
    }
 
    public static void main(String[] args) {
        ArrayList<FamilyMember> familyList;
        familyList = getFamilyMembers();
        familyList.forEach(member -> {
            System.out.println(member.name);
        });
    }
}