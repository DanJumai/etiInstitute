package etidubai;

public class Organogram {

	
	
	public Organogram() {
		
	}
	
	String adminstaff() {
		System.out.println("Database of Admin staff");
		System.out.println("[+]Abilash Sharma");
		System.out.println("[+]Anisha harma");
		System.out.println("[+]Fawaz Abdul");
		return null;
	}
	
	private String Techstaff() {
		System.out.println("Database of TechStaff");
		System.out.println("[+]Guarav Sharma");
		System.out.println("[+]Aisha harmanth");
		System.out.println("[+]Fawaz Abdulkarim");
		return null;
		
	}
	
	

	public static void main(String[] args) {
		Organogram ceo = new Organogram();
		System.out.println(ceo.adminstaff());
		System.out.println(ceo.Techstaff());

	}

}
