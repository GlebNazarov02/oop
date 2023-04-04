package calcul;

import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        while (true) {
            System.out.print("First number: ");
            double firstOperand = scanner.nextDouble();
            System.out.print("Operation: ");
            String Operation = scanner.next();
            System.out.print("Second number: ");
            double secondOperand = scanner.nextDouble();
            Calculation calcculation = new Calculation(firstOperand, secondOperand, Operation);
            System.out.println(calcculation.operation(Operation));
            

            if (scanner.next().equals("exit")) {

                break;

            }
        }
        scanner.close();
    }
}