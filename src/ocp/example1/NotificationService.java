package ocp.example1;

public class NotificationService {

    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //use JavaMailServer API
        }
        else if (medium.equals("mobile")) {
            //use twillio API
        }
    }
}
