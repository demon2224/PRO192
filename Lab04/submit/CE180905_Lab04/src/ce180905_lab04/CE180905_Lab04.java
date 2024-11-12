/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180905_lab04;

import java.util.Scanner;

/**
 *
 * @author Le Anh Tuan - CE180905
 */
public class CE180905_Lab04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Khởi tạo đối tượng BookManagement để quản lý sách
        BookManagement bookManagement = new BookManagement();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        
        // Vòng lặp để hiển thị menu và thực hiện các chức năng cho đến khi người dùng chọn thoát
        do {
            // Hiển thị menu cho người dùng
            System.out.println("\n----- BOOK MANAGEMENT -----");
            System.out.println("1. Adds new book.");
            System.out.println("2. Shows all books.");
            System.out.println("3. The biggest size book.");
            System.out.println("4. Search a book by ID.");
            System.out.println("5. Sort the list of books ascending by size.");
            System.out.println("6. Quit.");
            System.out.print("Please select a function: ");
            try {
                // Nhập lựa chọn từ người dùng và chuyển đổi sang số nguyên
                choice = Integer.parseInt(scanner.nextLine());
                
                // Kiểm tra và thực thi chức năng dựa trên lựa chọn của người dùng
                switch (choice) {
                    case 1:
                        bookManagement.entryData(); // Thêm sách mới vào danh sách
                        break;
                    case 2:
                        bookManagement.printData(); // Hiển thị danh sách sách hiện có 
                        break;
                    case 3:
                        bookManagement.biggestSize(); // Tìm và hiển thị sách có kích thước lớn nhất
                        break;
                    case 4:
                        System.out.print("Please enter books's ID to search: ");
                        String id = scanner.nextLine();
                        int index = bookManagement.searchBookByID(id);
                        
                        if ( index >= 0 ) {
                            System.out.println("Search Results: ");    
                            System.out.println("\n--------------------------- BOOK MANAGEMENT ----------------------");
                            System.out.printf("| %-3s | %-5s | %-17s | %-4s | %-13s | %-5s |\n","No.", "ID", "Name", "Year", "Author", "Size");
                            System.out.println("+-----+-------+-------------------+------+---------------+-------+");
                            System.out.printf("|  1  ");
                            bookManagement.listEBook.get(index).showInfo();
                            System.out.println("+-----+-------+-------------------+------+---------------+-------+");
                        } else {
                            System.out.println("Search Results: Not Found");
                        }
                    
                        break;
                    case 5:
                        bookManagement.sort();      // Sắp xếp danh sách sách theo kích thước tăng dần
                        bookManagement.printData(); // Hiển thị danh sách sách sau khi sắp xếp
                        break;
                    case 6:
                        
                        // Hiển thị lời cảm ơn và thoát chương trình
                        System.out.println("THANK YOU FOR USING OUR APPLICATION!");
                        System.out.println("SEE YOU AGAIN!");
                        break;
                    default:
                        System.out.println("The function of application must be from 1 to 6!");
                }
            } catch (NumberFormatException e) {
                //// Bắt lỗi nhập sai định dạng và thông báo lỗi cho người dùng
                System.out.println("The function of application must be from 1 to 6!");
         
            }    
        } while (choice != 6); // Tiếp tục vòng lặp cho đến khi người dùng chọn chức năng thoát
    }
    
}
