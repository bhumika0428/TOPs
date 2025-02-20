package BeanScopes;

public class department {

	private String dname;

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "department [dname=" + dname + "]";
	}
	
}
