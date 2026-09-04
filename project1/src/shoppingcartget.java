
public class shoppingcartget {

	public static void main(String[] args) {
		shoppingcartset sc= new shoppingcartset();
		sc.setCartitems("laptop");
		sc.setTotalamount(3000);
		sc.Additem(23);
		sc.removeitem(500);
		
		System.out.println(sc.getcartitems());
		System.out.println(sc.gettotalamount());
	}

}
