package oppsAssignment;

public class Clothing extends Product {
    private String size;
    private String type;

    public Clothing(String productName, String productId, double price, String size, String type,int quantity) {
        super(productName, productId, price,quantity);
        this.size = size;
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
        return "Clothing{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                ", productName='" + productName + '\'' +
                ", productId='" + productId + '\'' +
                ", price=" + price +
                "} " + super.toString();
    }
}
