package oppsAssignment;

public class FootWear extends Product {
    private String  Size;

    public FootWear(String productName, String productId, double price, String size,int quantity) {
        super(productName, productId, price,quantity);
        Size = size;
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
        return "FootWear{" +
                "Size='" + Size + '\'' +
                ", productName='" + productName + '\'' +
                ", productId='" + productId + '\'' +
                ", price=" + price +
                "} " + super.toString();
    }
}
