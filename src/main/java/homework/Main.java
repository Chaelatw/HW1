package homework;

public class Main {
    public static void main(String[] args) {
        Store receipt = new Store("pancakes", 15.00, 5);
        System.out.println(receipt.printReceipt());
    }
}
