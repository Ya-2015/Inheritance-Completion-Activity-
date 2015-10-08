package InheritanceC;

public class Book extends Product{
	private String author;
    private int pages;
    
    public Book(){
    	author = "001";
    	pages = 0;
    	count++;
    }

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public String toString()
    {
        return super.toString() + "Author:        " + author + "\n" + "Pages:        " + pages + "\n";
    }
	
	public String whoAmI(){
    	return "This is a book";
    }
	
	public boolean equals(Object obj){
    	boolean equal = true;
    	if (obj instanceof Book){
    		if(obj.getClass() == this.getClass()){
    			equal = true;
    		}else{
    			equal = false;
    		}
    		
    	}
    	
    	return equal;
    }
}
