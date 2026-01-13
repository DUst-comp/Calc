import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Задача при написании данной программы:
         * Сделать калькулятор. Он должен принимать одно из 4 арифметических действий
         * после 2 числа и выводить результат, а затем спрашивать о желании выйти или продолжить.
         *
         * Операция должна получаться именно через scanner.next() */

        Scanner scanner = new Scanner(System.in); // Подключаем сканер
        boolean i = true; // Переменная для проверки желания выйти из программы

        while (i) { // цикл
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