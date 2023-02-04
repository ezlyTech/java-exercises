public class Employee extends Person {
    
    public int officeNo;
    public double salary;
    
    Employee( String name, String address, String phone, String email, int officeNo, double salary ) {
        super( name, address, phone, email );
        this.officeNo = officeNo;
        this.salary = salary;
    }
    
    // getter    
    public int getOfficeNo() {
        return this.officeNo;
    }
    
    public double getSalary() {
        return this.salary;
    } 
    // !-- getter-end
    
    // setter
    public void setOfficeNo( int officeNo ) {
        this.officeNo = officeNo;
    }
    
    public void setSalary( double salary ) {
        this.salary = salary;
    } 
    // !-- setter-end
    
    
    // Description method
    @Override
    public String toString() {
        return super.toString() + "\nOffice No: " + officeNo + "\nSalary: $" + getSalary();
    }
}
