package Activity52.StudentManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagement test = new StudentManagement();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        test.inputInfo(n);
        System.out.println("Tong so sinh vien do: "+test.count(true));

        System.out.println("Tong so sinh vien truot: "+test.count(false));

        System.out.println("Info student co diem GPA cao nhat: "+test.maxPoint());
        System.out.println("Info student co diem GPA thap nhat: "+ test.minPoint());
    }
}
