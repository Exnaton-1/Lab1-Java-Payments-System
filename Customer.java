package my.labs.first;

import java.util.Objects;

public class Customer implements Client {

    String fullName = null;
    Bill bill;
    CreditCard card;

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
        return card;
    }

    @Override
    public void setCreditCard(CreditCard creditCard) {
        this.card = creditCard;
    }

    public Customer(String fullName) {
        this.fullName = fullName;
    }

    public Customer(String fullName, Bill bill) {
        this.fullName = fullName;
        this.bill = bill;
    }

    public Customer(String fullName, CreditCard card) {
        this.fullName = fullName;
        this.card = card;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(fullName, customer.fullName);
    }


    @Override
    public boolean payForOrder(Order order) {
        Bill sourceBill = order.getSourceBill();
        Bill destinationBill = order.getDestinationBill();

        if (sourceBill.getMoney() < order.getPrice()) {
            return false;
        }

        // reserve money from customer
        sourceBill.setMoney(sourceBill.getMoney() - order.getPrice());
        // give money to seller
        destinationBill.setMoney(destinationBill.getMoney() + order.getPrice());
        return true;
    }

    @Override
    public boolean transferToBill(Bill targetBill, int amountMoneyToTransfer) {
        Bill sourceBill = this.bill;

        if (sourceBill.getMoney() < amountMoneyToTransfer) {
            return false;
        }

        // reserve money from customer
        sourceBill.setMoney(sourceBill.getMoney() - amountMoneyToTransfer);
        // give money to seller
        targetBill.setMoney(targetBill.getMoney() + amountMoneyToTransfer);
        return true;
    }

    @Override
    public boolean transferToCard(CreditCard targetCreditCard, int amountMoneyToTransfer) {
        CreditCard sourceCard = this.card;
        Bill sourceCardBill = null;
        Bill targetBill = null;
        try {
            sourceCardBill = sourceCard.getBill();
            targetBill = targetCreditCard.getBill();
        } catch (Exception e) {
            return false;
        }

        if (sourceCardBill.getMoney() < amountMoneyToTransfer) {
            return false;
        }

        // reserve money from customer
        sourceCardBill.setMoney(sourceCardBill.getMoney() - amountMoneyToTransfer);
        // give money to seller
        targetBill.setMoney(targetBill.getMoney() + amountMoneyToTransfer);
        return true;
    }

    @Override
    public boolean blockCreditCard() {
        this.card.setBlocked(true);
        return true;
    }

    @Override
    public boolean emptyBill() {
        bill.setMoney(0);
        return true;
    }
}
