package calcul;

public class Calculator implements Operations{
    private double firstOperand;
    private double secondOperand;
    private String Operation;

    public Calculator(double firstOperand, double secondOperand, String Operation) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.Operation = Operation;
    }
    public double getFirst() {
        return firstOperand;
    }

    public double getSecond() {
        return secondOperand;
    }
    
    public String getOperation() {
        return Operation;
    }

    public void setFirstOperand(String operandStr) {
        firstOperand = Double.parseDouble(operandStr);
    }

    public void setSecondOperand(String operandStr) {
        secondOperand = Double.parseDouble(operandStr);
    }
  
    public double summa() {
        double summ = firstOperand + secondOperand;
        return summ;
    }
  
    public double difference() {
        double diff = firstOperand - secondOperand;
        return diff;
    }
   
    public double multiply() {
        double mult = firstOperand * secondOperand;
        return mult;
    }

    public double devide() {
        double dev = firstOperand / secondOperand;
        return dev;
    }
}