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

        // Yêu cầu người dùng nhập một từ
        System.out.print("Please enter a word: ");
        String word = scanner.nextLine();

        // Kiểm tra xem từ có bắt đầu bằng 'a' thường hay không
        if (word.startsWith("a")) {
            System.out.println("Yes, it starts with a lower case 'a'");
            // Kiểm tra xem từ có bắt đầu bằng 'A' hoa hay không    
        } else if (word.startsWith("A")) {
            System.out.println("Yes, it starts with an upper case 'A'");
            //  Nếu từ không bắt đầu bằng 'a' thường hoặc 'A' hoa  
        } else {
            System.out.println("No, it does not start with upper or lower case 'a'");
        }
    }
}
