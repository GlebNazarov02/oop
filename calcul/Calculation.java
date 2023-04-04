package calcul;

public class Calculation extends Calculator {
    public Calculation(double firstOperand, double secondOperand, String Operation) {
        super(firstOperand, secondOperand,Operation);
    }

    public String operation(String Operation) {
        switch (Operation) {
            case "+":
                return (String.format("%.2f + %.2f = %.2f", getFirst(), getSecond(), summa()));
            case "-":
                return String.format("%.2f - %.2f = %.2f", getFirst(), getSecond(), difference());
            case "*":
                return String.format("%.2f * %.2f = %.2f", getFirst(), getSecond(), multiply());
            case "/":
                return String.format("%.2f / %.2f = %.2f", getFirst(), getSecond(), devide());
            default:
                return null;
        }
    }
}