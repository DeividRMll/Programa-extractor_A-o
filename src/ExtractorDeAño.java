import java.util.Scanner;	

public class ExtractorDeAño {
 
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //by monitoring processes, the exercise is constructed based on the following description
        // Read user input 

 
        System.out.print("Enter the ID card number (11 digits): ");
        String numeroID = scanner.nextLine();

// Validate that it has exactly 11 digits and does not start with 0
        
if (numeroID.length() == 11 && numeroID.charAt(0) != '0') {
            // Extract the first two digits (the year)
            String año = numeroID.substring(0, 2);
  
//Applying the construction models of methods and conditionals, if is used to establish the description

           // Convert to integer and display 
            int añoEntero = Integer.parseInt(año);
            System.out.println(añoEntero);
        } else {
            System.out.println("Invalid number. Must have exactly 11 digits and not begin with 0 ");
        }
	}
	
}



