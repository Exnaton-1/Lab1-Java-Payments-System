package my.labs.first;

import java.util.Objects;

public class CreditCard {
    private String number; // 1111-1111-1111-1111
    private String expireDate; // 04/22
    private String cardHolder; // Bob Johnson
    private int cvv; // 959
    private Bill bill;

    private boolean isBlocked = false;

    public CreditCard(String number, String expireDate, String cardHolder, int cvv, Bill bill) {
        this.number = number;
        this.expireDate = expireDate;
        this.cardHolder = cardHolder;
        this.cvv = cvv;
        this.bill = bill;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Bill getBill() throws Exception {
        if (this.bill.getMoney() < 1000) {
            this.setBlocked(true);
        }

        if (isBlocked) {
            throw new Exception("Card is blocked");
        }
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number='" + number + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", cardHolder='" + cardHolder + '\'' +
                ", cvv=" + cvv +
                ", bill=" + bill +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditCard)) return false;
        CreditCard that = (CreditCard) o;
        return cvv == that.cvv &&
                Objects.equals(number, that.number) &&
                Objects.equals(expireDate, that.expireDate) &&
                Objects.equals(cardHolder, that.cardHolder) &&
                Objects.equals(bill, that.bill);
    }
}