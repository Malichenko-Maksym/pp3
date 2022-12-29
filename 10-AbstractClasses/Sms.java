public class Sms extends Message {
    private User sendTo;

    public User getSendTo() {
        return sendTo;
    }

    public void setSendTo(User sendTo) {
        this.sendTo = sendTo;
    }

    public Sms(String text, User sendTo) {
        super(text);
        this.sendTo = sendTo;
    }

    public Sms(User sendTo) {
        this.sendTo = sendTo;
    }

    
    @Override
    public void send() {
        // TODO Auto-generated method stub
        System.out.println("Sending: "+getText());
        System.out.println("To : "+sendTo.getPhoneNubmer());
        System.out.println("There are:"+charNumber()+" symbols");
    }
     
}
