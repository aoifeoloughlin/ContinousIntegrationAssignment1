import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class TestStudent {
    Student s1 = new Student("Harry Williams", 21, new Date(2000, 01,01), 12343);
    Course c1 = new Course(39482, "Computer Science", new DateTime("2020-09-01"),  new DateTime("2021-05-31"));
    Module m1 = new Module("Software Engineering", 772);

    @Test
    @DisplayName("Get the username of the student")
    public void testUserName(){
        s1.getUsername();
    }

    @Test
    @DisplayName("Add Course to a Student")
    public void testAddCourseToStudent(){
        s1.addCourseToStudent(c1);
    }

    @Test
    @DisplayName("Add Module to a Student")
    public void testAddModuleToStudent(){
        s1.addModuleToStudent(m1);
    }

    @Test
    @DisplayName("Add Student to a module")
    public void testAddStudentToModule(){
        m1.addStudentToModule(s1);
    }

    @Test
    @DisplayName("Add course to a module")
    public void testAddCourseToModule(){
        m1.addCourseToModule(c1);
    }

    @Test
    @DisplayName("Add Student to a course")
    public void testAddStudentToCourse(){
        s1.addCourseToStudent(c1);
    }

    @Test
    @DisplayName("Add module to a course")
    public void testAddModuleToCourse(){
        c1.addModuleToCourse(m1);
    }
}
