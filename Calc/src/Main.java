import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean i = true;

        while (i) {
            System.out.print("Введите знак операции: ");
            String operation = scanner.next();

            if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
                System.out.println(operation);

                System.out.println("Введите первое число: ");
                double a = scanner.nextDouble();

                System.out.println("Введите второе число: ");
                double b = scanner.nextDouble();

                switch (operation) {
                    case "+": {
                        System.out.println("Сумма чисел: " + (a + b));
                        break;
                    }
                    case "-": {
                        System.out.println("Разность чисел: " + (a - b));
                        break;
                    }
                    case "*": {
                        System.out.println("Произведение чисел: " + (a * b));
                        break;
                    }
                    case "/": {
                        System.out.println("Частное чисел: " + (a / b));
                        break;
                    }
                }
                System.out.println("Выйти? (да/нет)");
                String exit = scanner.next();
                if (exit.equals("да")) {
                    i = false;
                }
            } else break;
        }
    }
}