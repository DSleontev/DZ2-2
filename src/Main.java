public class Main {
    public static void main(String[] args) {

        int balans = 100;  // начальный баланс
        int refill = 10000; //пополнение баланса
        int bonus;

        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int newBalans = balans + refill + bonus;

        System.out.println("Итоговый баланс "+ (newBalans));

    }
}