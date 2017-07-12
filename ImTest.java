import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


public class ImTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Emp emp = getEmp();
	}

	private static Emp getEmp() throws CloneNotSupportedException {
		Address adr=new Address();
		adr.setI(45);
		adr.setName("Mandsaur");
		ArrayList<String> list=new ArrayList();
		list.add("kARAN");
		Emp emp=new Emp(123456,"Shivkaran Ravidas",adr,list);
		System.out.println(emp.getAdr().getName());
		System.out.println(emp.getList());
		
		emp.getAdr().setName("Pune");
		ArrayList<String> list1=emp.getList();
		list1.add("kkkkkkkkkk");
		
		System.out.println("-------------------------");
		System.out.println(emp.getAdr().getName());
		System.out.println(emp.getList());
		return emp;
	}

}


final class Emp 
{
	private final String Name;
	private final int id;
	private final Address adr;
	final ArrayList<String> list;
	
	Emp(int id,String name,Address adr,ArrayList<String> list)
	{
		this.id=id;
		this.Name=name;
		this.adr=adr;
		this.list=list;
	}
	public String getName() {
		
		return Name;
	}
	public int getId() {
		return id;
	}
	
	public Address getAdr() throws CloneNotSupportedException  {
		return (Address) adr.clone();
	}
	public ArrayList<String> getList() {
		return (ArrayList<String>) list.clone();
	}
	
}

class Address implements Cloneable
{
	private int i;
    public int getI() {
		return i;
	}
	public String getName() {
		return name;
	}
	public void setI(int i) {
		this.i = i;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
