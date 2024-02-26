package oppsAssignment;

public abstract class Product implements Purchasable{
    protected String productName;
    protected String productId;
    protected  double price;
    protected int quantity;

    public Product(String productName, String productId, double price,int quantity) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantity=quantity;
    }
}
