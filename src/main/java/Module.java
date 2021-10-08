import java.util.ArrayList;

public class Module {
    private String modName;
    private int modID;
    private ArrayList<Student> attendingStudents = new ArrayList<Student>();;
    private ArrayList<Course> associatedCourses = new ArrayList<Course>();;

    public Module(String modName, int modID){
        this.modName = modName;
        this.modID = modID;
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

    public void addStudentToModule(Student module){//adds student's module to their list
        attendingStudents.add(module);
    }

}
