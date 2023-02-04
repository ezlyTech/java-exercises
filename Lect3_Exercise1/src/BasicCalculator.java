 public class BasicCalculator extends BasicMathOperation implements NumberInterfaceListener {
    
    public double num1;
    public double num2;
    public double result;

    @Override
    public void add() {
        this.result = num1 + num2;
    }

    @Override
    public void subtract() {
        this.result = num1 - num2;
    }

    @Override
    public void divide() {
        this.result = num1 / num2;
    }

    @Override
    public void multiply() {
        this.result = num1 * num2;
    }

    @Override
    public void setNumber(double n1, double n2) {
        this.num1 = n1;
        this.num2 = n2;
    }

    @Override
    public double getNumber() {
        return this.result;
    }
    
}
