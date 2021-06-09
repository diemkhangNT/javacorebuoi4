package Activity52.StudentManagement.cach2;

import java.util.Scanner;

public class Maintest {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        System.out.println("So sinh vien do: "+studentManagement.demSVDo());
        System.out.println("So sinh vien truot: "+studentManagement.demSVTruot());
//        Student sv = new Student();
//        Student maxSV = studentManagement.timSVmaxGPA();
//        Student minSV = studentManagement.timSVminGPA();
        System.out.print("Sinh vien co diem GPA cao nhat: ");
        studentManagement.timSVmaxGPA().printInfo();
        System.out.print("Sinh vien co diem GPA thap nhat: ");
        studentManagement.timSVminGPA().printInfo();
    }
}
