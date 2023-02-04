public class Main {
    
    public static void main(String[] args) {
        
        Person person = new Person( "John", "Cavite, Philippines", "09123456781", "john@email.com" );
        Student student = new Student( "Eliz", "New Era, Dasmariñas", "09324953423", "eliz@email.com", Student.SOPHOMORE );
        Employee employee = new Employee( "Maria", "Silang, Cavite", "09899999993", "maria@email.com", 120, 50000 );
        Faculty faculty = new Faculty( "Jay", "Indang, Cavite", "09235482761", "jay@email.com", 320, 40000, "8am to 5pm", "Professor" );
        Staff staff = new Staff( "Linda", "Silang, Cavite", "09348672319", "linda@email.com", 213, 35000, "Professor Assistant" );
        
        System.out.println( "=== PERSON ===" + person.toString() );
	System.out.println( "\n=== STUDENT ===" + student.toString() );
	System.out.println( "\n=== EMPLOYEE ===" + employee.toString() );
	System.out.println( "\n=== FACULTY ===" + faculty.toString() );
	System.out.println( "\n=== STAFF ===" + staff.toString() );
        
    }
    
}
