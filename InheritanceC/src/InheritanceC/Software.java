package InheritanceC;

public final class Software extends Product{
	private String programmer;
    private String platform; //linux, mac, or pc
    private String os; 
    private static final String DETAIL = "detail";
    
    public Software(){
    	programmer = "xxx";
    	platform = "xxx";
    	os = "Windows";
    	count++;
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
	
	public String toString(String flag)
    {
		if (flag.equalsIgnoreCase(DETAIL)){
        
			return super.toString() + "Programmer:        " + programmer + "\n" + "Platform:        " + platform + "\n" + "os:        " + os + "\n";
		}else{
			return super.toString();
		}
    }
	
	public String whoAmI(){
    	return "This is a software";
    }
	
	public boolean equals(Object obj){
		Software s = (Software)obj;
		
		if(super.equals(obj) && s.programmer.equals(programmer) && s.platform.equals(platform) && s.os.equals(os)){
			return true;
		}else{
			return false;
		}
		
	}
}
