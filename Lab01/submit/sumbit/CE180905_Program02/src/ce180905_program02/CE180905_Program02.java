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
        
        // Yêu cầu người dùng nhập bán kính đáy của hình trụ
        System.out.print("Please enter the base's radius of the cylinder: ");
        double radius = scanner.nextDouble();
        
        // Yêu cầu người dùng nhập chiều cao của hình trụ
        System.out.print("Please enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        
        // Kiểm tra xem chiều cao và bán kính có phải là số dương không
        if (height <= 0 || radius <= 0) {
            System.out.println("The height and radius of cylinder must be a positive number!");
        } else {
            // Tính diện tích xung quanh của hình trụ
            double surfaceArea = 2 * Math.PI * radius * (radius + height);
            
            // Tính thể tích của hình trụ
            double volume = Math.PI * radius * radius * height;
            
            // In kết quả ra màn hình
            System.out.println("The total surface area of the cylinder is " + Math.round(surfaceArea * 10000000000.0) / 10000000000.0);
            System.out.println("The volume of the cylinder is " + Math.round(volume * 10000000000.0) / 10000000000.0);
        }
    }

}
