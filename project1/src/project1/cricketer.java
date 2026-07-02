package project1;

public class cricketer {

		static String teamname = "indian team"; 
			String playername;
			int runs;
			public static void main(String[] args) {
				
				cricketer p1 = new cricketer();
				p1.playername="ramu";
				p1.runs=4200;
				
				cricketer p2 = new cricketer();
				p2.playername="singh";
				p2.runs=200;
				
				System.out.println("player1 info");
				System.out.println("teamname:"+teamname);
				System.out.println("playername:"+p1.playername);
				System.out.println("runs:"+p1.runs);
				
				System.out.println("player2 info");
				System.out.println("teamname:"+teamname);
				System.out.println("playername:"+p2.playername);
				System.out.println("runs:"+p2.runs);
				
			    cricketer.teamname ="bharath team";
				System.out.println("player1 teamname:"+teamname);
				System.out.println("player2 teamname:"+teamname);
				
				System.out.println("player1 info");
				System.out.println("teamname:"+teamname);
				System.out.println("playername:"+p1.playername);
				System.out.println("runs:"+p1.runs);
				
				System.out.println("player2 info");
				System.out.println("teamname:"+teamname);
				System.out.println("playername:"+p2.playername);
				System.out.println("runs:"+p2.runs);
			}
		}

	

