public class Amenities{
	private Boolean isTv;
	private Boolean isWiFi;
	private Boolean isAC;
	private Boolean isBreakfast;
	
	public Amenities(){}

	public Amenities(Boolean isTv,	Boolean isWiFi,	Boolean isAC,Boolean isBreakfast){
		this.isTv = isTv;
		this.isWiFi=isWiFi;
		this.isAC=isAC;
		this.isBreakfast=isBreakfast;
		return ;
	}

	public Boolean getTV(){
		return this.isTv;
	}

	public void setTV(Boolean isTv){
		this.isTv = isTv;
		return;
	}
	public Boolean getWiFi(){
		return this.isWiFi;
	}

	public void setWiFi(Boolean isWiFi){
		this.isWiFi = isWiFi;
		return;
	}
	public Boolean getAC(){
		return this.isAC;
	}

	public void setAC(Boolean isAC){
		this.isAC = isAC;
		return;
	}
	public Boolean getBreakfast(){
		return this.isBreakfast;
	}

	public void setBreakfast(Boolean isBreakfast){
		this.isBreakfast = isBreakfast;
		return;
	}

}