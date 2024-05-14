
package lab_8_prob2;

class MyException extends Exception {
    // Constructor accepting a string message
    public MyException(String message) {
        super(message);
    }
}


class Product {
    // Method to check product weight
    public void productCheck(int weight) throws MyException {
        if (weight < 100) {
            throw new MyException("Product is invalid, Weight is less then 100...!");
        } else {
            System.out.println("Product weight: " + weight);
        }
    }
    
    // Main method
    public static void main(String[] args) {
        // Create an object of Product class
        Product product = new Product();
        
        // Call productCheck method to display the weight of the product
        try {
            product.productCheck(1); // Change weight here to test
        } catch (MyException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}