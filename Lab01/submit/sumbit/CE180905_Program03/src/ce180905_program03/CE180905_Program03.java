/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180905_program03;

import java.util.Scanner;

/**
 *
 * @author Le Anh Tuan - CE180905
 */
public class CE180905_Program03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Yêu cầu người dùng nhập số bị chia
        System.out.print("Please enter dividend: ");
        int a = new Scanner(System.in).nextInt();
        
        // Yêu cầu người dùng nhập số chia        
        System.out.print("Please enter divisor : ");
        int b = new Scanner(System.in).nextInt();
        
        // Kiểm tra xem số chia có bằng 0 không        
        if (b == 0) {
            System.out.println("The divisor can't be zero! ");
        } else
            
        // Kiểm tra xem số bị chia có chia hết cho số chia không            
        if (a % b == 0) {
            System.out.println(a + " is a multiple of " + b);
        } else {
            System.out.println(a + " is not a multiple of " + b);
        }
    }

}
