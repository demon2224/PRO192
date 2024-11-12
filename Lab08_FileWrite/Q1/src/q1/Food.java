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
class Food extends BaseProduct {

    private boolean isExpired;

    public Food(String producId, String name, double price, int quantity, boolean isExpired) {
        super(producId, name, price, quantity);
        this.isExpired = isExpired;
    }

    public boolean isIsExpired() {
        return isExpired;
    }

    public void setIsExpired(boolean isExpired) {
        this.isExpired = isExpired;
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
        if (isExpired) {
            return this.getQuantity() * this.getPrice() * 0.5;
        } else {
            return this.getQuantity() * this.getPrice();
        }
    }

    @Override
    public String info() {
        return String.format("%s (Food): %.2f",
                this.getName(),
                this.subTotal()
        );
    }

}
