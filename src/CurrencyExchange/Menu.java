package CurrencyExchange;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
  private static void exchangeCurrencyOption() {
    Scanner scanner = new Scanner(System.in);

    // Ввод данных от пользователя
    System.out.print("Введите сумму для обмена: ");
    double amount = scanner.nextDouble();

    System.out.print("Введите валюту для обмена (USD, EUR, GBP, LEI, RON): ");
    String fromCurrency = scanner.next().toUpperCase();

    System.out.print("Введите валюту, которую хотите приобрести (USD, EUR, GBP, LEI, RON): ");
    String toCurrency = scanner.next().toUpperCase();

    // Обмен валюты
    double result = UserInterface.exchangeCurrency(amount, fromCurrency, toCurrency);

    // Вывод результата
    if (result != -1) {
      System.out.printf("%.2f %s равно %.2f %s%n", amount, fromCurrency, result, toCurrency);
    }
  }

  public static void main(String[] args) {

    while (true) {
      try {
        Scanner scanner = new Scanner(System.in);
        // Вывод главного меню

        System.out.println("Главное меню:");
        System.out.println("1. Обмен валюты");
        System.out.println("2. Выход");
        System.out.print("Выберите опцию: ");

        int choice = scanner.nextInt();
        System.out.println("Выбор: " + choice);
        switch (choice) {
          case 1:
            exchangeCurrencyOption();
            break;
          case 2:
            System.out.println("Выход из программы. До свидания!");
            System.exit(0);
          default:
            System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
        }
      } catch (InputMismatchException e) {
        System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
      }
    }
  }
}
