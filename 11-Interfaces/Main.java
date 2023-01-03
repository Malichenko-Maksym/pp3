public class Main {
    public static void main(String[] args) {
        TV tv1 = new TV();
        System.out.println(tv1.isTurnedOn());
        tv1.on();
        System.out.println(tv1.isTurnedOn());
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.setChannel(50);
                tv1.showTvStatus();
        
    }
}
