
public class Employee {
	private String name;
	private int year;
	private int salary;
	
	Employee(String name, int year, int salary){	
		this.name = name;
		this.year = year;
		this.salary = salary;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	public int getYear(){
		return this.year;
	}


	public void setSalary(int salary){
	this.salary = salary;
	}
	public int getSalary(){
	return this.salary;
	}

}// end class