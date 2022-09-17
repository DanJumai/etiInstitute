package etidubai;

public class ETInstitute {
	public String name;
	public String addr;
	public Staff ceo = new Staff("USMAN","CEO");
	public Staff cto = new Staff("Dalori","CTO");
	public Staff man = new Staff("Mudi","MANAGER");
	public Staff train = new Staff("Idris","Infosec");
	public Staff train1 = new Staff("Jon","Software DEV");
	public Courses expertise = new Courses("CEH",1200,"online",train);
	public Courses expertise1 = new Courses("JAVA",1200,"online",train1);
	public Scholarship type = new Scholarship("We offer SCHOLARSHIP to indigent students"); 


	public ETInstitute(String a,String b) {
		this.name = a;
		this.addr = b;
	}

	public static void main(String[] args) {
		ETInstitute eti = new ETInstitute("EduTraining Institute","Lokogoma");
		System.out.println(eti.ceo);
		System.out.println(eti.cto);
		System.out.println(eti.man);
		System.out.println(eti.train);
		System.out.println(eti.train1);
		System.out.println(eti.expertise);
		System.out.println(eti.expertise1);
		System.out.println(eti.type);

	}

}
