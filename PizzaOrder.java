//Robert Payne
//L02
//5/31/2012
//Task 3

//This program allows the user to order a pizza
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

//TASK #5 add an import statement to use the DecimalFormat class

public class PizzaOrder
{
	public static void main (String [] args)
	{
		//TASK #5 Create a DecimalFormat object with 2 decimal places
		DecimalFormat pizzaCost = new DecimalFormat("#,###,##0.00");


		//Create an instance of a Pizza
		Pizza order = new Pizza ();

		String firstName;		//user's first name
		boolean discount = false;//flag, true if user is eligible for discount
		int inches;				//size of the pizza
		char crustType;			//type of crust
		double cost, total;			//cost of the pizza
		final double TAX_RATE = .08;//sales tax rate
		double tax;				//amount of tax
		char choice;			//user's choice
		String input;			//user input
		String toppings = "Cheese ";//list of toppings
		int numberOfToppings = 0;	//number of toppings
		
		//prompt user and get first name		
		firstName = JOptionPane.showInputDialog("Welcome Mike and Diane's Pizza!\nEnter "
							+ "your first name, please.");

		//determine if user is eligible for discount by
		//having the same first name as one of the owners
		//ADD LINES HERE FOR TASK #1
		firstName = firstName.toUpperCase();
		if(firstName.compareTo("MIKE") == 0 || firstName.compareTo("DIANE") == 0)
				discount = true;
			
		//prompt user and get pizza size choice
		input = JOptionPane.showInputDialog("Pizza Size (inches)   Cost\n"
													+ "        10            $10.99\n"
													+ "        12            $12.99\n"
													+ "        14            $14.99\n"
												 	+ "        16            $16.99\n"
													+ "What size pizza would you like? [Enter number only]");
		inches = Integer.parseInt(input);

		//set size of pizza ordered
		//ADD LINES HERE FOR TASK #2
		switch(inches)
		{
			case 10: order.setCost(-2);
						order.setSize(10);
						break;
			case 12:
						break;
			case 14: order.setCost(2);
						order.setSize(14);
						break;
			case 16: order.setCost(4);
						order.setSize(16);
						break;
			default: JOptionPane.showMessageDialog(null, "Incorrect Pizza Size; Your pizza will be made 12 inch");	
		}
			
		//prompt user and get crust choice
		input = JOptionPane.showInputDialog("What type of crust do you want?\n"
													+ "(H) Hand-tossed\n(T) Thin-crust\n(D) Deep-dish\n"
													+ "[enter H, T, or D]");
		input = input.toUpperCase();
		crustType = input.charAt(0);

		//set user's crust choice on pizza ordered
		//ADD LINES FOR TASK #3 
		switch(crustType)
		{
			case 'H':	order.setCrust("Hand-tossed");
							break;
			case 'T':	order.setCrust("Thin-crust");
							break;
		 	case 'D': 	order.setCrust("Deep-dish");
							break;
			default:		JOptionPane.showMessageDialog(null, "Invalid crust type; hand tossed it is!");
		}
		
		//prompt user and get topping choices one at a time
		JOptionPane.showMessageDialog(null,"All pizzas come with cheese."
				+ "\nAdditional toppings are $1.25 each,"
				+ "\nchoose from"
				+ "\nPepperoni, Sausage, Onion, Mushroom");

		//if topping is desired,
		//add to topping list and number of toppings
		if(JOptionPane.showConfirmDialog(null, "Do you want Pepperoni?")==JOptionPane.YES_OPTION){
			numberOfToppings += 1;
			toppings = toppings + "Pepperoni ";
		} 
		if(JOptionPane.showConfirmDialog(null, "Do you want Sausage?")==JOptionPane.YES_OPTION){
			numberOfToppings += 1;
			toppings = toppings + "Sausage ";
		} 
		if(JOptionPane.showConfirmDialog(null, "Do you want Onion?")==JOptionPane.YES_OPTION){
			numberOfToppings += 1;
			toppings = toppings + "Onion ";
		} 
		if(JOptionPane.showConfirmDialog(null, "Do you want Mushroom?")==JOptionPane.YES_OPTION){
			numberOfToppings += 1;
			toppings = toppings + "Mushroom ";
		} 
		

		//set number of toppings and topping list on pizza ordered
		order.setNumToppings (numberOfToppings);
		order.setToppingList(toppings);

		//add additional toppings cost to cost of pizza
		order.setCost(1.25*numberOfToppings);
		
		//display order confirmation
		JOptionPane.showMessageDialog(null,"Your order is as follows:\n"
											+ order.getSize() + " inch pizza\n"
											+ order.getCrust() + " crust\n"
											+ order.getToppingList());
		

		//apply discount if user is elibible
		//ADD LINES FOR TASK #4 HERE
		if(discount)
		{
			order.setCost(-2);
			JOptionPane.showMessageDialog(null,"You are eligible for a $2.00 Discount!");
		}
		cost = order.getCost();

		tax = cost * TAX_RATE;
		total = tax+cost;
		//EDIT PROGRAM FOR TASK #5
		//SO ALL MONEY OUTPUT APPEARS WITH 2 DECIMAL PLACES
		
		JOptionPane.showMessageDialog(null, "The cost of your order is: $" + pizzaCost.format(cost)
											+ "\nThe tax is:  $" + pizzaCost.format(tax)
											+ "\nThe total due is:  $" + pizzaCost.format(total)
											+ "\nYour order will be ready for pickup in 30 minutes.");
	}
}