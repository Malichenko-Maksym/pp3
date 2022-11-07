import java.util.Scanner;
public class Room {
    int number;
    int beds;
    boolean  occupied;
    String guestName;
    

    Room(int number) {
        this.number = number;
        occupied = false;
        this.beds = 2;
    }

    Room(int number, int beds){
        this.number = number;
        this.beds = beds;
        occupied = false;
    }

    void checkin(String guestName){
        this.guestName = guestName;
        occupied = true;
    }

    void checkout(){
        occupied = false;
        guestName = "Nobody here";
    }

    boolean isOccupied(){
        return occupied;
    }

    public String toString(){ 
        return "Number: "+number+"; Beds: "+beds+"; Is occupied: "+occupied+"; Guest name: "+guestName;  
    }  

    static void showListOfRooms (Room[] rooms){
        for ( int room=0; room<rooms.length; room++){
            System.out.println(rooms[room]);
        }
    }

    static void showListOfRoomsBeds (Room[] rooms, int numberBeds){
        for ( int room=0; room<rooms.length; room++){
            if (rooms[room].beds == numberBeds) { 
                System.out.println(rooms[room]); 
            }
            
        }
    }

    static void showVacantOccupied (Room[] rooms){
        int vacant = 0; 
        for ( int room=0; room<rooms.length; room++){
            if (rooms[room].occupied == false) { 
                vacant=vacant+1; 
            }
        }
        System.out.println("vacant: "+vacant+" occupied: "+(rooms.length-vacant));
    }

    static void showVacantBeds (Room[] rooms){
        int vacantBeds = 0; 
        for ( int room=0; room<rooms.length; room++){
            if (rooms[room].occupied == false) { 
                vacantBeds=vacantBeds+rooms[room].beds; 
            }
        }
        System.out.println("vacant beds: "+vacantBeds);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        Room r1= new Room(1);
        Room r2= new Room(2);
        Room r3= new Room(3,1);
        Room r4= new Room(4);
        r4.checkin("Max Mal");
        Room r5= new Room(5,1);
        Room r6= new Room(6,3);
        r6.checkin("Katia F");
        Room[] rooms = {r1,r2,r3,r4,r5,r6};
        Room.showVacantOccupied(rooms);
        Room.showVacantBeds(rooms);
        Room.showListOfRoomsBeds(rooms,2);
        
    }

}
