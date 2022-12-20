public class Sms extends Message {
    private String phoneNubmer;

    public Sms(String text, String phoneNubmer) {
        super(text);
        this.phoneNubmer = phoneNubmer;
    }

    public Sms(String phoneNubmer) {
        this.phoneNubmer = phoneNubmer;
    }

    public String getPhoneNubmer() {
        return phoneNubmer;
    }

    public void setPhoneNubmer(String phoneNubmer) {
        this.phoneNubmer = phoneNubmer;
    }

    @Override
    public void send() {
        // TODO Auto-generated method stub
        System.out.println("Sending: "+getText());
        System.out.println("To : "+phoneNubmer);
        System.out.println("There are:"+charNumber()+" symbols");
    }
     
}
