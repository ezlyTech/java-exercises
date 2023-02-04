/**
 * Programming Exercise #1
 * (The Rectangle class) design a class named Rectangle to represent a rectangle. The class contains:
 
 * Two double data fields named width and height that specify the width and height of the
   rectangle. The default values are 1 for both width and height.
 * A no-arg constructor that creates a default rectangle.
 * A constructor that creates a rectangle with the specified width and height.
 * A method named getArea() that returns the area of this rectangle.
 * A method named getPerimeter() that returns the perimeter
   Write a program that creates two Rectangle objects—one with width 4 and height 40 and the other with
   width 3.5 and height 35.9. Display the width, height, area, and perimeter of each rectangle in this order.
 */

public class Main {
    public static void main(String[] args) {
                
        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon( 6, 4 );
        RegularPolygon p3 = new RegularPolygon( 10, 4, 5.6, 7.8 );
        
        System.out.println( "1st Regular Polygon:" );
        System.out.println( "Perimeter: " + p1.getPerimeter() );
        System.out.println( "Area: " + p1.getArea() + "\n");
        
        System.out.println( "2nd Regular Polygon:" );
        System.out.println( "Perimeter: " + p2.getPerimeter() );
        System.out.println( "Area: " + p2.getArea() + "\n");
        
        System.out.println( "3rd Regular Polygon:" );
        System.out.println( "Perimeter: " + p3.getPerimeter() );
        System.out.println( "Area: " + p3.getArea() );
        
    }
}
