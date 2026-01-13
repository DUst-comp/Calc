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
            String operation = scanner.next(); // ввод операции

            if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) { // проверка на ввод именно операции
                System.out.println(operation); // вывод операции

                System.out.println("Введите первое число: ");
                double a = scanner.nextDouble(); // ввод первого числа

                System.out.println("Введите второе число: ");
                double b = scanner.nextDouble(); // ввод второго числа

                switch (operation) { // выбор действий для каждого оператора
                    case "+": {
                        System.out.println("Сумма чисел: " + (a + b)); // сумма
                        break;
                    }
                    case "-": {
                        System.out.println("Разность чисел: " + (a - b)); // разность
                        break;
                    }
                    case "*": {
                        System.out.println("Произведение чисел: " + (a * b)); // произведение
                        break;
                    }
                    case "/": {
                        System.out.println("Частное чисел: " + (a / b)); // частное
                        break;
                    }
                }
                System.out.println("Выйти? (да/нет)");
                String exit = scanner.next(); // ввод намерения выйти или остаться
                if (exit.equals("да")) { // проверка ввода
                    i = false;
                }
            } else break;
        }
    }
}