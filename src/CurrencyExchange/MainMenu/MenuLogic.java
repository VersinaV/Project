/*package CurrencyExchange.MainMenu;

public class MenuLogic {

private static void exchangeCurrencyOption() {
    Scanner scanner = new Scanner(System.in);

    // Ввод данных от пользователя
    System.out.print("Введите сумму для обмена: ");
    double amount = scanner.nextDouble();

    System.out.print("Введите валюту для обмена (USD, EUR, GBP, MDL, RON, UAH): ");
    String fromCurrency = scanner.next().toUpperCase();

    System.out.print("Введите валюту, которую хотите приобрести (USD, EUR, GBP, MDL, RON, UAH): ");
    String toCurrency = scanner.next().toUpperCase();

    // Вызов метода обмена в ExchangeHistory и сохранение результата
    double result = UserInterface.exchangeCurrency(amount, fromCurrency, toCurrency);
    exchangeHistory.saveExchange(amount, fromCurrency, toCurrency);
    // Вывод результата
    if (result != -1) {
      System.out.printf("%.2f %s равно %.2f %s%n", amount, fromCurrency, result, toCurrency);
    }
  }

}

 */
