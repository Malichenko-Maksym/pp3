
public class CinemaTicket
{
    static String cinemaName = "Morning Star Cinema";
    String filmTitle; 
    int row;
    int seat;
    double price;

    public CinemaTicket(String name, int row, int seat)
    {
        filmTitle = name;
        this.row = row;
        this.seat =  seat;
        price = row<=2 ? 10 : 25;
    }

    
    public void displayTicketData ()
    {
        System.out.println(cinemaName+": "+filmTitle);
        System.out.println("row: "+row+"; seat: "+seat);
        System.out.println("Price: "+price);
    }
    
    public static void main(String args[]) {
        CinemaTicket t1= new CinemaTicket("Gladiator",2,21);
        CinemaTicket t2= new CinemaTicket("Gladiator",7,2); 
        t1.displayTicketData ();
        t2.displayTicketData ();
    }
}
