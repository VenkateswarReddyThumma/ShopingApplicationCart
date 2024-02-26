package oppsAssignment;

public class Food extends Product{
    private String ingredients;

    public Food(String productName, String productId, double price, String ingredients,int quantity) {
        super(productName, productId, price,quantity);
        this.ingredients = ingredients;
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
        return "Food{" +
                "ingredients='" + ingredients + '\'' +
                ", productName='" + productName + '\'' +
                ", productId='" + productId + '\'' +
                ", price=" + price +
                "} " + super.toString();
    }
}
