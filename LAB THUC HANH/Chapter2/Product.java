public class Product {
    private String name;
    private double price;
    private int quantity;
    public Product(){
        this("Unknown", 0 , 0);
    }
    public Product(String name, double price){
        this(name, price, 0);
    }
    public Product(String name, double price, int quantity){
        if(name == null || name.isEmpty() == true){
            throw new IllegalArgumentException("Name must not be null or empty");
        }
        if(price < 0){
            throw new IllegalArgumentException("Price must be positive");
        }
        if(quantity < 0){
            throw new IllegalArgumentException("Quantity must be positive");
        }
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public void setName(String name){
        if(name == null || name.isEmpty() == true){
            throw new IllegalArgumentException("Name must not be null or empty");
        }
        this.name = name;
    }
    public void setPrice(double price){
        if(price < 0){
            throw new IllegalArgumentException("Price must be positive");
        }
        this.price = price;
    }
    public void setQuantity(int quantity){
        if(quantity < 0){
            throw new IllegalArgumentException("Quantity must be positive");
        } 
        this.quantity = quantity;
    }
    String getName(){
        return this.name;
    }
    double getPrice(){
        return this.price;
    }
    double getQuantity(){
        return this.quantity;
    }
}
