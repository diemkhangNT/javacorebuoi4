package Activity51.Rectangle;

public class Rectangle {
    private int width;
    private int height;
    //  Khởi tạo
    public Rectangle(){}
    public Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }
    // Getters/Setter
    public void setWidth(int input){
        if(input>0){
            this.width = input;
        }
    }
    public int getWidth() {
        return width;
    }
    public void setHeight(int input) {
        if(input>0){
            this.height = input;
        }
    }
    public int getHeight() {
        return height;
    }
    // Tính chu vi
    public int perimeter(){
        return (width+height)*2;
}
    // Tính diện tích
    public int acreage(){
        return width*height;
    }
    // In ra width, height
    public void printInfo(){
        System.out.println("Width:  "+width);
        System.out.println("Height: "+height);
    }
    // Kiểm tra xen có là hình vuông không
    public boolean testSquare(){
        if(width == height){
            return true;
        }else return false;
    }

}
