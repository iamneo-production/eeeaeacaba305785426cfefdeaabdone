public class Student {
    private int studentId;
    private String firstName;
    private String lastName;

    public Student(int studentId,String firstName,String lastName){
        this.studentId = studentId;
        
    }


    public void setstudentId(String studentId){
        this.studentId = studentId;
    }

    public void setfirstName(String firstName){
        this.firstName = firstName;
    }

    public void setlastName(String lastName){
        this.lastName = lastName;
    }

    public String getstudentId(){
        return studentId;
    }
    public String getfirstName(){
        return firstName;
    }
    public String getlastName(){
        return lastName;
    }
}
