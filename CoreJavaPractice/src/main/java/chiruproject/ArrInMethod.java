package chiruproject;

public class ArrInMethod {
	public static void main(String[] args) { 
	int chiru[] = {5,6,4,8,9,7};
	change(chiru);
	for(int y:chiru)
		System.out.println(y);
	}
	public static void change(int x[]) {
		for (int count=0; count<x.length; count++) {
			x[count]+=5;
		}
	}
}

	
	
	
	