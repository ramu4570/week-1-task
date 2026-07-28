//using constructor chaining

public class bankaccount {
	String accountholder;
	long accountnumber;
	double balance;
	bankaccount(){
		this("unknown");
	}
	bankaccount(String accountholder){
		this(accountholder,0);
	}
	bankaccount(String accountholder,long accountnumber){
		this(accountholder,accountnumber,0);
	}
    bankaccount(String accountholder,long accountnumber	,double balance){
		this.accountholder = accountholder;
        this.accountnumber = accountnumber;		
    	this.balance = balance;
	}
    void dispaly() {
    	System.out.println("account holder name:"+accountholder);
    	System.out.println("account number:"+accountnumber);
    	System.out.println("balance:"+balance);
    }

	 void main(String[] args) {
		bankaccount b1 = new bankaccount();
		b1.dispaly();
		System.out.println("*********");
		
		bankaccount b2 = new bankaccount("kong"); 
		b2.dispaly();
		System.out.println("*********");
		
		bankaccount b3 = new bankaccount("kong",897666789); 
		b3.dispaly();
		System.out.println("*********");
		
		bankaccount b4 = new bankaccount("kong",897666789,50000); 
		b4.dispaly();
	}

}
