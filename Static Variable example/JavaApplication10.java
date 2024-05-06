/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author User
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "SmartPhone";
//        Mobile.name = "SmartPhone";
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        obj2.name = "fdfs";
        Mobile.name = "prinom";  // 
        
//        obj1.name = "Phone";
        obj1.show(); // prinom
        obj2.show(); //prinom
        // basically static verable is used for as a common propertice of chield class.....!
    }
    
}
