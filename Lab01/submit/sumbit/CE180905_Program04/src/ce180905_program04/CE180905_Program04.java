/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180905_program04;

import java.util.Scanner;

/**
 *
 * @author Le Anh Tuan - CE180905
 */
public class CE180905_Program04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // In thông báo về chương trình và một đường kẻ phân cách
        System.out.println("SOLVING LINEAR EQUATION A*X + B = 0 PROGRAM:\n"
                + "\n------------------------------------------  ");
        
        // Yêu cầu người dùng nhập hệ số A
        System.out.print("\nPlease enter the coefficients A: ");
        int a = new Scanner(System.in).nextInt();
        
        // Yêu cầu người dùng nhập hệ số B
        System.out.print("\nPlease enter the coefficients B: ");
        int b = new Scanner(System.in).nextInt();
        
        // Kiểm tra các trường hợp đặc biệt
        if (a == 0) {
            
            // Nếu A bằng 0, kiểm tra thêm B    
            if (b == 0) {
                
                // Nếu cả A và B đều bằng 0, mọi giá trị của X đều là nghiệm        
                System.out.println("\nEvery value for X is a solution to the linear equation " + a + "*X +" + b + " = 0");
            } else {
                
                // Nếu A bằng 0 nhưng B khác 0, phương trình vô nghiệm    
                System.out.println("\nThere is no solution for the linear equation " + a + "*X +" + b + " = 0");
            }
        } else {
            
            // Nếu A khác 0, giải phương trình tìm X
            double x = (double) -b / a;
            System.out.printf("\nThe linear equation " + a + "*X + " + b + " = 0 has an unique root is X = %.2f%n", x);
        }
    }

}
