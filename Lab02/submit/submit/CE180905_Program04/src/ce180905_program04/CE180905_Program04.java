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
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập tên
        System.out.print("Please enter a name: ");
        String name = scanner.nextLine();

        // Yêu cầu người dùng nhập một số
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        // Kiểm tra xem số có hợp lệ (không lớn hơn độ dài tên) hay không
        if (number > 0 && number <= name.length()) {
            // In ra ký tự tại vị trí tương ứng với số đã nhập (lưu ý số nhập vào được tính từ 1)
            System.out.println("The letter at position " + number + " is " + name.charAt(number));
        } else {
            // Thông báo nếu số quá lớn so với độ dài của tên
            System.out.println("Sorry, that number is to big.");
        }

    }

}
