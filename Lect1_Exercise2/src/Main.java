public class Main {
    
    public static void main(String[] args) {
        
        Stock s = new Stock( "JAVA", "Sun" );
        
        s.previousClosingPrice = 4.5;
        s.currentPrice = 4.35;
        
        System.out.println( "Price-change Percentage: " + s.getChangePercent() + "%" );
        
    }
}