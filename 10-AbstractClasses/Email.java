public class Email extends Message {
    private String messageSubject;
    private String recipientAddress;

    public Email(String text, String messageSubject, String recipientAddress) {
        super(text);
        this.messageSubject = messageSubject;
        this.recipientAddress = recipientAddress;
    }

    public String getMessageSubject() {
        return messageSubject;
    }

    public void setMessageSubject(String messageSubject) {
        this.messageSubject = messageSubject;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    @Override
    public void send() {
        // TODO Auto-generated method stub
        System.out.println("To: "+recipientAddress+" About: "+messageSubject);
        System.out.println("Sending: "+getText());
        System.out.println("There are:"+charNumber()+" symbols");

    }
}
