import java.lang.Math;

public class RegularPolygon {
    
    private int n = 3;                     // # of sides
    private double side = 1;        // length of sides
    private double x = 0;             // x-coordinate of the center
    private double y = 0;            // y-coordinate of the center
    
    RegularPolygon() {
    }
    
    RegularPolygon( int sides, double length ) {
        this.n = sides;
        this.side = length;
        this.x = 0;
        this.y = 0;
    }
    
    RegularPolygon( int sides, double length, double x, double y ) {
        this.n = sides;
        this.side = length;
        this.x = x;
        this.y = y;
    }
    
    public int getNumberOfSides() {
        return this.n;
    }
    
    public double getLengthOfSides() {
        return this.side;
    }
    
    public double getX_Coordinate() {
        return this.x;
    }
    
    public double getY_Coordinate() {
        return this.y;
    }
    
    public void setNumberOfSides( int sides ) {
        this.n = sides;
    }
    
    public void setLengthOfSides( double length ) {
        this.side = length;
    }
    
    public void setX_Coordinate( double x ) {
        this.x = x;
    }
    
    public void setY_Coordinate( double y ) {
        this.y = y;
    }
    
    public double getPerimeter() {
        return this.n * this.side;
    }
    
    public double getArea() {
        double numerator, denominator, s_squared, tan, area; 
        
        s_squared = this.side * this.side;
        numerator = this.n * s_squared;
        tan = Math.tan( Math.PI / this.n );
        denominator = 4 * tan;
        
        area = numerator / denominator;
        
        return area;
    }
}
