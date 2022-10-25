
public class CinemaTicket
{
    static String cinemaName = "CinemaHall";
    String filmTitle; 
    int row;
    int seat;
    double price;

    public CinemaTicket(String name, int roww, int seatt, double pricee)
    {
        filmTitle = name;
        row = roww;
        seat =  seatt;
        price  = pricee;
    }

    
    public void displayTicketData ()
    {
        System.out.println(cinemaName+": "+filmTitle);
        System.out.println("row: "+row+"; seat: "+seat);
        System.out.println("Price: "+price);
    }
    
    public static void main(String args[]) {
        CinemaTicket t1= new CinemaTicket("Potter",3,21,41.4);
        CinemaTicket t2= new CinemaTicket("Cars",5,2,20.5); 
        t1.displayTicketData ();
        t2.displayTicketData ();
    }
}
