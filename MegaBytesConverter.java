package challanges;

public class MegaBytesConverter {

	public static void main(String[] args) {
		
		printMegaBytesAndKiloBytes(2500);
		printMegaBytesAndKiloBytes(-1024);
		printMegaBytesAndKiloBytes(5000);

	}
	
	public static void printMegaBytesAndKiloBytes (int kiloByte) {
		if (kiloByte < 0) {
			System.out.println("Invalid Value");
		} 
		else {
			int megaByte = kiloByte / 1024;
			int remainder = kiloByte % 1024;
			System.out.println(kiloByte+" KB = "+megaByte+" MB and "+remainder+" KB");
		}
	}

}
