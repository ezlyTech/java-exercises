public class Student extends Person {
    
    public int status;
    public final static int FRESHMAN = 1;
    public final static int SOPHOMORE = 2;
    public final static int JUNIOR = 3;
    public final static int SENIOR = 4;
    
    Student( String name, String address, String phone, String email, int status ) {
        super( name, address, phone, email );
        this.status = status;
    }
    
    // getter and setter for status
    public int getStatus() {
        return this.status;
    }
    
    public void setStatus( int status ) {
        this.status = status;
    }
    
    // Description method
    @Override
    public String toString() {
        return super.toString() + "\nStatus: " + getStatus();
    }
    
}
