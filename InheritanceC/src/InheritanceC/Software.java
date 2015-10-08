package InheritanceC;

public class Software extends Product{
	private String programmer;
    private String platform; //linux, mac, or pc
    private String os; 
    
    public Software(){
    	programmer = "xxx";
    	platform = "xxx";
    	os = "Windows";
    }

	public String getProgrammer() {
		return programmer;
	}

	public void setProgrammer(String programmer) {
		this.programmer = programmer;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}
	
	public String toString()
    {
        return super.toString() + "Programmer:        " + programmer + "\n" + "Platform:        " + platform + "\n" + "os:        " + os + "\n";
    }
	
	public String whoAmI(){
    	return "This is a software";
    }
	
	public boolean equals(Object obj){
    	boolean equal = true;
    	if (obj instanceof Software){
    		if(obj.getClass() == this.getClass()){
    			equal = true;
    		}else{
    			equal = false;
    		}
    		
    	}
    	
    	return equal;
    }
}
