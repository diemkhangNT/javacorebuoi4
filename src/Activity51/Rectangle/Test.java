package Activity51.Rectangle;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: ");
        int width = input.nextInt();
        rect.setWidth(width);
        System.out.print("Enter height: ");
        int height = input.nextInt();
        rect.setHeight(height);
        System.out.println("Chu vi = "+ rect.perimeter());
        System.out.println("Dien tich = "+ rect.acreage());
        rect.printInfo();
        System.out.print("Ket qua la hinh vuong: "+rect.testSquare());

    }
}
