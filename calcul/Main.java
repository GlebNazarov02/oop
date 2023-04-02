package calcul;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final Pattern operationPattern = Pattern

                .compile("^([-+]?[0-9]{1,}[.,]?[0-9]*)([+\\-*\\/])([0-9]{1,}[.,]?[0-9]*)$");

        while (true) {

            String chislo_operator = scanner.nextLine();

            Matcher matcher = operationPattern.matcher(chislo_operator);

            if (matcher.matches()) {

                Calculator calc = new Calculator();

                calc.setFirstOperand(matcher.group(1));

                calc.setOperator(matcher.group(2));

                calc.setSecondOperand(matcher.group(3));

                System.out.println(calc.getResult());

            }

            if (chislo_operator.equals("exit")) {

                break;

            }
        }
        scanner.close();
    }
}