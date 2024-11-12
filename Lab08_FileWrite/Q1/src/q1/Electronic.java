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
class Electronic extends BaseProduct {

    private double discount;

    public Electronic(String producId, String name, double price, int quantity, double discount) {
        super(producId, name, price, quantity);
        this.discount = discount;

    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getProducId() {
        return producId;
    }

    public void setProducId(String producId) {
        this.producId = producId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double subTotal() {
        return (this.getQuantity() * this.getPrice()) - (this.getQuantity()
                * this.getPrice() * this.getDiscount() / 100);
    }

    @Override
    public String info() {
        return String.format("%s (Electronic): %.2f",
                this.getName(),
                this.subTotal()
        );
    }
}
