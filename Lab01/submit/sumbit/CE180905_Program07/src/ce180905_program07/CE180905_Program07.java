/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180905_program07;

import java.util.Scanner;

/**
 *
 * @author Le Anh Tuan - CE180905
 */
public class CE180905_Program07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Yêu cầu người dùng nhập một số nguyên dương N
        System.out.print("Please enter positive integer N: ");
        int n = new Scanner(System.in).nextInt();
        
        // Kiểm tra nếu N là số âm
        if (n < 0) {
            System.out.println("N must be greater than or equal 0!");
        } 
        
        // Trường hợp N = 0, in kết quả giai thừa của 0 là 1
        else if (n == 0) {
            System.out.println("Result: 0! = 1");
        } 
        
        // Trường hợp N > 0, tính toán và in giai thừa của N
        else {
            System.out.print("Result: ");
            long result = 1;                // Biến result lưu kết quả giai thừa
            System.out.print(n + "! = 1*"); // In số đầu tiên 1 (giai thừa bắt đầu từ 1)
            
            // Vòng lặp tính giai thừa từ 2 đến N
            for (int i = 2; i <= n; i++) {
                result *= i;                // Nhân result với i để tính giai thừa
                System.out.print("*" + i);  // In số i, thêm dấu * phía trước
            }
            
            // Sau khi vòng lặp hoàn tất, in kết quả cuối cùng của phép tính giai thừa
            System.out.println(" = " + result);
        }
    }

}
