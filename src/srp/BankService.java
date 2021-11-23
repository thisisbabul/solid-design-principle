package srp;

public class BankService {

    public void deposit(Long amount, String accountNo) {
        //deposit amount
    }

    public Long withdraw(Long amount, String accountNo) {
        //withdraw amount
        return 0L;
    }

    public void printPassbook() {
        //update transaction info in passbook
    }

    public void setLoadInterestInfo(String loadType) {
        if (loadType.equals("home")) {
            //do some job
        }
        else if (loadType.equals("personal")) {
            //do some job
        }
        else if (loadType.equals("car")) {
            //do some job
        }
    }

    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //use JavaMailServerAPI
        }
        else if (medium.equals("mobile")) {
            //use Twillio API
        }
    }
}
