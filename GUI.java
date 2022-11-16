import javax.swing.JOptionPane;
public class GUI {

	public static void main(String[] args) {
		// Create UFC Fighter
		
		String name = JOptionPane.showInputDialog("Whats the name of your fighter? ");
		int age = Integer.parseInt(JOptionPane.showInputDialog("How old is your fighter? "));
		double weight = Double.parseDouble(JOptionPane.showInputDialog("How much does "+name+" weigh?(in lbs)"));
		String fightstyle = JOptionPane.showInputDialog("What is "+name+"'s fight style?");
		
		JOptionPane.showMessageDialog(null, "Fighter name: "+name+"\n"+"Fighter age: "+age+"\n"+"Weight Class: "+weight+"\n"+"Fight style: "+fightstyle);
	}

}
