public class Associate{
    public Associate() {
		super();
		
	}
	public int getAssociateId() {
		return associateId;
	}
	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}
	public String getAssociateName() {
		return associateName;
	}
	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}
	public int getWorkStatus() {
		return workStatus;
	}
	public void setWorkStatus(int workStatus) {
		this.workStatus = workStatus;
	}
	private int associateId;
    private String associateName;
    private int workStatus;
    
    public static void trackAssociateStatus(int n,String s) {
    	if(n>=0 && n<=20) {
    		System.out.println("The associate "+s+" work status:Core skills");}
    	else if(n>20 && n<=40) {
    			System.out.println("The associate "+s+" work status:Advanced modules");
    		}
    	else if(n>40 && n<=60){
    		System.out.println("The associate "+s+" work status:Project phase");
    	}
    	else{
    	    System.out.println("The associate "+s+" work status:Deployed in project");
    	}
    	
    }
}