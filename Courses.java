package etidubai;

public class Courses {
	public String courseName;
	public float courseFee;
	public String platform;
	public Staff trainer;

	public Courses(String c, int cf, String p, Staff n) {
		this.courseName = c;
		this.courseFee = cf;
		this.platform = p;
		this.trainer = n;
		
		
		
	}
	
	
	

	@Override
	public String toString() {
		return "Courses courseName=" + courseName + ", courseFee=" + courseFee + ", platform=" + platform
				+ ", trainer=" + trainer.staffName;
	}

	public static void main(String[] args) {
		

	}

}
