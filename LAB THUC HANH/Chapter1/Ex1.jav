public class Rectangle{
    private double width;
    private double length;
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public double calculateArea(){
        return width * length;
    }
    public double calculatePerimeter(){
        return 2 * (width + length);
    }
    public void displayInfo(){
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}