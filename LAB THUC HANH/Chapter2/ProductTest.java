public class ProductTest {
    public static void main(String arg[]){
        Product p1 = new Product();
        System.out.println("Name: " + p1.getName());
        System.out.println("Price: " + p1.getPrice());
        System.out.println("Quantity: " + p1.getQuantity());

        Product p2 = new Product("Phone", 3300);
        System.out.println("Name: " + p2.getName());
        System.out.println("Price: " + p2.getPrice());
        System.out.println("Quantity: " + p2.getQuantity());

        try{
            new Product(null, 10000, 44);
        }catch(IllegalArgumentException e){
            System.out.println("Passed: Catch null name");
        }

        try{
            new Product("", 10000, 44);
        }catch(IllegalArgumentException e){
            System.out.println("Passed: Catch empty name");
        }
 

        Product p3 = new Product("Car", 10000, 44);
        System.out.println("Name: " + p3.getName());
        System.out.println("Price: " + p3.getPrice());
        System.out.println("Quantity: " + p3.getQuantity());

        try{
            p3.setName(null);
        }catch(IllegalArgumentException e){
            System.out.println("Passed: set null name");
        }

        try{
            p3.setName("");
        }catch(IllegalArgumentException e){
            System.out.println("Passed: set empty name");
        }

        try{
            p3.setPrice(-4);
        }catch(IllegalArgumentException e){
            System.out.println("Passed: set negative price");
        }

        try{
            p3.setQuantity(-10);
        }catch(IllegalArgumentException e){
            System.out.println("Passed: set negative quantity");
        }
    }
}
