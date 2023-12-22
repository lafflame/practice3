public class Circle extends Shape {
    protected double radius;

    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(){
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }

    public double Perimeter(){
        return 2 * 3.14 * radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}