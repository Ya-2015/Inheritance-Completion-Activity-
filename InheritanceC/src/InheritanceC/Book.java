package InheritanceC;

public final class Book extends Product{
	private String author;
    private int pages;
    private static final String DETAIL = "detail";
    
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
	
	public String toString(String flag)
    {
        if (flag.equalsIgnoreCase(DETAIL)){
        	return super.toString() + "Author:        " + author + "\n" + "Pages:        " + pages + "\n";
		}else{
			return super.toString();
		}
        
    }
	
	public String whoAmI(){
    	return "This is a book";
    }
	
	public boolean equals(Object obj){
		Book b = (Book)obj;
		
		if(super.equals(obj) && b.author.equals(author) && b.pages == pages){
			return true;
		}else{
			return false;
		}
		
	}
}
