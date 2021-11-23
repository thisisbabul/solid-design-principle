package srp.solution;

public class NotificationService {
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //use JavaMailServerAPI
        }
        else if (medium.equals("mobile")) {
            //use Twillio API
        }
    }
}
