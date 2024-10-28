public class Main {
    public static void main(String[] args) {
        int money = 25, price = 3, wrap = 6;

        System.out.println("Максимальное количество шоколадок: " + calculateMaxChocoCount(money, price, wrap));
    }

    // Метод для вычисления максимального количества шоколадок
    public static int calculateMaxChocoCount(int money, int price, int wrap) {
        // Определение количества шоколадок, которые можно купить, и начальное количество оберток
        int chocolates = money / price, wrappers = chocolates;

        // Получаем доп. шоколадки
        while (wrappers >= wrap) {
            chocolates += wrappers / wrap; // прибавление шоколадок, полученных за обертки
            wrappers = wrappers / wrap + wrappers % wrap; // обновление количества оберток
        }

        return chocolates; // Возвращаем количество шоколадок
    }
}