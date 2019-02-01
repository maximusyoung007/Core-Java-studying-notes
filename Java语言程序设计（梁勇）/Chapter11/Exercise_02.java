package Chapter11;
public class Exercise_02 {
    public static void main(String[] args){
        Person person = new Person("yang","big bridge road","18552454859","yang@qq.com");
        System.out.println(person.toString());
        Student student = new Student();
        System.out.println(student.toString());
        Staff staff = new Staff();
        System.out.println(staff.toString());
    }
}
class Person{
    protected String name,address,telNumber,email;
    Person(){ }
    Person(String name,String address,String telNumber,String email){
        this.name = name;
        this.address = address;
        this.telNumber = telNumber;
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getTelNumber(){
        return telNumber;
    }
    public void setTelNumber(String telNumber){
        this.telNumber = telNumber;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String toString(){
        return "Name:" + name + "\nAddress:" + address + "\ntelNumber:"
                + telNumber + "\nemail:" + email;
    }
}
class Student extends Person{
    public static int FRESHMAN = 1;
    public static int SOPHOMORE = 2;
    public static int JUNIOR = 3;
    public static int SECIOR = 4;
    protected int status;
    public Student(){
        super();
        status = 0;
    }
    public Student(String name,String address,String telNumber,String email,int status){
        super(name, address, telNumber, email);
        this.status = status;
    }
    public int getStatus(){
        return status;
    }
    public void setStatus(int status){
        this.status = status;
    }
    public String toString(){
        return super.toString() + "\nStatus:" + status;
    }
}
class Employee extends Person{
    protected String office;
    protected int salary;
    public Employee(){}
    public Employee(String name,String address,String telNumber,String email,String office,int salary){
        super(name, address, telNumber, email);
        this.office = office;
        this.salary = salary;
    }
    public String getOffice(){
        return office;
    }
    public void setOffice(String office){
        this.office = office;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public String toString(){
        return super.toString() + "\nOffice:" + office + "\nSalary:" + salary;
    }
}
class Faculty extends Employee{
    private String time,level;
    public Faculty(){ }
    public Faculty(String name,String address,String telNumber,String email,String office,int salary,String time,String level){
        super(name, address, telNumber, email, office, salary);
        this.time = time;
        this.level = level;
    }
    public String getTime(){
        return time;
    }
    public void setTime(){
        this.time = time;
    }
    public String getLevel(){
        return level;
    }
    public void setLevel(){
        this.level = level;
    }
    public String toString(){
        return super.toString() + "\ntime:" + time + "\nlevel:" + level;
    }
}
class Staff extends Employee{
    private String title;
    public Staff(){}
    public Staff(String name,String address,String telNumber,String email,String office,int salary,String title){
        super(name, address, telNumber, email, office, salary);
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String toString(){
        return super.toString() + "\nTitle:" + title;
    }
}
