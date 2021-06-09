package Activity52.StudentManagement;

public class Student {
    //- Các thuộc tính:
    public String name;
    public float gpa;
    //- Các phương thức:
    //+ Khởi tạo, getters/setters.
    public Student(){}
    public Student(String name, float gpa){
        this.gpa=gpa;
        this.name=name;
    }
    public void setName(String input) {
        this.name = input;
    }
    public String getName() {
        return name;
    }
    public void setGpa(float input) {
        if(input<=4.0 && input>=0){
            this.gpa = input;
        }
    }
    public float getGpa() {
        return gpa;
    }
    //+ Kiểm tra đỗ/trượt (gpa >=1.5 thì đỗ, ngược lại thì trượt).
    public boolean passTest(){
        if(gpa>=1.5){
            return true;
        }else return false;
    }
    //+ In ra thông tin name, gpa.
   @Override
    public String toString(){
        return "Student{" + "Name = '" + name + "\'" + ", GPA = " + gpa + "}";
    }
}
