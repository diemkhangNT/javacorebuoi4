package Activity52.StudentManagement.cach2;

import java.util.Scanner;

public class StudentManagement {
    private int n;
    private Student[] students;

    public  StudentManagement(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so sinh vien: ");
        int n = input.nextInt();
        input.nextLine();
        students = new Student[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhap Info Sinh vien thu "+(i+1));
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("GPA = ");
            float gpa = input.nextFloat();
            input.nextLine();
            // Gán 2 giá trị vào mảng
            students[i] = new Student();
            students[i].setName(name);
            students[i].setGpa(gpa);
            // Cách 2
            /*Student sv = new Student();
            sv.setName(name);
            sv.setGpa(gpa);
            students[i] = sv;*/
        }
    }
    public int demSVDo(){
        int count = 0;
        for(Student st : students){
            boolean check = st.checkGPA();
            if(check){
                count++;
            }
        }
        return count;
    }
    public int demSVTruot(){
        int count =0;
        for(Student st : students){
            boolean check = st.checkGPA();
            if(!check){
                count++;
            }
        }
        return count;
    }
    public Student timSVmaxGPA(){
        Student maxGPA = students[0];
        for(Student st : students){
            if(maxGPA.getGpa() < st.getGpa()){
                maxGPA = st;
            }
        }
        return maxGPA;
    }
    public Student timSVminGPA(){
        Student minGPA = students[0];
        for(Student st : students){
            if(minGPA.getGpa() > st.getGpa()){
                minGPA = st;
            }
        }
        return minGPA;
    }
}
