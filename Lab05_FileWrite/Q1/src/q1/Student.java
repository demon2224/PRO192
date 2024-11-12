/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

/**
 *
 * @author Le Anh Tuan - CE180905
 */
public class Student {
    private String id;
    private String name;
    private int yob;
    private Department dept; 

    public Student(String studentId, String studentName, int yob, Department dept) {
        this.id = studentId;
        this.name = studentName;
        this.yob = yob;
        this.dept = dept;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }
    
    public String entryData(){
        return String.format("Student %s - %s – %d – Department(%s – %s – %s)",
                this.getId(),
                this.getName(),
                this.getYob(),
                this.dept.getId(),
                this.dept.getName(),
                this.dept.getResponsible()
        );
    }
      
    public String printData(){
        return String.format("%s - %s – %d – Department(%s – %s – %s)",
                this.getId(),
                this.getName(),
                this.getYob(),
                this.dept.getId(),
                this.dept.getName(),
                this.dept.getResponsible()
        ); 
    }
}
