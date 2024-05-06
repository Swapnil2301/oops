public class Circle {
    double radius;
    double circumference;
    public Circle(int radius){
        this.radius = radius;
        this.circumference = 2*3.14 * radius;
    }
    public double circumference(double radius){
        //circumference = (2*3.14)* radius;
        return circumference;
    }

    public static void main(String[] args) {
        Circle sscircle = new Circle(20);
        System.out.println("Radius of circle is "+sscircle.radius);
        System.out.println("Circumference is "+sscircle.circumference);
    }
}
