package my.labs.first;

/**
 * TODO In the end
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * <p>
 *  Использовать возможности ООП: классы, наследование, полиморфизм,
 * инкапсуляция.
 *  Определить иерархию классов соответствующую вашей предметной
 * области.
 *  Каждый класс должен иметь отражающее смысл название и информативный
 * состав.
 *  Определить конструкторы и методы setТип(), getТип(), toString(), equals().
 *  Наследование должно применяться только тогда, когда это имеет смысл.
 */

/**
 * 20. Система Платежи. Клиент имеет Счет в банке и Кредитную Карту (КК). Клиент
 * может оплатить Заказ, сделать платеж на другой Счет, заблокировать КК и
 * аннулировать Счет. (if) Администратор может заблокировать КК за превышение
 * кредита.
 *
 *
 *
 * 1. Прикруить интерфейс для перевода денег и других действий через новый класс БАНК.
 */




public class Main {



    public static void main(String[] args) {

        

        System.out.println("Нажмите 1 для перевода средств.");
        System.out.println("Нажмите 2");

//        Client client = new Seller();
//        client.payForOrder(new Order());
//        CreditCard creditCard1 = new CreditCard();
//        creditCard1.setNumber("1111-1111-1111-1111");
//        System.out.println(creditCard1);
//
//        CreditCard creditCard2 = new CreditCard();
//        creditCard2.setNumber("1111-1111-1111-1111");
//        System.out.println(creditCard2);
//
//        System.out.println(creditCard1.equals(new Object()));
//        System.out.println(creditCard1.equals(creditCard2));

        /**
         * CASE FOR TRANSFER MONEY
         */
        Client clientGM = new Customer("Косьянова Людмила");
        Bill billGM = new Bill("16161617", 10000, clientGM);
        clientGM.setBill(billGM);
        System.out.println(billGM);

        Client bananaSeller = new Seller("bananaSeller");
        Bill bananaSellerBill = new Bill("16161618", 0, bananaSeller);
        bananaSeller.setBill(bananaSellerBill);
        System.out.println(bananaSellerBill);

        boolean hasMoneyBeenTransferred = clientGM.transferToBill(bananaSellerBill, 1000);
        if (hasMoneyBeenTransferred) {
            System.out.println("YEAH!!! Money!");
        } else {
            System.out.println("Oh, no!");
        }

        System.out.println(billGM);
        System.out.println(bananaSellerBill);

        /**
         * CASE FOR CREATING AN ORDER
         */
//        Client clientGM = new Customer("Косьянова Людмила");
//        Bill billGM = new Bill("16161617", 10000, clientGM);
//        clientGM.setBill(billGM);
//        System.out.println(billGM);
//
//        Client bananaSeller = new Seller("bananaSeller");
//        Bill bananaSellerBill = new Bill("16161618", 0, bananaSeller);
//        bananaSeller.setBill(bananaSellerBill);
//        System.out.println(bananaSellerBill);
//
//        Order bananaOrder = new Order(billGM, bananaSellerBill, 1000);
//
//        boolean hasOrderBeenPayed = clientGM.payForOrder(bananaOrder);
//        if (hasOrderBeenPayed) {
//            System.out.println("YEAH!!! Bananos!");
//        } else {
//            System.out.println("Oh, no!");
//        }
//
//        System.out.println(billGM);
//        System.out.println(bananaSellerBill);

        /**
         * CASE FOR BLOCKING CREDIT CARD
         */
//        Client clientGM = new Customer("Косьянова Людмила");
//        Bill billGM = new Bill("16161617", 10000, clientGM);
//        clientGM.setBill(billGM);
//        System.out.println(billGM);
//
//        Client bananaSeller = new Seller("bananaSeller");
//        Bill bananaSellerBill = new Bill("16161618", 2000, bananaSeller);
//        bananaSeller.setBill(bananaSellerBill);
//        System.out.println(bananaSellerBill);
//
//        CreditCard creditCardGM = new CreditCard("1111-1111-1111-1113", "04/23", "Косьянова Людмила", 222, billGM);
//        CreditCard creditCardSeller = new CreditCard("2222-1111-1111-1122", "04/23", "BANANA LTD", 333, bananaSellerBill);
//
//        clientGM.setCreditCard(creditCardGM);
//        bananaSeller.setCreditCard(creditCardSeller);
//
//        System.out.println(creditCardGM);
//        System.out.println(creditCardSeller);
//
//        clientGM.transferToCard(creditCardSeller, 1000);
//
//        System.out.println(billGM);
//        System.out.println(bananaSellerBill);
//
//
//        clientGM.transferToCard(creditCardSeller, 1000);
//        clientGM.transferToCard(creditCardSeller, 1000);
//        clientGM.transferToCard(creditCardSeller, 1000);
//        clientGM.transferToCard(creditCardSeller, 1000);
//        clientGM.transferToCard(creditCardSeller, 1000);
//        clientGM.transferToCard(creditCardSeller, 1000);
//        clientGM.transferToCard(creditCardSeller, 1000);
//        clientGM.transferToCard(creditCardSeller, 500);
//        clientGM.transferToCard(creditCardSeller, 500);
//        clientGM.transferToCard(creditCardSeller, 500);
//        clientGM.transferToCard(creditCardSeller, 500);
//        clientGM.transferToCard(creditCardSeller, 500);
//        clientGM.transferToCard(creditCardSeller, 500);
//        clientGM.transferToCard(creditCardSeller, 500);
//        clientGM.transferToCard(creditCardSeller, 500);
//        clientGM.transferToCard(creditCardSeller, 500);
//        clientGM.transferToCard(creditCardSeller, 500);
//        clientGM.transferToCard(creditCardSeller, 500);
//        clientGM.transferToCard(creditCardSeller, 500);
//        clientGM.transferToCard(creditCardSeller, 500);
//        clientGM.transferToCard(creditCardSeller, 500);
//        clientGM.transferToCard(creditCardSeller, 500);
//
//        System.out.println(billGM);
//        System.out.println(bananaSellerBill);

        /**
         * CASE FOR EMPTY BILL
         */
//        Client clientGM = new Customer("Косьянова Людмила");
//        Bill billGM = new Bill("16161617", 10000, clientGM);
//        clientGM.setBill(billGM);
//
//        System.out.println(billGM);
//
//        clientGM.emptyBill();
//
//        System.out.println(billGM);
    }

}
