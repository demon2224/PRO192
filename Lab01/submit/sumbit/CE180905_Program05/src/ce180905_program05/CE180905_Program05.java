/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180905_program05;

import java.util.Scanner;

/**
 *
 * @author Le Anh Tuan - CE180905
 */
public class CE180905_Program05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Yêu cầu người dùng nhập một số nguyên dương
        System.out.print("Please enter positive integer N: ");
        int a = new Scanner(System.in).nextInt();
        
        // Khởi tạo biến để lưu trữ tổng
        int result = 1;
        
        // Kiểm tra xem số nhập vào có dương không
        if (a <= 0) {
            System.out.println("Accept positive number only!");
        } else 
            
          // Xử lý trường hợp N bằng 1    
          if (a == 1) {
            System.out.println("The sum is S = 1 ");
        } else {
            System.out.print("The sum is S = 1");
            
            // Lặp qua các số từ 2 đến N    
            for (int i = 2; i <= a; i++) {
                
                // Kiểm tra xem số có phải là số lẻ không
                if (i % 2 != 0) {
                    
                    // Thêm số lẻ vào kết quả và in ra
                    result += i;
                    System.out.print(" + " + i);
                } else {
                    
                    // Trừ số chẵn khỏi kết quả và in ra
                    result -= i;
                    System.out.print(" - " + i);
                }
            }
            
            // In ra kết quả cuối cùng (tổng)
            System.out.println(" = " + result);
        }
    }

}
