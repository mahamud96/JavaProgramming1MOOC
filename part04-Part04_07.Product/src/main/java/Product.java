/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahamud
 */
public class Product {
    private double price;
    private int qunatity;
    private String name;
    
    public Product (String initialName, double initialPrice, int initialQuantity){
        this.name = initialName;
        this.price = initialPrice;
        this.qunatity = initialQuantity;
    }
    
    public void printProduct(){
        System.out.println(this.name + ", " + this.price + ", " + this.qunatity + " pcs");
    }
    
}
