import org.joda.time.DateTime;
import javax.print.attribute.standard.JobSheets;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.w3c.dom.ls.LSOutput;

public class Course {
    private String courseName;
    private ArrayList<Module> associatedModules;
    private int courseID;
    private ArrayList<Student> registeredStudents = new ArrayList<Student>();;
    private DateTime startDate;
    private DateTime endDate;

    public Course(int courseID, String courseName, DateTime startDate, DateTime endDate){
        this.courseID = courseID;
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.associatedModules = new ArrayList<Module>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public void addModuleToCourse(Module module){//adds student's module to their list
        associatedModules.add(module);
    }

    public ArrayList<Module> printCourseModules(){
        associatedModules.forEach(module -> System.out.println("Course: "+getCourseName()+" Course ID: "+getCourseID()+" " +
                "Module: ID: "+module.getModID()+" Name: "+module.getModName()+"\n"));
        return associatedModules;
    }

    public void addStudentToCourse(Student student){//adds student's course to their list
        registeredStudents.add(student);
    }

    public ArrayList<Student> printCourseStudents(){
        registeredStudents.forEach(student -> System.out.println("Course: "+getCourseName()+" Course ID: "+getCourseID()+" Student: ID: "+student.getID()+" Name: "+student.getName()+" " +
                "Username: "+student.getUsername()+" DOB: "+student.getDOB()+" Age: "+student.getAge()+"\n"));
        return registeredStudents;
    }
}
