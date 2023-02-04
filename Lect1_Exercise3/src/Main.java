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
