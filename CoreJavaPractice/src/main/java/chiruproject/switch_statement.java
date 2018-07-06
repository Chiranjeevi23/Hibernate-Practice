package chiruproject;

public class switch_statement {
	public static void main(String args[]) {
		int age;
		age = 2;

		switch (age) {
		case 1:
			System.out.println("You can crawl");
			break;
		case 2:
			System.out.println("You can talk");
			break;
		case 3:
			System.out.println("You can get into trouble");
			break;
		default:
			System.out.println("I dont know how old you are.");
			break;
		}
	}

}
