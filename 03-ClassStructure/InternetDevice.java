public class InternetDevice {
    String name;
    boolean connected = false;
    static int connectedDevices = 0; 
    InternetDevice(String name){
        this.name = name;
    }

    void connect() {
        if (!connected){
            connected = true;
            connectedDevices+=1;
        }
        
    }

    void disconnect(){
        if (connected){
            connected = false;
            connectedDevices-=1;
        }
    }

    boolean isConnected(){
        return connected ? true : false;
    }
    
    void displayStatus(){
        System.out.print(name+": ");
        if (connected) {
             System.out.println("Connected");
            }
        else {
            System.out.println("Disconnected");
        }
    }

    static void displayConnections() {
        System.out.print(connectedDevices);
    }

    public static void main(String[] args) {
        InternetDevice k1 = new InternetDevice("Mobile");
        InternetDevice k2 = new InternetDevice("TV");
        InternetDevice k3 = new InternetDevice("Fridge");
        k1.connect();
        k3.connect();
        k3.disconnect();
        k1.displayStatus();
        displayConnections();

    }
}
