package task.io;

// TODO: Создайте класс, который представляет банковский счет. Реализуйте метод для снятия денег со
//  счета. Обработайте исключение, если на счете недостаточно средств.
class ScoreException extends Exception {
    ScoreException(String s) {
        super(s);
    }
}

public class BankAccount {
    private static int wallet = 550;

    static void wallet(int money) {
        try {
            wallet -= money;
            if (wallet < 0) {
                throw new ScoreException("Недостаточно средств");
            } else {
                System.out.println(wallet);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        BankAccount.wallet(540);
        BankAccount.wallet(11);


    }
}
