package Activity52.StudentManagement.cach2;

public class Student {
    private String name;
    private float gpa;

    public Student(){}
    public Student(String name, float gpa){
        this.gpa = gpa;
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean checkGPA(){
        if(gpa>=1.5){
            return true;
        }else
            return false;
    }
    public void printInfo(){
        System.out.println("Student: '"+name+"' has GPA = "+gpa);
    }

//    public String toString(){
//        return "Student{ Name: '"+name+"', GPA = "+gpa+" }";
//        }
}
