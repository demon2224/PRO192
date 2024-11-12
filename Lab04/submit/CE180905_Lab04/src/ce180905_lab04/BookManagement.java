/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180905_lab04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Le Anh Tuan - CE180905
 */
public class BookManagement {
    ArrayList<Book> listEBook; // Danh sách chứa các sách (ebooks)
    
    // Constructor khởi tạo danh sách sách
    public BookManagement() {
        listEBook = new ArrayList<>();
    }
    
    // Phương thức thêm sách mới vào danh sách
    public void entryData() {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();
        System.out.println("\n----- Add new ebook -----");
        
        // Nhập ID cho sách, kiểm tra ID hợp lệ (không rỗng, không trùng, 5 ký tự)
        while (true) {
            System.out.print("Input ID: ");
            String id = scanner.nextLine();
            
            if (id.isEmpty()) {
                System.out.println("ID cannot be empty!");
                continue;
            }
            
            // Kiểm tra trùng ID
            boolean isDuplicate = false;
            for (Book b : listEBook) {
                if (b.getID().equals(id)) {
                    isDuplicate = true;
                    break;
                }
            }
            // Kiểm tra điều kiện ID
            if (id.length() == 5 && !isDuplicate) { 
                book.setID(id);
                break;
            } else {
                System.out.println("Invalid ID! It must be exactly 5 characters and not duplicated.");
            }
        }

        // Nhập tên sách, kiểm tra không để trống
        while (true) {
            System.out.print("Input name: ");
            String name = scanner.nextLine();
            if (!name.isEmpty()) {
                book.setName(name);
                break;
            } else {
                System.out.println("Name cannot be empty!");
            }
        }

        // Nhập và kiểm tra năm xuất bản, phải từ 1900 đến 2024
        while (true) {
            System.out.print("Input year: ");
            String yearInput = scanner.nextLine();
            if (yearInput.isEmpty()) {
                System.out.println("Year cannot be empty!");
                continue;
            }

            int year;
            try {
                // Chuyển đổi chuỗi nhập vào thành số nguyên
                year = Integer.parseInt(yearInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid year! Please enter a valid number.");
                continue;
            }
            // Kiểm tra năm hợp lệ
            if (year >= 1900 && year <= 2024) {
                book.setYear(year);
                break;
            } else {
                System.out.println("Invalid year! It must be between 1900 and 2024.");
            }
        }

        // Nhập tên tác giả, kiểm tra không để trống
        while (true) {
            System.out.print("Input author: ");
            String author = scanner.nextLine();
            if (!author.isEmpty()) {
                book.setAuthor(author);
                break;
            } else {
                System.out.println("Author cannot be empty!");
            }
        }

        // Nhập kích thước sách, kiểm tra số nguyên dương, không để trống
        while (true) {
            System.out.print("Input size: ");
            String sizeInput = scanner.nextLine();

            if (sizeInput.isEmpty()) {
                System.out.println("Size cannot be empty!");
                continue;
            }

            int size;
            try {
                // Chuyển đổi chuỗi nhập vào thành số nguyên
                size = Integer.parseInt(sizeInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid size! Please enter a valid number.");
                continue;
            }

            // Kiểm tra kích thước hợp lệ
            if (size > 0) {
                book.setSize(size);  
                break;
            } else {
                System.out.println("Size must be greater than 0!");
            }
        }
        
        // Thêm sách vào danh sách ebook
        listEBook.add(book);
        System.out.println("Ebook created and added to list of ebooks successfully!");
    }
    
    // Phương thức in danh sách các sách hiện có trong hệ thống
    public void printData() {
        System.out.println("\n--------------------------- BOOK MANAGEMENT ----------------------");
        System.out.printf("| %-3s | %-5s | %-17s | %-4s | %-13s | %-5s |\n","No.", "ID", "Name", "Year", "Author", "Size");
        System.out.println("+-----+-------+-------------------+------+---------------+-------+");
        int index = 1;
        for (Book book : listEBook) {
            System.out.printf("|  %-2d ", index++);
            book.showInfo();
            System.out.println("+-----+-------+-------------------+------+---------------+-------+");
        }
    }
    
    // Phương thức sắp xếp danh sách sách theo kích thước tăng dần
    public void sort() {
        listEBook.sort((b1, b2) -> Integer.compare(b1.getSize(), b2.getSize()));
    }
    
    // Tìm kiếm sách theo ID và trả về vị trí của sách trong danh sách
    public int searchBookByID(String id) {
        for (int i = 0; i < listEBook.size(); i++) {
            if (listEBook.get(i).getID().equals(id)) {
                return i;
            }
        }
        return -1; // Nếu không tìm thấy sách
    }
    
    
    // Phương thức hỗ trợ tìm sách theo ID, trả về đối tượng sách nếu tìm thấy
    public Book searchBookObjectByID(String ID) {
        for (Book book : listEBook) {
            if (book.getID().equals(ID)) {
                return book;
            }
        }
        return null; // Nếu không tìm thấy sách
    }
    
    // Phương thức tìm sách có kích thước lớn nhất
    public void biggestSize() {
        if (listEBook.isEmpty()) { // Kiểm tra danh sách rỗng
            System.out.println("No books available.");
            return;
        }
        // Gán kích thước lớn nhất ban đầu
        int maxSize = listEBook.get(0).getSize();
        
        // Danh sách lưu các sách có kích thước lớn nhất
        ArrayList<Book> biggestBooks = new ArrayList<>();
        for (Book book : listEBook) {
            if (book.getSize() > maxSize) { // Cập nhật kích thước lớn nhất
                biggestBooks.clear();
                maxSize = book.getSize();
            }
            if (book.getSize() == maxSize) { // Thêm sách vào danh sách lớn nhất
                biggestBooks.add(book);
            }
        }
        System.out.println("\n--------------------------- BOOK MANAGEMENT ----------------------");
        System.out.printf("| %-3s | %-5s | %-17s | %-4s | %-13s | %-5s |\n","No.", "ID", "Name", "Year", "Author", "Size");
        for (Book book : biggestBooks) {
            System.out.printf("|  1  ");
            book.showInfo();
            System.out.println("+-----+-------+-------------------+------+---------------+-------+");

        }
    }   
}