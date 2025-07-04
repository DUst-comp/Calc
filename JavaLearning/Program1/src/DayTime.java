import java.util.InputMismatchException;
import java.util.Scanner;

public class DayTime { // программа для определения времени суток по часу
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // подгружаем ввод через консоль
        System.out.print("Введите час: ");
        try {
            int time = in.nextInt(); // получаем час от юзера
            System.out.println(daytime(time)); // выводим результат
        } catch (InputMismatchException e) {
            System.out.println("Ошибка! Введите цифру.");
        }
        in.close();
    }

    static String daytime(int time) { // получаем час
        return switch (time) { // выводим результат свитча
            case 0, 1, 2, 3 -> "Сейчас ночь";
            case 4, 5, 6, 7, 8, 9, 10, 11 -> "Сейчас утро";
            case 12, 13, 14, 15, 16 -> "Сейчас день";
            case 17, 18, 19, 20, 21, 22, 23 -> "Сейчас вечер";
            default -> "Неверно указано время";
        };
    }
}
