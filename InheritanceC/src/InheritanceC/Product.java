package InheritanceC;
import java.text.NumberFormat;

public abstract class Product {
	private String code;
    private String description;
    private double price;
    protected static int count = 0;   // a protected 
                                      // static variable

    public Product()
    {
        code = "";
        description = "";
        price = 0;
    }
    // get and set accessors for the code, description, 
    // and price instance variables
    @Override
    public String toString()
    {
        return "Code:        " + code + "\n" +
               "Description: " + description + "\n" +
               "Price:       " +
               this.getFormattedPrice() + "\n";
    }

    private String getFormattedPrice() {
    	NumberFormat formatter = NumberFormat.getCurrencyInstance();
    	return formatter.format(price);
		
	}
	// create public access for the count variable
    public static int getCount()   
    {                              
        return count;
    }
    
    public String whoAmI(){
    	return "This is a product";
    }
    
    public boolean equals(Object obj){
    	Product p = (Product)obj;
    	if(p.code.equals(code) && p.description.equals(description) && p.price == price ){
    		return true;
    	}
    	else{
    		return false;
    	}
    }
    
}
