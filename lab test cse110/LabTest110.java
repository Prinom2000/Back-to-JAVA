
package lab.test.pkg110;

import java.util.ArrayList;

class Student {
    private int sId;
    private String sName;
    private String sCountry;

    // Constructor
    public Student(int sId, String sName, String sCountry) {
        this.sId = sId;
        this.sName = sName;
        this.sCountry = sCountry;
    }

    // Getters and Setters
    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsCountry() {
        return sCountry;
    }

    public void setsCountry(String sCountry) {
        this.sCountry = sCountry;
    }

    // Display method
    public void display() {
        System.out.println("Student ID: " + sId);
        System.out.println("Name: " + sName);
        System.out.println("Country: " + sCountry);
    }
}

class University {
    private int uId;
    private int uRank;
    private String uName;
    private ArrayList<Student> studentList;
    private String VC;
    private int numberOfStudents;

    // Constructor
    public University(int uId, int uRank, String uName, String VC) {
        this.uId = uId;
        this.uRank = uRank;
        this.uName = uName;
        this.VC = VC;
        this.studentList = new ArrayList<>();
        this.numberOfStudents = 0;
    }

    // Getters and Setters
    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public int getuRank() {
        return uRank;
    }

    public void setuRank(int uRank) {
        this.uRank = uRank;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getVC() {
        return VC;
    }

    public void setVC(String VC) {
        this.VC = VC;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    // Display method
    public void display() {
        System.out.println("University ID: " + uId);
        System.out.println("University Name: " + uName);
        System.out.println("Rank: " + uRank);
        System.out.println("Vice Chancellor: " + VC);
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Student List:");
        for (int i = 0; i < studentList.size(); i++) {
            studentList.get(i).display();
        }
    }

    // Add student method
    public void addStudent(Student student) {
        studentList.add(student);
        numberOfStudents++;
    }

    // Drop student method
    public void dropStudent(int sId) {
        for (Student student : studentList) {
            if (student.getsId() == sId) {
                studentList.remove(student);
                numberOfStudents--;
                break;
            }
        }
    }
}


public class LabTest110 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student student1 = new Student(1, "Alice", "USA");
        Student student2 = new Student(2, "Bob", "UK");
        Student student3 = new Student(3, "Charlie", "Canada");

        // Creating university objects
        University university1 = new University(101, 5, "ABC University", "Dr. XYZ");
        University university2 = new University(102, 10, "XYZ University", "Prof. ABC");

        // Adding students to universities
        university1.addStudent(student1);
        university1.addStudent(student2);
        university2.addStudent(student3);

        // Displaying university details
        System.out.println("University 1 Details:");
        university1.display();
        System.out.println("\nUniversity 2 Details:");
        university2.display();

        // Dropping a student from a university
        university1.dropStudent(1);

        // Displaying university details after dropping a student
        System.out.println("\nUniversity 1 Details after dropping a student:");
        university1.display();
        
    }
    
}
