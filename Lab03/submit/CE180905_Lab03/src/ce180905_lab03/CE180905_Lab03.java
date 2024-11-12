/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180905_lab03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Le Anh Tuan - CE180905
 */
public class CE180905_Lab03 {

    /**
     * @param args the command line arguments
     */
    // Danh sách sinh viên (sử dụng ArrayList để lưu trữ sinh viên)
    private static ArrayList<Student> students = new ArrayList<>();
    
    // Đối tượng Scanner để nhập dữ liệu từ bàn phím
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        int choice = 0;
        do {
            // Hiển thị menu cho người dùng
            showMenu();
            try {
                // Người dùng nhập lựa chọn và chuyển thành số nguyên
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        // Thêm sinh viên mới
                        addNewStudent();
                        break;
                    case 2:
                        // Hiển thị danh sách sinh viên 
                        showAllStudents();
                        break;
                    case 3:
                        // Thông báo khi thoát chương trình
                        System.out.println("THANK YOU FOR USING OUR APPLICATION!\nSEE YOU AGAIN!");
                        break;
                    default:
                        // Khi người dùng nhập lựa chọn không hợp lệ
                        System.out.println("The funnction of application must be form 1 to 3!");
                }        
            } catch (NumberFormatException e) {
                // Xử lý ngoại lệ khi người dùng nhập không phải số
                System.out.println("The function of application must be from 1 to 3!");
            }       
        } while (choice != 3);  // Vòng lặp tiếp tục cho đến khi người dùng chọn thoát (lựa chọn 3) 
    }
    
    // Phương thức hiển thị menu chính
    private static void showMenu(){
        System.out.println("\n----- STUDENT MANAGEMENT V1.0 -----");
        System.out.println("1. Adds new student.");
        System.out.println("2. Show all students.");
        System.out.println("3. Quit.");
        System.out.print("Please select a function: ");
    }
    
    // Phương thức để thêm sinh viên mới
    private static void addNewStudent(){
        while (true) {
            System.out.println("----STUDENT MANAGEMENT V1.0 [ADD NEW STUDENT]----");
            System.out.print("Please enter Student Infomation: ");
            String input = scanner.nextLine();
        
            if (input.isEmpty()) {
                // Kiểm tra nếu người dùng không nhập dữ liệu
                System.out.println("-->You must enter data!");
                continue;
        
            }
            // Tách chuỗi nhập vào theo ký tự @
            String[] parts = input.split("@");
            if (parts.length != 4) {
                // Kiểm tra xem dữ liệu nhập vào có đúng định dạng không
                System.out.println("-->Wrong format!");
                continue;
            }
        
            String ID = parts[0];
            String fullName = parts[1];
            double math;
            double literature;
         
            try {
                // Kiểm tra xem điểm toán và văn có phải là số hợp lệ không
                math = Double.parseDouble(parts[2]);
                literature = Double.parseDouble(parts[3]);
            } catch (NumberFormatException e) {
                System.out.println("-->Invalid!");
                continue;
            }
        
            // Kiểm tra điều kiện ID phải có độ dài 5 ký tự
            if (ID.length() != 5) {
                System.out.println("-->The Student ID must be of the length of 5 characters!");
                continue;
            }
        
            // Kiểm tra điểm toán và văn phải lớn hơn hoặc bằng 0
            if (math < 0 || literature < 0) {
                System.out.println("-->The marks are not negatives!");
                continue;
            }
        
            // Tạo sinh viên mới và thêm vào danh sách
            Student newStudent = new Student(ID, fullName, math, literature);
            students.add(newStudent);
            System.out.println("-->Student created and added to list of student successful!");
            break;    
        }
    }  
    
    // Phương thức hiển thị tất cả sinh viên
    private static void showAllStudents() {
        if (students.isEmpty()) {
            // Nếu danh sách trống thì thông báo không có sinh viên
            System.out.println("No student in the list.");
            return;
        }
        
        // In tiêu đề bảng danh sách sinh viên
        System.out.println("\n----- STUDENT MANAGEMENT V1.0 [List of student] -----");
        System.out.println("| No. | ID    | Student name      | Math | Lit | GPA |");
        System.out.println("+-----+-------+-------------------+------+-----+-----+");

        // Duyệt qua danh sách sinh viên và in ra màn hình
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(String.format("|  %-2d | %-5s | %-17s | %-4.1f | %-3.1f | %-3.1f |", i + 1, s.getID(), s.getFullName(), s.getMath(), s.getLiterature(), s.getGPA()));
            System.out.println("+-----+-------+-------------------+------+-----+-----+");
        }
        
        // Tìm sinh viên có GPA cao nhất
        double maxGPA = students.stream().mapToDouble(Student::getGPA).max().orElse(0);
        System.out.println("The best student of this class is/are:");
        
        // In ra danh sách sinh viên có GPA cao nhất
        int rank = 1;
        for (Student s : students) {
            if (s.getGPA() == maxGPA) {
                System.out.printf("%d. %s (GPA: %.1f)\n", rank++, s.getFullName(), s.getGPA());
            }
        }
    }
}
