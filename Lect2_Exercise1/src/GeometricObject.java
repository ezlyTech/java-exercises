public class GeometricObject {
    
    public String color = "white";
    public boolean filled = false;
    
    GeometricObject() {
    }
            
    GeometricObject( boolean filled, String color ) {
        this.filled = filled;
        this.color = color;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public boolean getFilled() {
        return this.filled;
    }
    
    public void setColor( String color ) {
        this.color = color;
    }
    
    public void setFilled( boolean filled ) {
        this.filled = filled;
    }
    
    @Override
    public String toString() {
        return "Color: " + this.color + " and filled: " + this.filled;
    }
}
