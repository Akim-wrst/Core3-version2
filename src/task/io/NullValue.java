package task.io;

// TODO: Создайте метод, который делит два числа и возвращает результат. Обработайте исключение,
//  если второе число равно нулю
public class NullValue {

    public static void nullValueException(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (NullPointerException npe) {
            if (b == 0) {
                System.out.println(npe);
            }
        }
    }

    public static void main(String[] args) {
        NullValue.nullValueException(20, 0);

    }
}
