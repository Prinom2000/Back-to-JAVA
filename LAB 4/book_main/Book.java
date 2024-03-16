
package book_main;
public class Book {
    private int isbn, noOfPages, count;
    private String bookTitle;
    Book() {
        count = 0;
    }
    Book(int is, String title, int pgn) {
        isbn = is;
        bookTitle = title;
        noOfPages = pgn;
        updateCount();
    }
    public void updateCount(){
        count++;
    }
    
    public String toString() {
        return "Book Name: " + bookTitle + "\nISBN: " + isbn + "\nNumber of Pages: " + noOfPages;
    }
    public int compareTo(Book b) {
        if (this.getNumberofPages() > b.getNumberofPages()) {
            return 1;
        }
        if (this.getNumberofPages() == b.getNumberofPages()) {
            return 0;
        } else {
            return -1;
        }
    }
    
    public void displayAll(Book[] b) {
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i].toString());
        }
        System.out.println();
    }
    
    public void setIsbn(int is){
        isbn = is;
    }
    public void setTitle(String t){
        bookTitle = t;
    }
    public void setNumberofPages(int pgno){
        noOfPages = pgno;
    }
    public int getIsbn(){
        return isbn;
    }
    public String getTitle() {
        return bookTitle;
    }

    public int getCount() {
        return count;
    }

    public int getNumberofPages() {
        return noOfPages;
    }
}
