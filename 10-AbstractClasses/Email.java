public class Email extends Message {
    private String messageSubject;
    private User sendTo;

    public Email(String text, String messageSubject, User sendTo) {
        super(text);
        this.messageSubject = messageSubject;
        this.sendTo = sendTo;
    }

    public String getMessageSubject() {
        return messageSubject;
    }

    public void setMessageSubject(String messageSubject) {
        this.messageSubject = messageSubject;
    }

    public User getSendTo() {
        return sendTo;
    }

    public void setSendTo(User sendTo) {
        this.sendTo = sendTo;
    }

    @Override
    public void send() {
        // TODO Auto-generated method stub
        System.out.println("To: "+sendTo.getemailAdress()+" About: "+messageSubject);
        System.out.println("Sending: "+getText());
        System.out.println("There are:"+charNumber()+" symbols");

    }
}
