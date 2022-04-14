package thietkelop;

public class triangle extends shape{
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    public triangle() {}

    public triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {this.side1 = side1;}

    public double getSide2() {return side2;}

    public void setSide2(double side2) {this.side2 = side2;}

    public double getSide3() {return side3;}

    public void setSide3(double side3) {this.side3 = side3;}

    public double getdientich(){
        return side1*side1*Math.sqrt(3);
    }
    public double getchuvi(){
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "triangle{"+ super.toString() +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
