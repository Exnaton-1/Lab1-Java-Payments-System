package my.labs.first;

import java.util.Objects;

public class Order {

    private Bill sourceBill;
    private Bill destinationBill;
    private int price;

    public Order(Bill sourceBill, Bill destinationBill, int price) {
        this.sourceBill = sourceBill;
        this.destinationBill = destinationBill;
        this.price = price;
    }

    public Bill getSourceBill() {
        return sourceBill;
    }

    public void setSourceBill(Bill sourceBill) {
        this.sourceBill = sourceBill;
    }

    public Bill getDestinationBill() {
        return destinationBill;
    }

    public void setDestinationBill(Bill destinationBill) {
        this.destinationBill = destinationBill;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "sourceBill=" + sourceBill +
                ", destinationBill=" + destinationBill +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return price == order.price &&
                Objects.equals(sourceBill, order.sourceBill) &&
                Objects.equals(destinationBill, order.destinationBill);
    }

}
