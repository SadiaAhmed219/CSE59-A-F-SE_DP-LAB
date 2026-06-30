class Patient {

    private String name;
    private String id;

    public Patient(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public string getName() {
        return name;
    }
    public String getid() {
        return id;
    }
}
class IdValidator {
    public boolen validate(String id ){
        return id.length() == 10 || id.length() == 17;
    }
}
class SmsService {
    public void sendSms(Patient patient) {
        IdValidator validator = new Id|Validator();

        if(validator.validate)patient.getId())) {
            System.out.println("SMS  Sent to " + patient.getName));
        } else {
            System.out.println("Invalid National ID");
        }
    }
}
public class Main3 {

    public static void main(String[] args) {

        Patient patient = new Patient("Sadia", "1234567890");

        SmsService sms = new SmsService();
        sms.sendSms(patient);
    }
}
