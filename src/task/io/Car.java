package task.io;

// TODO: Создайте класс, который представляет автомобиль. Реализуйте метод для запуска двигателя.
//  Обработайте исключение, если двигатель уже запущен.
class IgnitionException extends Exception {
    IgnitionException(String s) {
        super(s);
    }
}

public class Car {
    private static int Alfa = 0;

    static void ignition() {
        try {
            if (Alfa == 1) {
                throw new IgnitionException("Двигатель уже рабоатет");
            }
            Alfa += 1;
            System.out.println("Двигатель запущен");
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Car.ignition();
        Car.ignition();


    }
}
