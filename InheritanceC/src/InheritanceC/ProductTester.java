package InheritanceC;

public class ProductTester {
	public static void main(String[] args) {
		Product p = new Product();
		Book b = new Book();
		Software s = new Software();
		
//		System.out.println(p.toString());
//		System.out.println(b.toString());
//		System.out.println(s.toString());
		
		System.out.println(p.whoAmI());
		System.out.println(b.whoAmI());
		System.out.println(s.whoAmI());
		
		
	}
	
	
	
}
