import javax.swing.JOptionPane;

public class MagicDay{

   public static void main(String[] args){

	int days, months, years;
	String input;

	input = JOptionPane.showInputDialog("Enter a day: ");
	days = Integer.parseInt(input);

	input = JOptionPane.showInputDialog("Enter a month: ");
	months = Integer.parseInt(input);

	input = JOptionPane.showInputDialog("Enter a two digit year: ");
	years = Integer.parseInt(input);

	int magicd;
	magicd = days * months;

	if( magicd == years){
	   JOptionPane.showMessageDialog(null, "This is magic day!!");
	} else {
	   JOptionPane.showMessageDialog(null, "Sorry, This is not magic day.");
	}

	System.exit(0);

   }
}