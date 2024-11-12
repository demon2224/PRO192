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
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập vào một câu có chứa từ "red"
        System.out.print("Please enter a sentence: ");
        String sentence = scanner.nextLine();

        // Yêu cầu người dùng nhập màu sắc muốn thay thế
        System.out.print("Please enter a colour: ");
        String color = scanner.nextLine();

        // Kiểm tra và thay thế từ "red" trong câu
        if (sentence.contains("red")) {
            // Thay thế tất cả các sự xuất hiện của từ "red" bằng màu đã nhập
            String modifiedSentence = sentence.replace("red", color);
            System.out.println(modifiedSentence);
        } else {
            // Nếu từ "red" không xuất hiện, thông báo cho người dùng
            System.out.println("There is no 'red' word in the sentence");
        }
    }
}
