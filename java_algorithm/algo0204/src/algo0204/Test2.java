package algo0204;


public class Employee{
	private String name="Lee";
	public Employee (String name) { this.name=name;}
	public void setName(String name) {this.name=name;}
	public String getName() {return name;}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("kim");
		System.out.println(e.getName());
	}
}