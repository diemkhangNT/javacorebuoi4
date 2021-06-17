package Activity53.program.QuestionandAnswer;

import Activity52.StudentManagement.cach2.Student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
         Question[] questions;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so cau hoi: ");
        int n = input.nextInt();
        input.nextLine();
        questions = new Question[n];
        // Thiết lập câu hỏi, độ khó, câu trả lời đúng
        for(int i=0;i<n;i++){
            System.out.println("- Nhap cau hoi "+(i+1)+": ");
            String content = input.nextLine();
            System.out.print("  + Do kho (1-3): ");
            int level = input.nextInt();
            input.nextLine();

            System.out.print("  + Nhap vao Answer A: ");
            String A = input.nextLine();
            System.out.print("  + Nhap vao Answer B: ");
            String B = input.nextLine();
            System.out.print("  + Nhap vao Answer C: ");
            String C = input.nextLine();
            System.out.print("  + Nhap vao Answer D: ");
            String D = input.nextLine();
            System.out.print("  + Nhap vao dap an dung (A,B,C,D): ");
            String correct = input.nextLine();
            questions[i] = new Question();
            questions[i].setContent(content);
            questions[i].setLevel(level);
            questions[i].setCorrect(correct);
            questions[i].setAnswer1(A);
            questions[i].setAnswer2(B);
            questions[i].setAnswer3(C);
            questions[i].setAnswer4(D);
        }
        System.out.println();
        QuestionManagement questionManagement = new QuestionManagement(questions);
        // Nhập vào độ khó muốn test
        System.out.print("Nhap vao do kho muon test (1-3) : ");
        int dokho = input.nextInt();
        input.nextLine();
        // Hien thi ra man hinh nhung cau hoi tuong ung voi do kho
        questionManagement.find(dokho);
        System.out.println();
        // Nhập vào đáp án theo đúng thứ tự từ câu hỏi đầu tiên đến cuối cùng
        System.out.print("Nhap dap an theo thu tu 1,2,3,4,...: ");
        String dapan = input.nextLine(); // muốn trả lời cau hoi 1,3,5. Nhập: A,0,A,0,C
        int j = 0, k = 0;
        // Hiển thị ra số câu trả lời đúng và đáp án đúng của từng câu hỏi.
        for (int i = 0; i < questions.length; i++) {
            if (dokho == questions[i].getLevel()) {
                j++; // Số câu hỏi cần hiển thị tăng 1
                System.out.println("- Question " + (i + 1) + ":");
                char c = dapan.charAt(i * 2); // Đáp án user tương ứng với vị trí câu hỏi đó
                System.out.println("\t Your Answer: " + c);
                char out = questions[i].getCorrect().charAt(0); // Đổi kiểu đáp án đúng
                if (c == out) {
                    questions[i].answerCorrect(true);
                    k++; // Số câu trả lời đúng + 1
                } else questions[i].answerCorrect(false);
                System.out.println("\t Answer correct: " + questions[i].getCorrect());
            }
        }
        System.out.println();
        System.out.println(questionManagement.score(k, j));
    }
}
