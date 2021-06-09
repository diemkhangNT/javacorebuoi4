package Activity52.StudentManagement;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class StudentManagement{
    //- Các thuộc tính
    //+ Tổng số sinh viên n.
    private int n;
    //+ Danh sách sinh viên (Student[] students).
    private Student students[];
    //- Các phương thức:
    //+ Nhập vào thông tin từng sinh viên khi khởi tạo lớp.
    public void inputInfo(int n){
        this.n = n;
        students = new Student[n];
        Scanner input = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.println("Info student "+(i+1));
            System.out.print("+ Name: ");
            String name = input.nextLine();
            System.out.print("+ GPA: ");
            float gpa = input.nextFloat();
            input.nextLine();
            students[i] = new Student(name,gpa);
        }
    }
    // Đếm
    public  int count(boolean check){
        int count = 0;
        for(int i=0;i<n;i++){
            if(check){
                count += (students[i].passTest() ? 1 :0); // tổng số sinh viên đỗ.
            }else count += (students[i].passTest() ? 0: 1);// tổng số sinh viên trượt.
        }
        return count;
    }
    //+ Tìm sinh viên có điểm gpa cao nhất.
    public Student maxPoint(){
        Student maxpoint = students[0];
        if (n < 1) {
            return null;
        }
        for(int i=0;i<n;i++){
            if(students[i].getGpa() > maxpoint.getGpa()){
                maxpoint = students[i];
            }
        }
        return maxpoint;
    }
    //+ Tìm sinh viên có điểm gpa thấp nhất.

    public Student minPoint(){
        Student minpoint = students[0];
        if (n < 1) {
            return null;
        }
        for(int i=0;i<n;i++){
            if(students[i].getGpa() < minpoint.getGpa()){
                minpoint = students[i];
            }
        }
        return minpoint;
    }
}
