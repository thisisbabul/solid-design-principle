package dip.solution;

public class DebitCard implements BankCard {
    @Override
    public void doTransaction(Long amount) {
        System.out.println("payment using debit card");
    }
}
