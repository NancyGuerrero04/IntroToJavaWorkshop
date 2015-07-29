package Day3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args){
String name=JOptionPane.showInputDialog("Hello! What is your name?");
JOptionPane.showMessageDialog(null,"Hi "+name);
String color=JOptionPane.showInputDialog("What's your favorite color?");
JOptionPane.showMessageDialog(null, "Nice!");
}
}
