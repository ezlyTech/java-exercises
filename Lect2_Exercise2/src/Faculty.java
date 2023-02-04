public class Faculty extends Employee {
    
    public String officeHours;
    public String rank;
    
    Faculty( 
        String name, 
        String address, 
        String phone, 
        String email, 
        int officeNo, 
        double salary,
        String officeHours,
        String rank
    ) 
    {
        super( name, address, phone, email, officeNo, salary );
        this.officeHours = officeHours;
        this.rank = rank;
    }
    
    // getter    
    public String getOfficeHours() {
        return this.officeHours;
    }
    
    public String getRank() {
        return this.rank;
    } 
    // !-- getter-end
    
    
    // setter
    public void setOfficeHours( String officeHours ) {
        this.officeHours = officeHours;
    }
    
    public void setRank( String rank ) {
        this.rank = rank;
    } 
    // !-- setter-end
    
    
    // Description method
    @Override
    public String toString() {
        return super.toString() + "\nOffice hours: " + officeHours + "\nRank: " + rank;
    }
}
