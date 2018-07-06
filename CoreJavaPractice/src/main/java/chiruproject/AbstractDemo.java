package chiruproject;
//Abstract Class and Abstract Method
public class AbstractDemo {
	public static void main(String[] args) {
		MaheshPhone obj = new SureshPhone();  // cannot instantiate the abstract class
		obj.call();
		obj.cook();
		obj.dance();
		obj.move();
	}
}

abstract class MaheshPhone { //abstract class
	
	public void call() {
		System.out.println("Calling...");
	}
	public abstract void move(); // Abstract Methods
	public abstract void dance(); 
	public abstract void cook();
}

abstract class RameshPhone extends MaheshPhone {  //Abstract Class
	public void move() {
		System.out.println("Moving...");
	}
}

class SureshPhone extends RameshPhone {   //concrete class
	
	public void dance() {
		System.out.println("Dancing...");
	}
	
	public void cook() {
		System.out.println("Cooking...");
	}
}





