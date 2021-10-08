import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String name;
    private int age;
    private Date DOB;
    private int ID;
    private String username;
    private ArrayList<Course> courses = new ArrayList<Course>();
    private ArrayList<Module> modules = new ArrayList<Module>();

    public Student(String name, int age, Date DOB, int ID){
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
        this.username = getUsername();
    }

    public String getUsername(){//generates username for student
        String username = (name.replace(" ","")).concat(String.valueOf(ID));
        return username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void addCourseToStudent(Course course){//adds student's course to their list
        courses.add(course);
    }

    public void addModuleToStudent(Module module){//adds student's module to their list
        modules.add(module);
    }
}