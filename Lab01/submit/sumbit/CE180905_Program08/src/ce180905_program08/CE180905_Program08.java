/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180905_program08;

import java.util.Scanner;

/**
 *
 * @author Le Anh Tuan - CE180905
 */
public class CE180905_Program08 {
        
    
    // Kiểm tra xem một số có phải là số nguyên tố không
    static boolean prime(int n) {
        
        // Lặp từ 2 đến căn bậc hai của n (hiệu quả để kiểm tra số nguyên tố)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            
            // Nếu n chia hết cho bất kỳ số nào giữa 2 và căn bậc hai của nó thì không phải số nguyên tố
            if (n % i == 0) {
                return false;
            }
        }
        
        // Nếu n lớn hơn 1 (tránh coi 0 và 1 là số nguyên tố)
        return n > 1;
    }

    public static void main(String[] args) {
        
        // Yêu cầu người dùng nhập số phần tử của mảng
        System.out.print("How many element of numeric array? ");
        int n = new Scanner(System.in).nextInt();
        
        // Khai báo và khởi tạo mảng với kích thước đã chỉ định
        int[] a = new int[n];
        
        // Kiểm tra đầu vào không hợp lệ (kích thước mảng phải dương)
        if (n <= 0) {
            System.out.println("\nThe number of element of numeric array must be greater than 0!");
        } else {
            
            // Yêu cầu người dùng nhập giá trị cho từng phần tử
            System.out.println("\nPlease enter value for " + n + " elements: ");
            for (int i = 0; i < n; i++) {
                
                // In ra thông báo được định dạng cho mỗi phần tử
                System.out.printf("\nValue of the %d%s element is: ", (i + 1), (i == 0 ? "st" : i == 1 ? "nd" : i == 2 ? "rd" : "th"));
                a[i] = new Scanner(System.in).nextInt();
            }
            
            // In ra dòng phân cách
            System.out.println("\n*********************************");
            
            // In mảng gốc
            System.out.print("\n1.  The entered array is: " + a[0]);
            for (int i = 1; i < a.length; i++) {
                System.out.print(", " + a[i]);
            }
            System.out.println("");
            
            // In mảng đảo ngược
            System.out.print("\n2.  The reverse array is: ");
            for (int i = a.length - 1; i > 0; i--) {
                System.out.print(a[i] + ", ");
            }
            System.out.println(a[0]);
            
            // Tìm giá trị nhỏ nhất và lớn nhất trong mảng
            int min = a[0];
            int max = a[0];
            for (int i = 0; i < a.length; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
                if (a[i] < min) {
                    min = a[i];
                }
            }
            
            // In giá trị nhỏ nhất
            System.out.println("\n3.  The minimum value of the numeric array is " + min);

            // In giá trị lớn nhất
            System.out.println("\n4.  The maximum value of the numeric array is " + max);
  
            // In các số nguyên tố trong mảng
            System.out.print("\n5.  All the prime numbers in the array is/are ");
            for (int i = 0; i < a.length; i++) {
                if (prime(a[i])) {
                    System.out.print(a[i] + " ");
                }
            }
            System.out.println("\n");
        }
    }

}
