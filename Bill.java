package my.labs.first;

import java.util.Objects;

public class Bill {

    private String billNumber; // 16161616
    private int money;
    private Client client;

    public Bill(String billNumber, int money, Client client) {
        this.billNumber = billNumber;
        this.money = money;
        this.client = client;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billNumber='" + billNumber + '\'' +
                ", money=" + money +
                ", client=" + client +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bill)) return false;
        Bill bill = (Bill) o;
        return money == bill.money &&
                Objects.equals(billNumber, bill.billNumber) &&
                Objects.equals(client, bill.client);
    }

}
