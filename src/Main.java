public class Main {
    public static void main(String[] args) {

        int x = 100;  // начальный баланс
        int y = 10000; //пополнение баланса
        int bonus;

        if (y > 1000) {
            bonus = y / 100;
        } else {
            bonus = 0;
        }
        int z = x + y + bonus;

        System.out.println("Итоговый баланс "+ z);

    }
}