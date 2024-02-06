package CurrencyExchange;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/*
Сохранение истории обмена:
Приложение должно сохранять историю всех совершенных обменов.
История должна включать дату и время обмена, сумму и типы обмениваемых валют.
Должна быть предусмотрена возможность просмотра истории обменов.
Для этого, должно быть разработано элементарное консольное меню.
 */
public class ExchangeHistory {

  private final ArrayList<Exchange> exchangeHistory;
  private final File file;


  public ExchangeHistory() {
    this.exchangeHistory = new ArrayList<>();
    this.file = new File("file.exchangeHistory");
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
      System.out.println("История обменов: ");
      for (Exchange exchange : exchangeHistory) {
        String exchangeInfo = String.format("Сумма: %.2f %s обменяли в %.2f %s%n",
            exchange.getAmount(), exchange.getFromCurrency(),
            UserInterface.exchangeCurrency(exchange.getAmount(),
                exchange.getFromCurrency(), exchange.getToCurrency()),
            exchange.getToCurrency());
        System.out.print(exchange.getDateTime() + " ");
        System.out.println(exchangeInfo);

        writeToFile(exchangeInfo);
      }
    }
  }

  private void writeToFile(String exchangeInfo) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
      bw.write(exchangeInfo);
      bw.newLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}