package etidubai;

public class CoursesTrainers {
	
	public String Networking;
	public String WebDev;
	public String CEH;
	

	public CoursesTrainers() {
		
	}
	
	public String Trainer1() {
		System.out.println("++++++++++++++++++++++");
		System.out.println("  Computer Networking");
		System.out.println("  Duration = 5days");
		System.out.println("  Fee = 1000AED");
		return Networking;
	}
	
	public String Trainer2() {
		System.out.println("++++++++++++++++++++++");
		System.out.println("  Fullstack Development");
		System.out.println("  Duration = 15days");
		System.out.println("  Fee = 15000AED");
		return WebDev;
	}
	
	public String Trainer3() {
		System.out.println("++++++++++++++++++++++");
		System.out.println("  Ethical Hacking");
		System.out.println("  Duration = 5days");
		System.out.println("  Fee = 1000AED");
		return CEH;
	}

	public static void main(String[] args) {
		CoursesTrainers CT = new CoursesTrainers();
		System.out.println(CT.Trainer1());
		System.out.println(CT.Trainer2());
		System.out.println(CT.Trainer3());
		
		

	}

}
