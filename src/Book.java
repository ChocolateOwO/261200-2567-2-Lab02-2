public class Book {
    String title;
    String author;
    double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);

    }

    public void updatePrice(double newPrice) {
        if (newPrice >= 0) { // Ensure the price is non-negative
            price = newPrice;
        } else {
            System.out.println("invalid"); // Default to 0.0 if price is invalid
        }
    }

    public void applyDiscount(double discount) {
        if (discount > 0.0 && discount < 100.0) {
            double discounttotal = price * (discount/ 100);
            price -= discounttotal;
            System.out.printf("Discount of %.2f%% applied. New price: %.2f%n", discount, price);
        } else {
            System.out.println("Invalid discount percentage. Must be greater than 0 and less than 100.");
        }

    }
}




