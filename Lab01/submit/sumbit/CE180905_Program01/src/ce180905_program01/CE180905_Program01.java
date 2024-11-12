/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180905_program01;

import java.util.Scanner;

/**
 *
 * @author Le Anh Tuan - CE180905
 */
public class CE180905_Program01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        // Nhập độ dài 3 cạnh
        System.out.print("Please enter the first edge of triangle: ");
        double a = scanner.nextDouble();
        System.out.print("Please enter the second edge of triangle: ");
        double b = scanner.nextDouble();
        System.out.print("Please enter the third edge of triangle: ");
        double c = scanner.nextDouble();

        // Kiểm tra tính hợp lệ của tam giác
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("These three numbers must be a positive number!");
        } else if ( a + b < c || a + c < b || b + c < a) {
            System.out.println("These three numbers do not make a triangle!");
        } else {   // Tính nửa chu vi
            double p = (a + b + c) / 2;

            // Tính diện tích theo công thức
            double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            // In kết quả
            System.out.println("The perimeter of the triangle is " + (int) (a + b + c));
            System.out.println("The area of the triangle is " + (float) S);
        }
    }
}
