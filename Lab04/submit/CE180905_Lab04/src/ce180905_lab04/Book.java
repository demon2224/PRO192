/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180905_lab04;

/**
 *
 * @author Le Anh Tuan - CE180905
 */
public class Book {
    // Các thuộc tính của sách
    private String ID;
    private String name;
    private int year;
    private String author;
    private int size;

    // Constructor mặc định không tham số
    public Book() {
    }

    // Constructor có tham số để khởi tạo các thuộc tính của sách
    public Book(String ID, String name, int year, String author, int size) {
        this.ID = ID;
        this.name = name;
        this.year = year;
        this.author = author;
        this.size = size;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    // Phương thức hiển thị thông tin của sách dưới dạng định dạng bảng
    public void showInfo(){
        System.out.println(String.format("| %-5s | %-17s | %-4d | %-13s | %3dKB |", ID, name, year, author, size));
    }
}
