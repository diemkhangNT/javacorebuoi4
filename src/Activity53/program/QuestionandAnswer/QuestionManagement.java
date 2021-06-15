package Activity53.program.QuestionandAnswer;

public class QuestionManagement {
    // Danh sách các câu hỏi
    private Question[] questions;
    // Khởi tạo không tham số và có tham số
    public QuestionManagement(){
    }
    public QuestionManagement(Question[] questions) {
        this.questions = questions;
    }
    // Tính điểm
    public String score(int k, int j){
        return  "Ban tra loi duoc: "+k+"/"+j+" cau o cap do nay!";
    }
    // Kiểm tra độ khó
    public int find(int dokho){
        for(int i=0;i<questions.length;i++){
            if(dokho==questions[i].getLevel()){
                System.out.println(" - Question"+(i+1)+": "+questions[i].getContent());
            }
        }
        return dokho;
    }
}
