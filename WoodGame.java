//Robert Payne
//L02
//05/31/2012
//Task 1
import javax.swing.JOptionPane;

public class WoodGame{

	public static void main(String[] args)
	{
		//variable declarations
		String name;
		String age;
		String city;
		String college;
		String profession;
		String animal;
		String petName;
		
		//dialog boxes prompting user for their information
		name = JOptionPane.showInputDialog("Enter your name: ");
		age = JOptionPane.showInputDialog("Enter your age: ");
		city = JOptionPane.showInputDialog("Enter your city: ");
		college = JOptionPane.showInputDialog("Enter your college: ");
		profession = JOptionPane.showInputDialog("Enter your profession: ");
		animal = JOptionPane.showInputDialog("What kind of pet do you have: ");
		petName = JOptionPane.showInputDialog("What is your pet's name: ");
		
		//message box displaying their information embedded into a short story
		JOptionPane.showMessageDialog(null, "There once was a person named " + name + " who lived \nin " + city
		+ ". At the age of " + age + ", " + name + " went to college at " + college + ". \n" + name + 
		" graduated and went to work as a " + profession + ". \nThen " + name + " adopted a(n) " + animal
		+ " named " + petName + ". \nThey both lived happily ever after.");
		
		}//method prompts user for their information then outputs that information in the 
		//form of a story.
	}//end of class 		