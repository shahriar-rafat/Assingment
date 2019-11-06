package Assignment;

public class BA extends Department{

	private String Sname;
	private String id;
	
	public void setSname(String Sname) {
		this.Sname=Sname;
	}
	
	public String getSname() {
		return Sname;
	}
	
	public void setID(String id) {
		this.id=id;
	}
	
	public String getID() {
		return id;
	}
	
	public void show() {
		System.out.println("Faculty of "+getDept());
	}
	
	public void printInfo() {
		System.out.println("Department: "+getDept());
		System.out.println("Student Name: "+Sname);
		System.out.println("Student ID: "+id);
	}
}