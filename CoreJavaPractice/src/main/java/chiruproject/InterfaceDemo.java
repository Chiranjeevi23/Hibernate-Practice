package chiruproject;

public class InterfaceDemo {
	public static void main(String[] args) {
		ABC obj = () -> System.out.println("In show");
		obj.show();
	}

}

/*
 * be default its a "public static" in an interface so we don't need to mention
 * it.
 */

interface ABC {
	void show();
}

interface xyz {

}

interface yyy extends xyz, ABC { // Multiple inheritence in Intrface

}