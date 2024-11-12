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
abstract class BaseProduct implements Product {

    protected String producId;
    protected String name;
    protected double price;
    protected int quantity;

    public BaseProduct(String producId, String name, double price, int quantity) {
        this.producId = producId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

}
