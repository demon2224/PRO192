/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180905_program06;

import java.util.Scanner;

/**
 *
 * @author Le Anh Tuan - CE180905
 */
public class CE180905_Program06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Yêu cầu người dùng nhập một số nguyên dương
        System.out.print("Please enter positive integer N: ");
        int n = new Scanner(System.in).nextInt();
        
        // Khởi tạo biến
        double sum = 1; // Lưu trữ tổng được tính toán
        int a = 1;      // Lưu trữ giai thừa của số hiện tại
        
        // Kiểm tra đầu vào không hợp lệ (số không dương)
        if (n <= 0) {
            System.out.println("Accept positive number only!");
        } else if (n == 1) {
            
            // Xử lý trường hợp N bằng 1 (trường hợp đặc biệt)
            System.out.println("The sum is S = 1");
        } else {
            
            // In ra biểu thức tính tổng ban đầu
            System.out.print("\nThe sum is S = 1!/2^0");
            
            // Lặp qua các số từ 2 đến N
            for (int i = 2; i <= n; i++) {
                
                // Tính giai thừa của số hiện tại
                a *= i;
                
                // Tính toán số hạng cần cộng vào tổng
                sum += a / Math.pow(2, i - 1);
                System.out.print(" + " + i + "!/2^" + (i - 1));
                
            // In ra tổng cuối cùng
            }
            System.out.printf(" = %.2f%n ", sum);
        }
    }

}
