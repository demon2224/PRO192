/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180905_program08;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Le Anh Tuan - CE180905
 */
public class CE180905_Program08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> players = new ArrayList<>();

        // Yêu cầu người dùng nhập tên (cho đến khi nhập 'quit')
        while (true) {
            System.out.print("Please enter a name (quit to exit!): ");
            String name = scanner.nextLine();

            // Kiểm tra nếu người dùng nhập 'quit' (bỏ qua phân biệt chữ hoa/chữ thường)
            if (name.equalsIgnoreCase("quit")) {
                break;
            }

            // Thêm tên vào danh sách
            players.add(name);
        }

        // Kiểm tra nếu danh sách trống
        if (players.isEmpty()) {
            System.out.println("The player list is empty!");
        } else {
            // In danh sách tất cả người chơi
            System.out.println("List of players:");
            int count = 1;
            for (String player : players) {
                System.out.println(count + ". " + player);
                count++;
            }

            // In ra những người có họ 'Nguyen'
            System.out.println("#. List of players with the last name 'Nguyen':");
            count = 1;  // Đặt lại số lượng cho danh sách này
            for (String player : players) {
                if (player.startsWith("Nguyen")) {
                    System.out.println(count + ". " + player);
                    count++;
                }
            }

            // In ra những người có tên chứa 'Dung'
            System.out.println("#. List of players named 'Dung':");
            count = 1;  // Đặt lại số lượng cho danh sách này
            for (String player : players) {
                if (player.contains("Dung")) {
                    System.out.println(count + ". " + player);
                    count++;
                }
            }

            // Chọn người may mắn ngẫu nhiên       
            Random random = new Random();
            int luckyIndex = random.nextInt(players.size()); // Lấy chỉ số ngẫu nhiên trong khoảng danh sách
            String luckyPlayer = players.get(luckyIndex); // Lấy tên dựa trên chỉ số ngẫu nhiên

            // In ra người may mắn
            System.out.println("#. The name of the lucky winner:\n" + luckyPlayer);
        }
    }
}
