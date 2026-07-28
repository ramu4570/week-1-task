package project1;

public class movietickets {
	double seats= 200;

   void main(String[] args) {
	   availableseats();
	   bookticket(5);
	   cancelticket(2);
	}
   void availableseats() {
	   System.out.println("availableseats:"+seats);
   }
   void bookticket(double ticket) {
	   seats = seats-ticket;
	   availableseats();
   }
   void cancelticket(double ticket) {
	   seats = seats +ticket;
	   availableseats();
   }
}
