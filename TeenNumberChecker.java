package challanges;

public class TeenNumberChecker {

	public static void main(String[] args) {
		
		hasTeen(9, 99, 19);
		hasTeen(23, 15, 42);
		hasTeen(22, 23, 34);

	}
	
	public static boolean hasTeen(int a, int b, int c) {
		
		if((a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19)) {
			System.out.println("True");
			return true;
		}
		System.out.println("False");
		return false;
		
	}

}
