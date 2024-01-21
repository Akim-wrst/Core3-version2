package task.io;

// TODO: Создайте метод, который преобразует строку в число. Обработайте исключение, если строка не
//  может быть преобразована в число.
public class StringParse {
    public static void stringParseInt(String string) {
        try {
            int result = Integer.parseInt(string);
            System.out.println(string);
        } catch (Exception e) {
            System.out.println(e + "(Невозможно преобразовать в int)");
        }
    }

    public static void main(String[] args) {
        StringParse.stringParseInt("sdsd");

    }
}
