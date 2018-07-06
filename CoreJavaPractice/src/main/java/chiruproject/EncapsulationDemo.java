package chiruproject;

public class EncapsulationDemo {
	public static void main(String[] args) {
		Emp e = new Emp();
		e.setEid(1001);
		e.setEname("Baldur");
		
		System.out.println(e.getEid() +"\t"+ e.getEname());
		System.out.println();
		
	}

}

/*variables should be private in real time, so we need to encapsulate it for security purposes,
 *otherwise the instance variable can be changed using an object of the class, we dont want that
 * */
class Emp{
	private int eid; 
	private String ename; //instance variables
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
}