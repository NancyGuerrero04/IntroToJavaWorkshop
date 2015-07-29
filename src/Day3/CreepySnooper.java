package Day3;

import javax.swing.JOptionPane;

public class CreepySnooper {
public static void main(String[] args) {
	String hobby=JOptionPane.showInputDialog("Hello, what is your favorite hobby?");
	JOptionPane.showMessageDialog(null, "Me too! I love "+hobby);
	String city=JOptionPane.showInputDialog("What city do you live in?");
	JOptionPane.showMessageDialog(null, "I live very near there........... (; (; (;");
	String number=JOptionPane.showInputDialog("Hey, give me your digits!");
	JOptionPane.showMessageDialog(null, number + "? Cool, you're down in my contacts now!");
	String invite=JOptionPane.showInputDialog("Should we meet up?");
	JOptionPane.showMessageDialog(null, "Did I hear a yes???? See you in 20!");
}
}
