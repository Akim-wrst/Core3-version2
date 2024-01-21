package task.io;

// TODO: Напишите программу, которая делит одно число на другое и выводит результат. Обработайте
//  исключение, если введены некорректные данные (например, вместо числа введена строка).

class DivisionException {
    static void division(Integer value, Integer value2) {
        int result = value / value2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        try {
            DivisionException.division(Integer.valueOf("sdsd"), Integer.valueOf("sds"));
        } catch (NumberFormatException nfe) {
            System.out.println(nfe + "(Введите целочисленный тип переменной)");
        }
    }
}
