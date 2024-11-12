/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180905_program02;

import java.util.Scanner;

/**
 *
 * @author Le Anh Tuan - CE180905
 */
public class CE180905_Program02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập một màu
        System.out.print("Please enter a colour: ");
        String color = scanner.nextLine();

        // Lấy và in ra ký tự đầu tiên
        System.out.println("The first letter is " + color.charAt(0));

        // Lấy và in ra ký tự thứ ba
        System.out.println("The third letter is " + color.charAt(2));
    }
}
