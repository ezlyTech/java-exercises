public class Main {
    public static void main(String[] args) {
        
        Triangle t = new Triangle( 1, 1.5, 1 );
        
        t.setColor( "yellow" );
        t.setFilled( true );
        
        System.out.println( "Area: " + t.getArea() );
        System.out.println( "Perimeter: " + t.getPerimeter() );
        System.out.println( "Color: " + t.getColor() );
        System.out.println( "Filled: " + t.getFilled() );
        
    }
}
