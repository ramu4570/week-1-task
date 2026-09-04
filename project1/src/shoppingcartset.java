
public class shoppingcartset {
	private String cartitems;
	private double totalamount;
	//setters
	public void setCartitems(String cartitems) {
		this.cartitems= cartitems;
	}
	
	public void setTotalamount(double totalamount) {
		this.totalamount =totalamount;
	}
	
	//methods
	public void Additem(int additem) {
		totalamount = totalamount+additem;
	}
	public void removeitem(double amount) {
		totalamount = totalamount-amount;
	}
	
	//getters
	public String getcartitems() {
		return cartitems;
	}
	public double gettotalamount() {
		return totalamount;
	}
	public double getadditem() {
		return totalamount;
	}
	
	}




