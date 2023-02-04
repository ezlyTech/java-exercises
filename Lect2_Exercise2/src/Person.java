public class Person {
    
    public String name = "unknown";
    public String address = "unknown";
    public String phone = "unknown";
    public String email = "unknown";
    
    Person() {
        // ...
    }
    
    Person( String name, String address, String phone, String email ) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    
    // getter
    public String getName() {
        return this.name;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public String gePhone() {
        return this.phone;
    }
    
    public String getEmail() {
        return this.email;
    } 
    // !-- getter-end
    
    // setter
    public void setName( String name ) {
        this.name = name;
    }
    
    public void setAddress( String address ) {
        this.address = address;
    }
    
    public void setPhone( String phone ) {
        this.phone = phone;
    }
    
    public void setEmail( String email ) {
        this.email = email;
    } 
    // !-- setter-end
    
    
    // Description method
    public String toString() {
        return "\nName: " + name + "\nAddress: " + address + "\nPhone number: " + phone + "\nEmail address: " + email;
    }
}
