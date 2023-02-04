public class Staff extends Employee {
    
    public String title;
    
    Staff( 
        String name, 
        String address, 
        String phone, 
        String email, 
        int officeNo, 
        double salary, 
        String title 
    ) 
    {
        super( name, address, phone, email, officeNo, salary );
        this.title = title;
    }
    
    public String getTitle() {
        return this.title;
    } 
    
    public void setTitle( String title ) {
        this.title = title;
    }
    
    // Description method
    @Override
    public String toString() {
        return super.toString() + "\nTitle: " + title;
    }
    
}
