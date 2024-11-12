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
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập một từ
        System.out.print("Please enter a word: ");
        String word = scanner.nextLine();

        // Yêu cầu người dùng nhập một câu
        System.out.print("Please enter a sentence: ");
        String sentence = scanner.nextLine();

        // Chuyển cả từ và câu sang chữ thường để kiểm tra mà không phân biệt hoa/thường
        if (sentence.toLowerCase().contains(word.toLowerCase())) {
            // Nếu từ có trong câu, in ra thông báo
            System.out.println("The word '" + word + "' is in the sentence.");
        } else {
            // Nếu từ không có trong câu, in ra thông báo
            System.out.println("The word '" + word + "' is not in the sentence.");
        }
    }
}
