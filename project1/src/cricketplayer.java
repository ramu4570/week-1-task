import java.util.Scanner;

public class cricketplayer {
	String playername;
	int matchesplayed;
	float totalruns;
	double averageruns;
	//paramerized constructor
    cricketplayer(String playername,int matchesplayed,float totalruns){
		this.playername= playername;
		this.matchesplayed =  matchesplayed;
		this.totalruns = totalruns;
	}
	
    void player(){
    	System.out.println("playername:"+playername);
    	System.out.println("matchesplayed:"+matchesplayed);
    	System.out.println("totalruns:"+totalruns);
    	averageruns = totalruns/matchesplayed;
    	System.out.println("averageruns:"+averageruns);
    }
    public static  void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 
    	 System.out.println("enter player name:");
    	 String name = sc.nextLine();
    	 
    	 System.out.println("enter matches played:");
    	 int played = sc.nextInt();
    	 
    	 System.out.println("total runs:");
    	 float runs = sc.nextFloat();
    	 
    	 cricketplayer p1 = new cricketplayer(name,played,runs); 
    	 p1.player();
	}

}
