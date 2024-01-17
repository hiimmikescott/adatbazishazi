public class FamilyMember {
    // változok
     String name;
     int birthDate;
     String birthPlace;
     String motherName;
     String fatherName;

    // Constructor
    public FamilyMember(String name, int birthDate, String birthPlace, String motherName, String fatherName) {
        this.name = name;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.motherName = motherName;
        this.fatherName = fatherName;
    }

    // Getter 
    public String getName() {
        return name;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    // Main method for testing
    public static void main(String[] args) {
        // családtag hozáadása
        // TODO saját családtag hozáadaása terminalbol
        FamilyMember member = new FamilyMember("Alice Smith", 1985, "Townsville", "Emily Brown", "John Smith");

        // Accessing and printing information
        System.out.println("Name: " + member.getName());
        System.out.println("Birth Date: " + member.getBirthDate());
        System.out.println("Birth Place: " + member.getBirthPlace());
        System.out.println("Mother's Name: " + member.getMotherName());
        System.out.println("Father's Name: " + member.getFatherName());
    }
}
