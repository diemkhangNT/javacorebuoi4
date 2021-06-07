package Activity51.Rectangle;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: ");
        rect.width = input.nextInt();
        System.out.print("Enter height: ");
        rect.height = input.nextInt();

        System.out.println("Chu vi = "+(double)rect.perimeter());
        System.out.println("Dien tich = "+(int)rect.acreage());
        rect.printInfo();
        System.out.print("Ket qua la hinh vuong: "+(boolean)rect.testSquare());

    }
}
