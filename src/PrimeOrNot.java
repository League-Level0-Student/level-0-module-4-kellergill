import static javax.swing.JOptionPane.*;
public class PrimeOrNot {
public static void main(String[] args) {
	String Javanese=showInputDialog("Tell me number man NOW!");
	int modo=Integer.parseInt(Javanese);
	boolean isprime=true;
	for (int i = 2; i < modo; i++) {
		
	}
	if(modo==0) {
		showInputDialog("You number is composite man");
	}
	else {
		showInputDialog("Your number is prime man");
	}
	}
}

