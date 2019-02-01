package Chapter11;
import java.util.ArrayList;
public class Exercise_05 {
    public static void main(String[] args){
        Course course1 = new Course("Computer Science");
        Course course2 = new Course("History");
        course1.addStudent("maximus young");
        course1.addStudent("doubi");
        course2.addStudent("david jones");
        course2.addStudent("golden hair lion kong");
        System.out.println("number of students studying course1:" + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.println(students[i] + ", ");
        System.out.println("number of students studying course2:" + course2.getNumberOfStudents());
        students = course2.getStudents();
        for(int i = 0;i < course2.getNumberOfStudents();i++)
            System.out.println(students[i] + ", ");
    }
}
class Course{
    private String courseName;
    ArrayList<String> students = new ArrayList<>();
    public Course(String courseName){
        this.courseName = courseName;
    }
    public void addStudent(String student){
        students.add(student);
    }
    public String[] getStudents(){
        String[] temp = new String[students.size()];
        for(int i = 0;i < temp.length;i++)
            temp[i] = (String) students.get(i);
        return temp;
    }
    public int getNumberOfStudents(){
        return students.size();
    }
    public String getCourseName(){
        return courseName;
    }
}
