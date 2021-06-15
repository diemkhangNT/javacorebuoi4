package Activity53.program.QuestionandAnswer;

import jdk.nashorn.internal.objects.annotations.Getter;

public class Question {
    // Các thuộc tính
    private String content;
    private String answer1,answer2,answer3,answer4;
    private String correct;
    private int level;
    // Khởi tạo có tham số, không có tham số
    public Question(){}
    public Question(String content, String correct, int level){
        this.content = content;
        this.correct = correct;
        this.level = level;
    }
    public Question(String answer1, String answer2, String answer3,String answer4){
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
    }
   // getter/setter
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getAnswer1() {
        return (String)answer1;
    }
    public void setAnswer1(String A) {
        this.answer1 = A;
    }
    public String getAnswer2() {
        return (String)answer2;
    }
    public void setAnswer2(String B) {
        this.answer2 = B;
    }
    public String getAnswer3() {
        return (String)answer3;
    }
    public void setAnswer3(String C) {
        this.answer3 = C;
    }
    public String getAnswer4() {
        return (String)answer4;
    }
    public void setAnswer4(String D) {
        this.answer4 = D;
    }
    public String getCorrect() {
        return (String) correct;
    }
    public void setCorrect(String correct) {
        this.correct = correct;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
   // Kiem tra dap an dung hay khong
    public boolean answerCorrect(boolean check){
        if(check==true){
            System.out.println("---> Correct!");
        }else {
            System.out.println("---> Incorrect!");
        }
        return check;
    }

}
