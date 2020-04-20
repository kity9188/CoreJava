package lectures;

public class StatementWhiteSpacesAndIndentation {

	public static void main(String[] args) {
		
		int myVariable = 50;
		//myVariable = 50 is an expression
		//int myVariable = 50; is a statement
		myVariable++;
		myVariable--;
		System.out.println(myVariable);
		System.out.println("This is a test");
		System.out.println("This is" + //Whitespaces
		" another " +
				"still more");
		
		int anotherVariable = 50;myVariable--;System.out.println("This is another one");
		//Now no whitespace

	}

}
