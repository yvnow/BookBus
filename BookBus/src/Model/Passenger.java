package Model;

public class Passenger 
{
	private String pname;
	private int pno;
	public Passenger(String pname, int pno) {
		super();
		this.pname = pname;
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	
}
