import java.util.ArrayList;

public class Module {
    private String modName;
    private int modID;
    private ArrayList<Student> attendingStudents;
    private ArrayList<Course> associatedCourses;

    public Module(String modName, int modID){
        this.modName = modName;
        this.modID = modID;
        this.associatedCourses = new ArrayList<Course>();
        this.attendingStudents = new ArrayList<Student>();
    }

    public String getModName() {
        return modName;
    }

    public void setModName(String modName) {
        this.modName = modName;
    }

    public int getModID() {
        return modID;
    }

    public void setModID(int modID) {
        this.modID = modID;
    }

    public void addCourseToModule(Course course){//adds student's course to their list
        associatedCourses.add(course);
    }

    public void addStudentToModule(Student student){//adds student's module to their list
        attendingStudents.add(student);
    }

    public ArrayList<Student> printModuleStudents(){
        attendingStudents.forEach(student -> System.out.println("Module: "+getModName()+" ID: "+getModID()+" Student: ID: "+student.getID()+" Name: "+student.getName()+" " +
                "Username: "+student.getUsername()+" DOB: "+student.getDOB()+" Age: "+student.getAge()+"\n"));
        return attendingStudents;
    }

    public ArrayList<Course> printModuleCourses(){
        associatedCourses.forEach(course -> System.out.println("Moudule: "+getModName()+" ID: "+getModID()+" Course: ID:"+course.getCourseID()+
                " Name:"+ course.getCourseName()+" Start Date:"+course.getStartDate()+" End Date: "+ course.getEndDate()+"\n"));
        return associatedCourses;
    }

}
