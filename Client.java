package my.labs.first;

public interface Client {



    boolean payForOrder(Order order);
    boolean transferToBill(Bill bill, int amountMoneyToTransfer);
    boolean transferToCard(CreditCard card, int amountMoneyToTransfer);
    boolean blockCreditCard();
    boolean emptyBill();

    Bill getBill();
    void setBill(Bill bill);
    CreditCard getCreditCard();
    void setCreditCard(CreditCard creditCard);
}
