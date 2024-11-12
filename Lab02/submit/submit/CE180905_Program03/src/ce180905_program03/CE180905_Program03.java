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
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập tên
        System.out.print("Please enter your first name: ");
        String firstName = scanner.nextLine();

        // Yêu cầu người dùng nhập họ
        System.out.print("Please enter your last name: ");
        String lastName = scanner.nextLine();

        // Lấy ký tự đầu tiên của tên và họ, chuyển sang chữ hoa và in ra
        String initials = firstName.toUpperCase().charAt(0) + "." + lastName.toUpperCase().charAt(0) + ".";

        // In kết quả ra màn hình
        System.out.println("Result: " + initials);
    }
}
