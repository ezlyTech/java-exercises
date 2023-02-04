import java.lang.Math;

public class Triangle extends GeometricObject {
    
    public double side1 = 1.0;
    public double side2 = 1.0;
    public double side3 = 1.0;
    
    Triangle() {
    }
    
    Triangle( double side1, double side2, double side3 ) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public double getSide1() {
        return this.side1;
    }
    
    public double getSide2() {
        return this.side2;
    }
    
    public double getSide3() {
        return this.side3;
    }
    
    public double getArea() {
        double s, area;
        s = ( this.side1 + this.side2 + this.side3 ) / 2;
        area = Math.sqrt( s * ((s - this.side1) * (s - this.side2) * (s - this.side3)) );
        
        return area;
    }
    
    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }
    
    @Override
    public String toString() {
        return "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3;
    }
}
