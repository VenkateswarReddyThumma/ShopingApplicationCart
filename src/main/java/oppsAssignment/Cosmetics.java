package oppsAssignment;

public class Cosmetics extends Product{
    private String color;

    public Cosmetics(String productName, String productId, double price, String color,int quantity) {
        super(productName, productId, price,quantity);
        this.color = color;
    }

    @Override
    public void addToCart() { System.out.println("Item added to the cart");
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
        return "Cosmetics{" +
                "color='" + color + '\'' +
                ", productName='" + productName + '\'' +
                ", productId='" + productId + '\'' +
                ", price=" + price +
                "} " + super.toString();
    }
}
