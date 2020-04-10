package my.labs.first;

import java.util.Objects;

public class Seller implements Client {
    String fullName = null;
    Bill bill;

    public Seller(String fullName) {
        this.fullName = fullName;
    }

    public Seller() {
        this.fullName = fullName;
        this.bill = bill;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    @Override
    public CreditCard getCreditCard() {
        return null;
    }

    @Override
    public void setCreditCard(CreditCard creditCard) {

    }

    @Override
    public String toString() {
        return "Seller{" +
                "fullName='" + fullName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seller)) return false;
        Seller seller = (Seller) o;
        return Objects.equals(fullName, seller.fullName);
    }


    @Override
    public boolean payForOrder(Order order) {
        try {
            throw new Exception("I not doing it because I'm making money");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean transferToBill(Bill bill, int amountMoneyToTransfer) {
        return false;
    }

    @Override
    public boolean transferToCard(CreditCard card, int amountMoneyToTransfer) {
        return false;
    }

    @Override
    public boolean blockCreditCard() {
        return false;
    }

    @Override
    public boolean emptyBill() {
        return false;
    }
}
