public class TV implements CanOnOff, CanChangeChannel,CanChangeVolume  {
    private boolean turnedOn;
    private int chanNum;
    private int volume;
    private String[] channels;
    
    public TV() {
        turnedOn = false;
        chanNum = 1;
        volume =1;
        channels = new String[100];
        for(int i=0; i<10; i+=1){
            channels[i]=(char)(65+i)+" Channel";
        }
    }

    

    public int getChanNum() {
        return chanNum;
    }

    public void showTvStatus(){
        if(turnedOn){
            System.out.println("Current chanel: #"+chanNum);
            if(channels[chanNum-1] != null){
                System.out.println("Current chanel name: "+channels[chanNum-1]);
            }
            System.out.println("Current volume: "+volume);
        } else {
            System.out.println("TV turned off");
        }
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    @Override
    public void on() {
        turnedOn = true;
        
    }

    @Override
    public void off() {
        turnedOn = false;
        
    }

    @Override
    public void channelUp() {
        // TODO Auto-generated method stub
        if((chanNum<99)&&(turnedOn)){
            chanNum+=1;
        }
    }

    @Override
    public void channelDown() {
        // TODO Auto-generated method stub
        if(chanNum>1 && turnedOn){
            chanNum-=1;
        }
    }

    @Override
    public void setChannel(int channelNo) {
        // TODO Auto-generated method stub
        if(channelNo<=99 && channelNo>=1 && turnedOn){
            chanNum=channelNo;
        }
    }

    @Override
    public void volumeUp() {
        // TODO Auto-generated method stub
        if(volume<10 && turnedOn){
            volume+=1;
        }
        
    }

    @Override
    public void volumeDown() {
        // TODO Auto-generated method stub
        if(volume>1 && turnedOn){
            volume-=1;
        }
    }

    public void displayChannels(){
        for(int i=0; i<100; i+=1){
            if(channels[i] != null){
                System.out.println(channels[i]+" | #:"+(i+1));
            } else {
                System.out.println("#:"+(i+1));
            }
        }
    }
}
