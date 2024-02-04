package CurrencyExchange;

import java.util.ArrayList;

/*
Сохранение истории обмена:
Приложение должно сохранять историю всех совершенных обменов.
История должна включать дату и время обмена, сумму и типы обмениваемых валют.
Должна быть предусмотрена возможность просмотра истории обменов.
Для этого, должно быть разработано элементарное консольное меню.
 */
public class ExchangeHistory {

  private final ArrayList<Exchange> exchangeHistory;

  public ExchangeHistory() {
    this.exchangeHistory = new ArrayList<>();
  }

  public void saveExchange(double amount, String fromCurrency, String toCurrency) {
    Exchange exchange = new Exchange(amount, fromCurrency, toCurrency);
    exchangeHistory.add(exchange);
    System.out.println("Обмен сохранен в истории.");
  }


  public void viewHistory() {
    if (exchangeHistory.isEmpty()) {
      System.out.println("История обменов пуста.");
    } else {
      for (Exchange exchange : exchangeHistory) {
        System.out.println("История обменов: ");
        System.out.println("Дата и время: " + exchange.getDateTime());
        System.out.printf("Сумма: %.2f %s обменяли в: %.2f %s%n",
            exchange.getAmount(), exchange.getFromCurrency(),
            UserInterface.exchangeCurrency(exchange.getAmount(),
                exchange.getFromCurrency(), exchange.getToCurrency()),
            exchange.getToCurrency());

        System.out.println();
      }
    }
  }
}
