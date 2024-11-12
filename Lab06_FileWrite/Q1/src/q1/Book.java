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
public class Book extends Document {

    private int page;
    private int status;

    public Book(String ID, String name, int page, int status) {
        super(ID, name);
        this.page = page;
        this.status = status;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String entryBook() {
        return String.format("Add book: %s - %s - %d pages - %s",
                this.getID(),
                this.getName(),
                this.getPage(),
                (this.status == 0 ? "available" : "unavailable")
        );
    }

    public String printBook() {
        return String.format("%s - %s - %d pages - %s",
                this.getID(),
                this.getName(),
                this.getPage(),
                (this.status == 0 ? "available" : "unavailable")
        );
    }

    public void borrowBook() {
        this.status = 1;
    }

    public void returnBook() {
        this.status = 0;
    }
}
