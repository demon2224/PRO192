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
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập mật khẩu
        System.out.print("Please enter a password: ");
        String password = scanner.nextLine();

        // Biến để theo dõi tình trạng hợp lệ của mật khẩu
        boolean isValid = true;

        // Kiểm tra độ dài của mật khẩu (ít nhất 8 ký tự)
        if (password.length() < 8) {
            System.out.println("Your password is too short.");
            isValid = false;
        }

        // Kiểm tra xem mật khẩu có chứa dấu cách hay không
        if (password.contains(" ")) {
            System.out.println("Your password contains spaces.");
            isValid = false;
        }

        // Kiểm tra xem mật khẩu có bắt đầu bằng chữ 'G' hoa hay không
        if (!password.startsWith("G")) {
            System.out.println("Your password does not start with a 'G'");
            isValid = false;
        }

        // Nếu mật khẩu hợp lệ với tất cả các điều kiện
        if (isValid) {
            System.out.println("Well done. You entered a valid password.");
        }
    }
}
