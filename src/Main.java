public class Main {
    public static void main(String[] args) {
        Book unknownBook = new Book();
        unknownBook.displayDetails();
        Book hp1Book = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 350.00);
        hp1Book.displayDetails();
        hp1Book.updatePrice(32000.00);
        hp1Book.displayDetails();
        System.out.println("Applying a 25% discount:");
        hp1Book.applyDiscount(25.0); // Valid discount
        System.out.println();


    }


}
