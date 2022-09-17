package etidubai;

public class Staff {
	public String staffName;
	public String role;
	

	public Staff(String s, String r) {
		this.staffName = s;
		this.role = r;
	}
	
	

	@Override
	public String toString() {
		return "Staff Name= " + staffName + ", role= " + role ;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
