public class Main {
    
    public static void main(String[] args) {
        
        BasicCalculator bc = new BasicCalculator();
        bc.setNumber(12, 5);
        bc.add();
        
        System.out.println(bc.getNumber());
    }
    
}
