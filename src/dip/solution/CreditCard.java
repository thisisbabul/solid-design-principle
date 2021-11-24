package dip.solution;

public class CreditCard implements BankCard {
    @Override
    public void doTransaction(Long amount) {
        System.out.println("payment using credit card");
    }
}
