//Robert Payne
//L02
//05/31/2012
//Task 2
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Sphere{

	public static void main(String[] args)
	{
		//variable declarations
		String strDiameter;
		double numDiameter;
		double radius;
		double volume;
		
		//Decimal Format object for output to 5 decimal places
		DecimalFormat sphereOutput = new DecimalFormat("#################0.00000");
		
		//Prompt user for the diameter of the sphere
		strDiameter = JOptionPane.showInputDialog("Enter the diameter of the sphere: ");
		
		//processing to aquire the volume of the sphere
		numDiameter = Double.parseDouble(strDiameter);
		radius = numDiameter / 2.0;
		volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		
		//Outputs the volume and the diameter
		JOptionPane.showMessageDialog(null, "Diameter: " + numDiameter + 
		"\nSphere volume is: " + sphereOutput.format(volume));	
	}//this method calculates volume of a sphere based on user input of the diameter
}//end of class
		
		