package CurrencyExchange;

import java.util.Date;

public class Exchange {

  private double amount;
  private String fromCurrency;
  private String toCurrency;
  private String resultAmount;
  private final Date dateTime;

  // Используем конструктор с параметрами для правильной инициализации полей
  public Exchange(double amount, String fromCurrency, String toCurrency) {
    this.amount = amount;
    this.fromCurrency = fromCurrency;
    this.toCurrency = toCurrency;
    this.resultAmount = resultAmount;
    this.dateTime = new Date();
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public String getFromCurrency() {
    return fromCurrency;
  }

  public void setFromCurrency(String fromCurrency) {
    this.fromCurrency = fromCurrency;
  }

  public String getToCurrency() {
    return toCurrency;
  }

  public String getResultAmount() {
    return resultAmount;
  }

  public void setResultAmount(String resultAmount) {
    this.resultAmount = resultAmount;
  }

  public void setToCurrency(String toCurrency) {
    this.toCurrency = toCurrency;
  }

  public Date getDateTime() {
    return dateTime;
  }

  @Override
  public String toString() {
    return "Exchange{" +
        "amount=" + this.amount +
        ", fromCurrency='" + this.fromCurrency + '\'' +
        ", toCurrency='" + this.toCurrency + '\'' +
        ", dateTime=" + dateTime +
        '}';
  }
}