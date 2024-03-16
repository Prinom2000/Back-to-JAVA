
package book_main;

import java.util.Scanner;



public class Book_Main {

    public static boolean isHeavier(Book b) {
        //checks if book pgno > 500
        if (b.getNumberofPages() > 500) {
            return true;
        } else {
            return false;
        }
    }
    // dispaying all book info
    
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Book[] b = new Book[5];
        int count = 0;

        for (int i = 0; i < b.length; i++) {
            b[i] = new Book();
            System.out.println("Enter book isbn no:");
            int isbn = inp.nextInt();
            System.out.println("Enter book title: ");
            String title = inp.nextLine();
            System.out.println("Enter book page number: ");
            int pgno = inp.nextInt();
            b[i] = new Book(isbn, title, pgno);
        }
        // display all object info
        for (int i = 0; i < b.length; i++) {
            b[i].displayAll(b);
        }
        // compare any two objects by method calling
        System.out.println(b[0].compareTo(b[1]));
        // check to see if book is heavy
        if (isHeavier(b[2])) {
            System.out.println("The book" + b[2].getTitle() + "is heavy");
        } else {
            System.out.println("The book" + b[2].getTitle() + "is not heavy");
        }

        inp.close();
    }
    
}
