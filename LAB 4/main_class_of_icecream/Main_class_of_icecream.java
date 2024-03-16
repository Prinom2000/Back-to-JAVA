
package main_class_of_icecream;

public class Main_class_of_icecream {

    public static void main(String[] args) {
        Icecream i1 = new Icecream();
        Icecream i2 = new Icecream();
        
        i1.set_com("Igloo");
        i1.set_type("Cone");
        i1.set_price(30);
        
        i2.set_com("Prinom");
        i2.set_type("CB");
        i2.set_price(10);
        
        i1.to_string();
        i2.to_string();
        
//        System.out.println(i1.com);
        
        
    }
    
}
