package homework;

import java.util.Date;
import java.util.Scanner;

public class Store {
   private Scanner scanner = new Scanner(System.in);
    private Date date = new Date();
    private String productName;
   private double price;
   private int quantity;

    public Store(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }



    public String printReceipt (){
        System.out.println("Enter name of product");
        String productName = scanner.nextLine();

        System.out.println("Enter price:");
        double price = scanner.nextDouble();

        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();

        String dayMonthYear = String.format("%tA %tB %td", date, date, date);


         return
                "Name" + "  QTY  " + "  Price  " + "  Total  " +
                "\n---- " + " ---- " + " ---- " + " -----" +
                 "\n"+productName + "  " + quantity + "  " + price + "  " + (quantity * price) +
                "\nThank you come again!" +
                "\nPurchased on " + dayMonthYear +
                "\n----------------------------------------------";

    }
}
