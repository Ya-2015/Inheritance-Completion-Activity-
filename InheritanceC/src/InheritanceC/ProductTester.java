package InheritanceC;

public class ProductTester {
	public static void main(String[] args) {
//		Product p = new Product();
		Book b = new Book();
		Software s = new Software();
		
//		System.out.println(p.toString());
//		System.out.println(b.toString());
//		System.out.println(s.toString());
		
//		System.out.println(p.whoAmI());
		System.out.println(b.whoAmI());
		System.out.println(s.whoAmI());
		
		Book b1 = new Book();
		Book b2 = new Book();
		b2.setAuthor("Liu");
		Software s1 = new Software();
		Software s2 = new Software();
		System.out.println(b1.equals(b2));
		System.out.println(s1.equals(s2));
		
	}
	
	
	
}
