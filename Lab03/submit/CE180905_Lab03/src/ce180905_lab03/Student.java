/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce180905_lab03;

/**
 *
 * @author Le Anh Tuan - CE180905
 */
public class Student {
    private String ID;
    private String fullName;
    private double math;
    private double literature;

    // Constructor để khởi tạo đối tượng sinh viên với ID, tên, điểm Toán và điểm Văn
    public Student(String ID, String fullName, double math, double literature) {
        this.ID = ID;
        this.fullName = fullName;
        this.math = math;
        this.literature = literature;
    }

   


    // Getter và Setter cho mã sinh viên
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }

    // Getter và Setter cho tên đầy đủ
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // Getter và Setter cho điểm Toán
    public double getMath() {
        return math;
    }
    public void setMath(double math) {
        this.math = math;
    }

    // Getter và Setter cho điểm Văn
    public double getLiterature() {
        return literature;
    }
    public void setLiterature(double literature) {
        this.literature = literature;
    }
    
    // Phương thức tính GPA (Điểm trung bình chung của sinh viên)
    public double getGPA(){
        return (math + literature) / 2;
    }
}
