public class Square extends Rectangle{
    protected double side;
    Square(){
        super();
    }

    Square(double side){
        this.side = side;
    }

    Square(double side, double width, double length){
        super(width, length);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public  void  setLength(double length){
        this.length = length;
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                ", length=" + length +
                ", width=" + width +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
