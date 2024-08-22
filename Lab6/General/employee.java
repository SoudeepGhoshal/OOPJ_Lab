package Lab6.General;

public class employee {
	protected int empid;
	@SuppressWarnings("unused")
	private String ename;
	
	public void setName(String ename) {
		this.ename = ename;
	}
	
	public double earning(double basic) {
		double earning = basic + 0.8*basic + 0.15*basic;
		return(earning);
	}

}