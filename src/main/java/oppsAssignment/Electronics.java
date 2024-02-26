package oppsAssignment;

public class Electronics extends Product{
    private String type;

    public Electronics(String productName, String productId, double price, int quantity, String type) {
        super(productName, productId, price, quantity);
        this.type = type;
    }

    @Override
    public void addToCart() {
        System.out.println("Item added to the cart");
    }

    @Override
    public double calculateTotalPrice() {
        if(quantity>5){
            return  price*0.9*quantity;
        }
        return price*quantity;
    }
    @Override
    public String toString() {
        return "Electronics{" +
                "type='" + type + '\'' +
                ", productName='" + productName + '\'' +
                ", productId='" + productId + '\'' +
                ", price=" + price +
                "} " + super.toString();
    }
}
