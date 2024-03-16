
package main_class_of_icecream;

/**
 *
 * @author User
 */
public class Icecream {
    private String com, type;
    private double price;
    Icecream(){
        System.out.println("This is default constructor......!");
    }
    Icecream(String s, String t, double p){
        com=s;
        type=t;
        price=p;
    }

    
    void set_com(String c){
        com=c;
    }
    String get_com(){
        return com;
    }
    
    void set_type(String t){
        type=t;
    }
    String get_type(){
        return type;
    }
    
    void set_price(double p){
        price=p;
    }
    double get_price(){
        return price;
    }
    
    void to_string(){
        System.out.println("\nCompany: "+com);
        System.out.println("Type: "+type);
        System.out.println("Price: "+price+"\n");
    }
    
}
