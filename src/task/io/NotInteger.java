package task.io;

import java.util.Scanner;

// TODO: Напишите программу, которая считывает число с клавиатуры и выводит его квадрат. Обработайте
//  исключение, если введено не число
public class NotInteger {
    public static void notIntegerException(Scanner scanner) {
        try {
            int result = scanner.nextInt();
            System.out.println(result * result);
        } catch (Exception e) {
            System.out.println(e + "(Введите целое число!)");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NotInteger.notIntegerException(scanner);
    }
}
