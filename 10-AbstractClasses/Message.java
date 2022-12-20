abstract class Message {
    private String text;

    public Message(String text) {
        this.text = text;
    }

    public Message() {
        this.text=""; 
    }

    public int charNumber(){
        return text.length();
    }

    public abstract void send();

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    
}
